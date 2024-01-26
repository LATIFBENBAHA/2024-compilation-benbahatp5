#!/bin/bash

java -jar sablecc/sablecc.jar src/postfix.cfg

cd src
javac Compiler.java
cd ..
