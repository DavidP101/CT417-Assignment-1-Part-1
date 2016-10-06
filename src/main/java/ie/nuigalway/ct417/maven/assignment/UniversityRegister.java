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
public class UniversityRegister {

private final List<CourseProgramme> course = new ArrayList<>();  

public void addCourse(CourseProgramme course){
    this.course.add(course);
}

public void printCoursesInformation(){
    System.out.println("University Register\n");
    for (int i=0; i<course.size(); i++){
        this.course.get(i).printModules();
    }
}


}
