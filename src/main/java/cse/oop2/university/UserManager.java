/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namw2
 */
public class UserManager {

    private List<User> users; //사용자들을 저장할 리스트 (객체1, 객체2, 객체3 ,....) 
    //이렇게 하면 상속을 한 이유가 없는데 각 객체별로 리스트 한개씩 만들기?
    //그냥 user에 type 변수 만들어서 해도 될듯?

    public UserManager() {//생성자
        users = new ArrayList<>();
    }

    // 사용자 추가 메소드
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getClass().getSimpleName() + " 추가: " + user.id);
    }

    // 사용자 삭제 메소드
    public void deleteUser(String id) {
        User userToDelete = null;
        for (User user : users) { //리스트 검색 users list내의 모든 user 순차적으로 검색
            if (user.id.equals(id)) { //아이디 비교
                userToDelete = user; //아이디 있으면 임시로 저장
                break;
            }
        }
        if (userToDelete != null) {
            users.remove(userToDelete); //유저 삭제
            System.out.println(userToDelete.getClass().getSimpleName() + " 삭제: " + userToDelete.id);
        } else {
            System.out.println("해당 ID의 사용자가 존재하지 않습니다: " + id);
        }
    }

    // 모든 사용자 정보 출력 메소드
    // 사용자 분류별로 나눠서 출력
    
    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {

            System.out.println("------------------Student------------------");
            for (User user : users) {
                if (user.getClass().getSimpleName().equals("Student")) {
                    user.showUserInfo();
                    System.out.println(" ");
                }
            }

            System.out.println("-----------------Professor-----------------");
            for (User user : users) {
                if (user.getClass().getSimpleName().equals("Professor")) {
                    user.showUserInfo();
                    System.out.println(" ");
                }
            }

            System.out.println("---------------BachelorEmployee---------------");
            for (User user : users) {
                if (user.getClass().getSimpleName().equals("BachelorEmployee")) {
                    user.showUserInfo();
                    System.out.println(" ");
                }
            }

            System.out.println("----------------ClassEmployee----------------");
            for (User user : users) {
                if (user.getClass().getSimpleName().equals("ClassEmployee")) {
                    user.showUserInfo();
                    System.out.println(" ");
                }
            }

            System.out.println("----------------------------------------------");

            /**
             * 이거는 그냥 다 출력해버리는 코드 - 분류 안해줌 
             * for (User user : users) {
             * System.out.println("-----------" +
             * user.getClass().getSimpleName() + "-----------");
             * user.showUserInfo();
             * System.out.println("---------------------------------"); }
             */
        }
    }

    //비밀번호 변경 메서드
    public void ChangePassword(String id, String originalPassword, String ChangePassword) { //바꿀 사용자, 원래 비번, 바꿀 비번
        User userToChange = null;
        for (User user : users) {
            if (user.id.equals(id)) {
                userToChange = user; //바꿀 사용자 임시 저장
                break;
            }
        }
        if (userToChange != null && userToChange.password.equals(originalPassword)) { //비번 바꾸려는 사용자가 없거나 원래 비번이 다르면 실패
            //원래비번이랑 바꿀비번 한번에 처리하는 이유는 보통 웹사이트 다 그렇게 하니까 묶어서 사용
            for (User user : users) {
                if (user.id.equals(id)) {
                    user.ChangePW(ChangePassword);
                    break;
                }
            }
            System.out.println("비밀번호를 성공적으로 변경하였습니다.");
        } else {
            System.out.println("비밀번호 변경에 실패했습니다.");
        }
    }

    //사용자 존재하는지 확인하는 메서드 
    //1= 사용자 있음 0= 사용자 없음
    public int UserCheck(String id) {

        for (User user : users) {
            //System.out.println(user);
            if (user.id.equals(id)) {
                return 1; //사용자 존재
            }
        }

        return 0;
    }

}
