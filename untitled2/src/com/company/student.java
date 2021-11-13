package com.company;

public class student {
    //States
    private String studentfirstname;
    private String studentlastname;
    private int studentage;
    private String rb;

    //Constructor
    public student (String fname, String lname, int sage, String recordbook){
        studentfirstname = fname;
        studentlastname = lname;
        studentage = sage;
        rb = recordbook;
    }
    //Behaviour
    public String getstudentfirstname(){
        return studentfirstname;
    }
    public String getstudentlastname(){
        return studentlastname;
    }
    public int getstudentage(){
        return studentage;
    }
    public String getrb(){
        return rb;
    }
}
