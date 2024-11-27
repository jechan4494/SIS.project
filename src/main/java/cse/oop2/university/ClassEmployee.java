/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

/**
 *
 * @author namw2
 */
public class ClassEmployee extends User{
    
    public ClassEmployee(String id, String password,String name, String number, int Major, String Security_num, String address, String email) {
        super(id, password,name,number, Major ,Security_num,address, email);
        permission = 3;
    }
    
}
