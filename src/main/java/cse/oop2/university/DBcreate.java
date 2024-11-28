/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //엑셀 사용 임포트

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;     //예외처리 임포트

/**
 *
 * 
 * @author namw2
 */


/**
 * 이거 기준을 학번이 안겹치니까 학번을 기준으로 분류하는 코드 만들어야 할듯
 * 그리고 좀 많이 갈아 엎어야 할거같음
 * row = 행 (가로) / cell = 엑셀에서 보이는 가장 작은 한칸
 * for (Cell cell : row): 각 행 내의 셀(Cell)을 순회.
 * 
 * cell.getCellType() - 값 형식 가져옴
 * cell.getStringCellValue() - 문자형 셀 출력
 * cell.getNumericCellValue() - 숫자형 셀 출력
 * sheet.getRow() - 행 가져오기
 * sheet.createRow() - 행 생성하기
 * row.getCell(0) - row의 셀 가져오기
 * row.CreateCell(0) - 셀 갱성하기
 * 
 * try (FileOutputStream fileOut = new FileOutputStream("user.xlsx")) {
                workbook.write(fileOut);
            } - workbook에서 변경된 사항을 외부 엑셀파일에 저장하긴
 * 주의: 엑셀 파일을 수정했으면 한번 저장후 workbook을 종료후 다시 로드하기
 * 
 */

public class DBcreate {//엑셀 파일 생성
    public void testDB() {
        try {
            // Excel 파일 경로 설정
            FileInputStream file = new FileInputStream(new File("user.xlsx"));
            
            // 워크북 생성 - 작업하기 위해 사용
            Workbook workbook = new XSSFWorkbook(file);
            
            // 첫 번째 시트 가져오기 - 첫페이지 가져오기
            Sheet sheet = workbook.getSheetAt(0);
            
            //여기 위에는 그대로 쓰면 됨
            

            // 파일 닫기
            workbook.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
