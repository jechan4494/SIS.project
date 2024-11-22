/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

/**
 *
 * @author namw2
 */
public class Professor extends User{
    
    private String Major;
    
    public Professor(String id, String password, String email) {
        super(id, password, email);
        permission = 2;
    }
    
}
