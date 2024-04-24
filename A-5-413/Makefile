# Define a makefile for Java compilation and execution workflow

# Variables
JAVAC=javac
JAVA=java
SRC=*.java
MAIN=Main
BUILDER= BankCustomerTest
CLASS=*.class

# Default target
all: compile

# Compile Java files
compile:
	$(JAVAC) $(SRC)

# Run the main Java class
run:
	$(JAVA) $(MAIN)

# Run the main Java class
BuilderTest:
	$(JAVA) $(BUILDER)

# Clean the directory of class files
clean:
	rm -rf $(CLASS)

# .PHONY is used to reserve targets as they are not file names.
.PHONY: all compile run clean
