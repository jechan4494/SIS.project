/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

/**
 *
 * @author namw2
 */
public class Student extends User {

  
    private int grade; //학년

    public Student(String id, String password, String email) {
        super(id, password, email);
        permission = 1;
    }

}
