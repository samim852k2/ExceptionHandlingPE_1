package practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileHelloWorld {
    public static void main(String[] args) throws FileNotFoundException
        {
            // Open A File with the name file_name_hello.txt, write something, and then close it
           File file = new File("C:/Users/DELL/Desktop/ExceptionHandaling/Assingment/src/hello.txt");


            try(PrintWriter out = new PrintWriter(file))
            {
                out.println("Hello World");
            }

            // Open the same file and read it
            try(Scanner in = new Scanner(file))
            {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
}
