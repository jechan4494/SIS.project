/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;



public class Student extends Person {
    public Student(String id, String name, String department, String ssn) {
        super(id, name, department, ssn);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
