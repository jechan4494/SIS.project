/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse.oop2.university;

/**
 *
 * @author namw2
 * 
 * 만들어야할거= 권한에 따라 할수있는일 구분짓기, 객체에 전공 추가, 메일 연결(일단 메일 저장 공간은 만들긴 함), 아이디 비번 메일 중복검사,쓸모 없는 주석 지우기
 * 애매한거= 로그인 기능, 버퍼비우기->이거 왠지 문제 생길거 같음
 * 하면 좋은거= 중복되는 코드 메소드화(아이디 규격 검사같은거) ,중복되는 기능이 있는지 확인(비슷한 기능인데 dolist랑 usermanager 둘다 들어가 있을수도 있음),메일이랑 연동해서 비밀번호 찾기?,예외처리 코드 작성, 최적화는 마지막에
 * 
 * 
 * 학생수 max치를 40000 정도로 잡기 -> 엄청나게 좋은 알고리즘 필요없음 최대 40000정도의 객체만 느리지 않게 처리 가능하면 됨
 */

//TODO 모든 리스트를 다시 엑셀 파일로 수정하기
//TODO 권한을 통해 할수있는일과 없는일 구분하기(ex 학생은 다름사람의 비번을 변경하면 안되지만 교수나 직원은 다른 사람의 아이디를 변경 가능하게 해야함)


// 사용자 유형/이름  / 학번 / 전공 / 주민등록번호 / 주소 / 메일 /
// Student  /홍길동 / 123 / 전산학과 / 000000 - 1234567 / asdaf@naver.com

public class University { //main은 깔끔하게 만들기

    public static void main(String[] args) {
        Dolist a = new Dolist();
        a.dolist();
    }
}
