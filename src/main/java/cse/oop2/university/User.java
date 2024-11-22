/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

/**
 *
 * @author namw2
 */
public class User {
    
    //아이디,비밀번호,메일
    //permission = 권한 -> 권한에 따라 할수 있는 일을 제한 할수 있음 
    //student = 1, profeesor = 2 , employee = 3, 필요시 권한 추가 
    protected String id;
    protected String password;
    protected String email;
    protected int permission; //아직 선언만 하고 따로 건들지는 않음

    // 생성자
    public User(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    //권한 설정 메소드 - 아직 안씀
    public void setPermission(int permission) {
        this.permission = permission;
    }

    // 사용자 정보 출력 메소드
    public void showUserInfo() {
        System.out.println("ID: " + id);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }

    //비번 변경 메소드
    public void ChangePW(String password) {
        this.password = password;
    }

}

