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
        System.out.println(this.studentList.get(i).getName());
    }
}
}

