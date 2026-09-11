#!/bin/sh
set -e
mkdir -p out
find src -name '*.java' > sources.txt
javac -d out @sources.txt tests/SmartSpendTest.java
java -cp out com.smartspend.Main
