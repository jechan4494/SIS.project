/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;

import java.util.Scanner;

/**
 *
 * @author namw2
 */
public class Dolist {
// (사용자 추가 및 제거 입력 받기)
// .matches("^\\d+$") 정수인지 확인하는거

    public Dolist() {
    }

    public void dolist() { //기능 목록 제시
        Scanner scanner = new Scanner(System.in); //입력 받기 위한 scanner
        UserManager userManager = new UserManager();
        boolean running = true;
        User currentUser = null; //TODO 로그인 기능이랑 결합할때 사용 - 당장 미사용

        loop1: //가장 밖으로 탈출하기 위한 위치
        while (running) {
            System.out.println("\n[사용자 관리 메뉴]");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 삭제");
            System.out.println("3. 사용자 비밀번호 변경");
            System.out.println("4. 사용자 목록");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            String choice = scanner.nextLine(); //입력 받기
            if (!(choice.matches("^[0-9]*$")) && choice.equals("")) { //필요 없음
                System.out.print("잘못된 선택입니다. 다시 시도하세요");
                continue loop1;
            }
            int choice1 = Integer.parseInt(choice);
            //scanner.nextLine();  // 버퍼 비우기

            //loop2 필요시 loop2도 사용 - 최대한 안쓰는게 좋음(스파게티 코드)
            switch (choice1) {
                case 1: // 사용자 추가

                    System.out.print(" 1.student\n 2.professor\n 3.bachelorEmployee\n 4.classEmployee\n 5.메뉴로 돌아가기\n 사용자 유형을 선택하세요: ");

                    String userType = scanner.nextLine(); //입력 받기위해서 작성한거
                    int userType1 = Integer.parseInt(userType); //string으로 받아서 정수로 변형 - gui가 어떻게 작동하는지는 모르겠지만 이렇게 할 필요 없을수도 있음
                    //System.out.print(userType1);
                    if (userType1 == 5) { //5번 클릭하면 어기서 가장 먼저 해결하기
                        //만약 case 5: 사용하면 중간에 필요없는 과정이 들어가게 됨
                        continue loop1;
                    }

                    String id = null; //임시 저장 공간
                    String password = null;
                    String name = null;     //이름
                    String number = null;   //학번 - 영어 들어가서 string 사용 
                    String MajorString = null;
                    int Major = 0;          //전공
                    String Security_num = null; //주민번호
                    String address = null;      //주소
                    String email = null;        //메일

                    System.out.print("ID&학번: ");
                    id = scanner.nextLine();

                    switch (userType1) {
                        case 1:
                            if (!(id.startsWith("S") && id.length() == 4 && id.substring(1, 4).matches("^\\d+$"))) {
                                //정해진 시작 알파벳검사 + 길이 검사 + 뒷3자리 숫자인지 검사
                                System.out.print("잘못된 아이디 방식입니다.");
                                continue loop1; //일단은 가장 밖으로 탈출하는데 필요시 위치 변경하면 됨
                            }
                            break;
                        case 2:
                            if (!(id.startsWith("P") && id.length() == 4 && id.substring(1, 4).matches("^\\d+$"))) {
                                System.out.print("잘못된 아이디 방식입니다.");
                                continue loop1;
                            }
                            break;
                        case 3:
                            if (!(id.startsWith("G") && id.length() == 4 && id.substring(1, 4).matches("^\\d+$"))) {
                                System.out.print("잘못된 아이디 방식입니다.");
                                continue loop1;
                            }
                            break;
                        case 4:
                            if (!(id.startsWith("H") && id.length() == 4 && id.substring(1, 4).matches("^\\d+$"))) {
                                System.out.print("잘못된 아이디 방식입니다.");
                                continue loop1;
                            }
                            break;

                        /**
                         * case 5: //쓸일 없음 System.out.print("종료"); //choice =
                         * null; continue loop1; //루프1로 돌아가기전에 ID입력창이 뜸 -
                         * 실행순서때문에 그럼
                         */
                        default:
                            System.out.println("잘못된 선택입니다. 다시 시도하세요.");

                    }
                    
                    number = id;
                    
                    System.out.print("Password&주민등록번호: ");
                    password = scanner.nextLine();
                    if (!(password.length() == 7 && password.matches("^\\d+$"))) { //비밀번호 길이(주민등록번호 7자리)+정수인지 검사
                        System.out.print("잘못된 비밀번호 방식입니다.");
                        //초기 암호만 입력해주는거니까 무조건 주민번호 뒷자리여야하고 정수형인지 확인하는 이유임
                        // 나중에 비번 변경시에는 문자 사용 가능
                        continue loop1;
                    }
                    
                    Security_num = password;
                    
                    //id, password,name,number, Major ,Security_num,address, email
                    System.out.print("이름: ");
                    name = scanner.nextLine();

                    /**
                    System.out.print("학번: ");
                    number = scanner.nextLine();
                    */
                    
                    System.out.print("전공: ");
                    MajorString = scanner.nextLine(); //아마 버퍼 문제같은데 바로 int형으로 받으면 뭔가 이상해짐
                    Major = Integer.parseInt(MajorString);

                    
                    /**
                    System.out.print("주민등록번호 뒷7자리: ");
                    Security_num = scanner.nextLine();
                    */
                    
                    
                    System.out.print("주소: ");
                    address = scanner.nextLine();

                    System.out.print("Email: ");
                    email = scanner.nextLine();
                    if (!(email.endsWith(".com") && email.contains("@"))) { //메일 맞는지 검사'
                        //제대로 된 검사는 아님 마지막 뒷문자가 .com인지 확인과 문자 사이에 @들어가 있는지 검사하는 코드임
                        //ex= @12313124.com해도 내부적으로 제대로 된 이메일로 처리함
                        //TODO 정규표현식 찿아보기 -  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";) ->이거도 유효한 이메일인지는 확인 못함
                        System.out.print("잘못된 메일 방식입니다.");
                        continue loop1;
                    }

                    User user = null; //리스트에 추가할 객체 임시 저장

                    switch (userType1) {
                        case 1:
                            user = new Student(id, password, name, number, Major, Security_num, address, email); //위에 만든 임시저장공간에 각 사용자별 아이디 비번 메일 넣음
                            break;
                        case 2:
                            user = new Professor(id, password, name, number, Major, Security_num, address, email);
                            break;
                        case 3:
                            user = new BachelorEmployee(id, password, name, number, Major, Security_num, address, email);
                            break;
                        case 4:
                            user = new ClassEmployee(id, password, name, number, Major, Security_num, address, email);
                            break;
                        case 5:
                            continue loop1; //다시 처음으로 돌아감
                        default:
                            System.out.println("잘못된 사용자 유형입니다.");
                            continue;
                    }
                    userManager.addUser(user); //위의 임시저장공간의 객체를 리스트에 추가
                    break;

                case 2: // 사용자 삭제
                    System.out.print("삭제할 사용자 ID: ");
                    String deleteId = scanner.nextLine();
                    userManager.deleteUser(deleteId);
                    break;

                case 3://비밀번호 변경
                    String idToChange = null,
                     OriginalPW = null,
                     ChangePW = null; //바꿀 사용자 아이디, 사용자 원래 비번, 사용자 바꿀 비번

                    System.out.println("변경할 사용자의 아이디를 입력해주세요");
                    idToChange = scanner.nextLine();
                    if (userManager.UserCheck(idToChange) != 1) { //바꿀 사용자가 존재하는지 검사
                        System.out.println("해당 사용자는 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("원래 비밀번호를 입력해주세요");
                    OriginalPW = scanner.nextLine();
                    System.out.println("바꿀 비밀번호를 입력해주세요");
                    ChangePW = scanner.nextLine();

                    userManager.ChangePassword(idToChange, OriginalPW, ChangePW); //위에서 문제 없으면 비번 변경
                    break;

                case 4: // 모든 사용자 정보 보기
                    userManager.showAllUsers();
                    break;

                case 5: // 종료
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
