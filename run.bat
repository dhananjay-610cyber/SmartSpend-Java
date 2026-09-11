@echo off
if not exist out mkdir out
(for /r src %%f in (*.java) do @echo %%f) > sources.txt
javac -d out @sources.txt tests\SmartSpendTest.java
if errorlevel 1 exit /b 1
java -cp out com.smartspend.Main
