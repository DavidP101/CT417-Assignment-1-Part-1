/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.ct417.maven.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Module {

private final String name;    
private final String id;
private final List<Student> studentList = new ArrayList<>();

public Module(String name, String id){
    this.name = name;
    this.id = id;
}

public String getName(){
    return this.name;
}

public String getID(){
    return this.id;
}

public void addStudent(Student s){
    this.studentList.add(s);
}

public void printStudents(){
    System.out.println("List of Students:");
    for (int i=0; i<this.studentList.size(); i++){
        System.out.println("Name: "+this.studentList.get(i).getName());
        System.out.println("ID: "+this.studentList.get(i).getID());
        System.out.println("Age: "+this.studentList.get(i).getAge());
        System.out.println("DOB: "+this.studentList.get(i).getDateOfBirth());
        System.out.println("Username: "+this.studentList.get(i).getUsername());
    }
}
}

