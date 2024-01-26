#!/bin/bash

# Set the path to the Compiler class
COMPILER_CLASS="Compiler"

# Set the path to the source code directory
SRC_DIR="src"

# Set the path to the test input directory
TEST_DIR="test/input"

# Set the verbose level
VERBOSE_LEVEL=2

# Iterate over each file in the test input directory
for file in "$TEST_DIR"/*.l; do
    echo "Testing file: $file"
    java -cp "$SRC_DIR" "$COMPILER_CLASS" "$file" -v "$VERBOSE_LEVEL"
    echo "----------------------------------"
done
