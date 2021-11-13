package com.company;

import java.util.ArrayList;
import java.util.List;

public class recordcatalogue {
    //States
    private List <student> students;

    //Constructor
    public recordcatalogue (){
        students = new ArrayList<>();
    }

    //Behaviour
    public List <student> getStudents(){
        return students;
    }

}
