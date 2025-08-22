@echo off
REM --- Rodar JavaFX em qualquer PC, qualquer pasta, sem erros de src ---

REM Pergunta o caminho do JavaFX SDK
:ASK_SDK
set /p JAVAFX_PATH=Digite o caminho completo do JavaFX SDK (pasta lib): 
if not exist "%JAVAFX_PATH%" (
    echo Caminho invalido! Tente novamente.
    goto ASK_SDK
)

REM --- Detecta a pasta src ---
set SRC_PATH=
if exist "%~dp0src" (
    set "SRC_PATH=%~dp0src"
) else if exist "%~dp0" (
    set "SRC_PATH=%~dp0"
)

REM Verifica se encontrou src
if not exist "%SRC_PATH%" (
    echo Pasta src nao encontrada!
    pause
    exit /b
)

pushd "%SRC_PATH%"

REM Lista arquivos .java
echo.
echo Classes disponiveis:
setlocal enabledelayedexpansion
set i=0
for %%f in ("*.java") do (
    set /a i+=1
    set "FILE[!i!]=%%~nf"
    echo !i!: %%~nf
)

REM Pergunta qual classe rodar
echo.
set /p CHOICE=Digite o numero da classe que deseja rodar: 
set "CLASSNAME=!FILE[%CHOICE%]!"

if "%CLASSNAME%"=="" (
    echo Numero invalido! Encerrando...
    pause
    popd
    exit /b
)

echo.
echo Compilando %CLASSNAME%.java ...
javac --module-path "%JAVAFX_PATH%" --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web "%CLASSNAME%.java"
if errorlevel 1 (
    echo Erro na compilacao!
    pause
    popd
    exit /b
)

echo.
echo Rodando %CLASSNAME% ...
java --enable-native-access=javafx.graphics --module-path "%JAVAFX_PATH%" --add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web "%CLASSNAME%"

echo.
echo --- Execucao finalizada ---
pause
popd
