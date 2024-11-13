/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;

import java.util.*;




public class SchoolSystem {
    private List<Person> persons; // 학생과 교수들을 저장할 리스트

    // 학과 목록
    private static final Set<String> DEPARTMENTS = new HashSet<>(Arrays.asList(
        "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과"
    ));

    public SchoolSystem() {
        persons = new ArrayList<>();
    }

    // 사용자 추가
    public void addPerson(Person person) {
        if (DEPARTMENTS.contains(person.getDepartment())) {
            persons.add(person);
            System.out.println(person.getRole() + " added: " + person);
        } else {
            System.out.println("Invalid department.");
        }
    }

    // 사용자 삭제 (학번/교수 번호로 삭제)
    public boolean removePerson(String id) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId().equals(id)) {
                iterator.remove();
                System.out.println(person.getRole() + " removed: " + person);
                return true;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
        return false;
    }

    // 사용자 정보 수정 (학번/교수 번호로 수정)
    public boolean updatePerson(String id, String name, String department, String ssn) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                if (DEPARTMENTS.contains(department)) {
                    person.setName(name);
                    person.setDepartment(department);
                    person.setSsn(ssn);
                    System.out.println(person.getRole() + " updated: " + person);
                    return true;
                } else {
                    System.out.println("Invalid department.");
                    return false;
                }
            }
        }
        System.out.println("Person with ID " + id + " not found.");
        return false;
    }

    // 사용자 검색 (학번/교수 번호로)
    public Person searchPersonById(String id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
        return null;
    }

    // 전체 사용자 목록 출력
    public void listAllPersons() {
        if (persons.isEmpty()) {
            System.out.println("No persons registered.");
        } else {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }
}
