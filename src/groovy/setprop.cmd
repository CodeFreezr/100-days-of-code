@echo off
SET JAVA_TOOL_OPTIONS="%1" & REM Proc-Inside
SETX JAVA_TOOL_OPTIONS "%1" & REM User-Setting