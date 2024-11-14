package cse.oop2.cho2.movie;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    // 사용자 데이터베이스 (id, password, role)
    static HashMap<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        // 사용자 초기화 (예시 데이터)
        users.put("admin", new User("admin", "admin123", "관리자"));
        users.put("user1", new User("user1", "password1", "일반 사용자"));
        users.put("user2", new User("user2", "password2", "일반 사용자"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 로그인 시스템 ===");

        // 로그인 프로세스
        System.out.print("아이디: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        User user = authenticate(id, password);

        if (user != null) {
            // 권한에 따른 화면 출력
            if (user.getRole().equals("관리자")) {
                showAdminScreen();
            } else if (user.getRole().equals("일반 사용자")) {
                showUserScreen();
            }
        } else {
            // 로그인 실패 화면
            showLoginFailedScreen();
        }

        scanner.close();
    }

    // 사용자 인증 메서드
    public static User authenticate(String id, String password) {
        if (users.containsKey(id)) {
            User user = users.get(id);
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // 인증 실패
    }

    // 관리자 화면
    public static void showAdminScreen() {
        System.out.println("\n=== 관리자 화면 ===");
        System.out.println("관리자님, 환영합니다!");
        // 관리자 기능 추가 가능
    }

    // 일반 사용자 화면
    public static void showUserScreen() {
        System.out.println("\n=== 사용자 화면 ===");
        System.out.println("사용자님, 환영합니다!");
        // 사용자 기능 추가 가능
    }

    // 로그인 실패 화면
    public static void showLoginFailedScreen() {
        System.out.println("\n=== 로그인 실패 ===");
        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
    }
}

// 사용자 클래스 정의
class User {
    private String id;
    private String password;
    private String role;

    public User(String id, String password, String role) {
        this.id = id;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
