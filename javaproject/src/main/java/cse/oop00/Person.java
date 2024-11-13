/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;

public abstract class Person {
    protected String id;        // 학번 또는 교수 번호
    protected String name;      // 이름
    protected String department; // 학과
    protected String ssn;       // 주민번호

    // 생성자
    public Person(String id, String name, String department, String ssn) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.ssn = ssn;
    }

    // getter와 setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", SSN: " + ssn;
    }

    // 추상 메서드 (학생과 교수는 다른 처리 로직을 가질 수 있음)
    public abstract String getRole();
}
