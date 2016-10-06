/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.ct417.maven.assignment;

/**
 *
 * @author David
 */
public class Student {

private final String name;
private final int age;
private final int id;
private final String dateOfBirth;
private final String username;

public Student(String name, int age, int id, String dateOfBirth){
this.name = name;    
this.age = age;
this.id = id;
this.dateOfBirth = dateOfBirth;
this.username = name+"-"+id;
}

public String getUsername(){
    return this.username;
}

public String getName(){
    return this.name;
}

public int getAge(){
    return this.age;
}

public String getDateOfBirth(){
    return this.dateOfBirth;
}

public int getID(){
    return this.id;
}

}

