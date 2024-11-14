/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop00;

import java.util.*;




public class SchoolSystem {
    private List<Person> persons; 

 
    private static final Set<String> DEPARTMENTS = new HashSet<>(Arrays.asList(
        "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과"
    ));

    public SchoolSystem() {
        persons = new ArrayList<>();
    }

    
    public void addPerson(Person person) {
        if (DEPARTMENTS.contains(person.getDepartment())) {
            persons.add(person);
        } else {
            System.out.println("Invalid department.");
        }
    }

    
    public boolean removePerson(String id) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
        return false;
    }

   
    public boolean updatePerson(String id, String name, String department, String ssn) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                if (DEPARTMENTS.contains(department)) {
                    person.setName(name);
                    person.setDepartment(department);
                    person.setSsn(ssn);
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

    
    public Person searchPersonById(String id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
        return null;
    }

    
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
