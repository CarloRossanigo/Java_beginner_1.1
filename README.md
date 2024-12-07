## Java_beginner_1.1
The project aims to solve the exercise described in the PDF: we want to define classes for managing flights and passengers.
## Compiling and Running the Project
To compile and run this project, you can use the javac and java commands from the terminal.

## Compiling the Java Files
First, you need to compile the Java files using the javac command. 
Open your terminal, navigate to the directory containing the Java files, and run the following command:

javac *.java
This command compiles all .java files in the current directory. If you want to compile only specific files  you can run:
javac Esercizio1.java

This will compile the Java files related to the project, including all classes that are involved (such as Volo, Passeggero, GestoreVoli, etc.).
The result will be the creation of .class files for each class in the project.

## Understanding the Compilation Process
In Java, the compilation process takes the source code written in .java files and converts it into bytecode, stored in .class files. 
These .class files are then executed by the Java Virtual Machine (JVM) when you run the application using the java command. 
The classes that are compiled first (e.g., Esercizio1,Esercizio2,Esercizio3) will also automatically compile any other related classes they depend on (e.g., Data, Volo, etc.), ensuring that the entire project is built correctly.
