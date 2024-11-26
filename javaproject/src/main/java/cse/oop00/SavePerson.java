/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author hanjaejin
 */
public class SavePerson {
    ArrayList<Person> personList = new ArrayList<>();
    String paths = System.getProperty("user.dir");
    File personFile = new File(paths + "/PersonList.txt");
    
    public SavePerson(Person person){
        String personData = String.join("\t",
            person.getOccupation(),
            person.getId(),
            person.getName(),
            person.getDepartment(),
            person.getSsn()
            );
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(personFile,true))){
            writer.write(personData);
            writer.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
