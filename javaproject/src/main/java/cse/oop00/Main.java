/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.oop00;




public class Main {
    public static void main(String[] args) {
        SchoolSystem system = new SchoolSystem();

        // 학생 추가
        system.addPerson(new Student("202301", "한재진", "전산학과", "123456-1234567"));
        system.addPerson(new Student("202302", "정찬", "전자공학과", "234567-2345678"));
        system.addPerson(new Student("202302", "권상우", "전산학과", "563482-2345678"));

        // 교수 추가
        system.addPerson(new Professor("P001", "남성우", "기계공학과", "345678-3456789"));
        system.addPerson(new Professor("P002", "박성연", "화학공학과", "456789-4567890"));

        // 전체 목록 출력
        system.listAllPersons();

        // 학생 정보 수정
        system.updatePerson("202301", "이규찬", "전산학과", "123456-1234567");

        // 교수 정보 수정
        system.updatePerson("P001", "심동진", "기계공학과", "345678-3456789");

        // 사용자 검색
        Person person = system.searchPersonById("202301");
        if (person != null) {
            System.out.println("Found: " + person);
        }

        // 사용자 삭제
        system.removePerson("202302");

        // 전체 목록 출력
        system.listAllPersons();
    }
}
