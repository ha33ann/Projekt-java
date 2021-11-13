package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {
        student s1 = new student("John", "One", 20, "Godkänt");
        student s2 = new student("Jack", "Two", 21, "Icke Godkänt");
        student s3 = new student("Josh", "Three", 22, "Godkänt");
        student s4 = new student("James", "Four", 23, "Godkänt");
        student s5 = new student("Jeremy", "Five", 24, "Icke Godkänt");

        System.out.println(s1.getstudentfirstname() +" " +s1.getstudentlastname() +" " +s1.getstudentage() +" "+ s1.getrb());
        System.out.println(s2.getstudentfirstname() +" " +s2.getstudentlastname() +" " +s2.getstudentage() +" "+ s2.getrb());
        System.out.println(s3.getstudentfirstname() +" " +s3.getstudentlastname() +" " +s3.getstudentage() +" "+ s3.getrb());
        System.out.println(s4.getstudentfirstname() +" " +s4.getstudentlastname() +" " +s4.getstudentage() +" "+ s4.getrb());
        System.out.println(s5.getstudentfirstname() +" " +s5.getstudentlastname() +" " +s5.getstudentage() +" "+ s5.getrb());

        System.out.println();

        File file = new File("C:\\Users\\hassa\\Desktop\\studentnames.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }



    }
}
