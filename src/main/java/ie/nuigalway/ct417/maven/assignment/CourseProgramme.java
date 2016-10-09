/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.ct417.maven.assignment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author David
 */
public class CourseProgramme {

private final String name;
private final DateTime startDate;
private final DateTime endDate;
private final List<Module> moduleList = new ArrayList<>();

public CourseProgramme(String name, DateTime startDate, DateTime endDate){
this.name = name;
this.startDate = startDate;
this.endDate = endDate;
}

public String getName(){
    return this.name;
}

public DateTime getStartDate(){
    return this.startDate;
}

public DateTime getEndDate(){
    return this.endDate;
}

public void addModule(Module m){
    this.moduleList.add(m);
}

public String formattedDate(DateTime date){
    return date.getDayOfYear()+"/"+date.getMonthOfYear()+"/"+date.getYear();
}

public void printModules(){
    System.out.println("Course Information");
    System.out.println("Name: "+this.getName());
    System.out.println("Start Date: "+formattedDate(getStartDate()));
    System.out.println("End Date: "+formattedDate(getEndDate()));
    System.out.println("List of Modules:");
    for (int i=0; i<this.moduleList.size(); i++){
        System.out.println("Name: "+this.moduleList.get(i).getName());
        System.out.println("ID: "+this.moduleList.get(i).getID());
        this.moduleList.get(i).printStudents();
    }
}

}
