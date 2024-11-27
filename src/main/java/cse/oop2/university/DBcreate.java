/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.university;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //엑셀 사용 임포트

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;     //예외처리 임포트

/**
 *
 * @author namw2
 */


/**
 * 이거 기준을 학번이 안겹치니까 학번을 기준으로 분류하는 코드 만들어야 할듯
 * 그리고 좀 많이 갈아 엎어야 할거같음
 * row = 행 
 * for (Cell cell : row): 각 행 내의 셀(Cell)을 순회합니다.
 * cell.getCellType() - 타입 얻기
 * cell.getStringCellValue() - 문자열 값 출력 / cell.getNumericCellValue() 정수형 값 출력
 * 
 * 
 */

public class DBcreate {
    public void testDB() {
        try {
            // Excel 파일 경로 설정
            FileInputStream file = new FileInputStream(new File("user.xlsx"));
            
            // 워크북 생성 - 작업하기 위해 사용
            Workbook workbook = new XSSFWorkbook(file);
            
            // 첫 번째 시트 가져오기 - 첫페이지 가져오기
            Sheet sheet = workbook.getSheetAt(0);
            
            //여기 위에는 그대로 쓰면 됨
            
            // 모든 행과 열을 순회하며 출력
            for (Row row : sheet) { //각 행 
                for (Cell cell : row) {
                    // 셀의 타입에 따라 값을 출력
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println();
            }

            
            for (Row row : sheet) { //각 행 
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println();
            }

            // 파일 닫기
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
