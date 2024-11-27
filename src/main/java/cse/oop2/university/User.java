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
    protected int permission; //권한 - 아직 선언만 하고 따로 건들지는 않음

    // 사용자 유형/  이름  / 학번 /   전공   /    주민등록번호   / 주소        /   메일     
    // Student  / 홍길동 / S123 / 전산학과 / 000000 - 1234567 /  부산시 ~  / asdaf@naver.com
    //사용자 유형은 상속으로 처리
    protected String name; //이름
    protected String number; //학번/교수번호/직원번호
    protected int Major; //전공 - 숫자로 처리해도 됨  "전산학과 = 1", "전자공학과 = 2", "화학공학과 = 3", "기계공학과 = 4", "항공우주공학과 = 5"
    protected String Security_num; //주민등록번호
    protected String address; //주소
    protected String email; //메일

    // 생성자
    public User(String id, String password, String name, String number, int Major, String Security_num, String address, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.number = number;
        this.Major = Major;
        this.Security_num = Security_num;
        this.address = address;
        this.email = email;
    }

    /**
     * // 생성자 public User(String id, String password, String email) { this.id =
     * id; this.password = password; this.email = email; }
     */
    //권한 설정 메소드 - 아직 안씀
    public void setPermission(int permission) {
        this.permission = permission;
    }

    // 사용자 정보 출력 메소드
    public void showUserInfo() {
        System.out.println("ID: " + id);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("학번: " + number);
        System.out.println("이름: " + name);

        //"전산학과 = 1", "전자공학과 = 2", "화학공학과 = 3", "기계공학과 = 4", "항공우주공학과 = 5"
        switch (Major) {
            case 1:
                System.out.println("전공: 전산학과");
                break;
            case 2:
                System.out.println("전공: 전자공학과");
                break;
            case 3:
                System.out.println("전공: 화학공학과");
                break;
            case 4:
                System.out.println("전공: 기계공학과");
                break;
            case 5:
                System.out.println("전공: 항공우주학과");
                break;
            default:
                System.out.println("존재하지 않는 학과입니다.");
                break;
        }
        //System.out.println("전공: " + Major);
        System.out.println("주민등록번호: " + Security_num);
        System.out.println("주소: " + address);
    }

    //비번 변경 메소드
    public void ChangePW(String password) {
        this.password = password;
    }

    //권한 확인 메소드 - 단순히 권한 보여주는 메소드
    public int CheckPermission(User user) {
        return user.permission;
    }

}
