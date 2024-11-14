/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hanjaejin
 */
public class LoadPerson {
    ArrayList<Person> loadperson = new ArrayList<>();
    
    String paths = System.getProperty("user.dir");
    File PersonFile = new File(paths + "/PersonList.txt");
    
    public LoadPerson(DefaultTableModel model){
        LoadPersonList();
        for(int i=0;i<loadperson.size();i++){
            model.addRow(new Object[]{
                loadperson.get(i).getOccupation(),
                loadperson.get(i).getId(),
                loadperson.get(i).getName(),
                loadperson.get(i).getDepartment(),
                loadperson.get(i).getSsn()
            });
        }
    }
    
    private void LoadPersonList(){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(PersonFile))){//* 메모장에서 한 줄씩 불러옴
            while((line = br.readLine()) !=  null){
                String[] data = line.split("\t");
                loadperson.add(new Person(data[0],data[1],data[2],data[3],data[4]));
            
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
