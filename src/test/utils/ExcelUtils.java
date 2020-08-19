package utils;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pojos.UserTLA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtils {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Asus\\Desktop/userData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

//        int rowNum = sheet.getPhysicalNumberOfRows();
//        for (int i = 0; i < rowNum; i++){
//            Row row = sheet.getRow(i);
//            int cellCount = row.getPhysicalNumberOfCells();
//            for(int j = 0; j < cellCount; j++){
//                System.out.print(row.getCell(j) + " | ");
//            }
//            System.out.println();
//        }

//        Iterator<Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext()){
//            Row row = rowIterator.next();
//            Iterator<Cell> cellIterator = row.iterator();
//            while (cellIterator.hasNext()){
//                Cell cell = cellIterator.next();
//                System.out.print(cell + " | ");
//            }
//            System.out.println();
//        }
//        Sheet myGroupSheet = workbook.createSheet("My Group");
//        String[] header = {"First name", "email", "group name"};
//        Row row = myGroupSheet.createRow(0);
//        for (int i = 0; i < header.length; i++) {
//            row.createCell(i).setCellValue(header[i]);
//        }


//        Row row1 = myGroupSheet.createRow(1);
//        row1.createCell(0).setCellValue("Kuba");
//        row1.createCell(1).setCellValue("kuba@gmail.com");
//        row1.createCell(2).setCellValue("TLA");
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Asus\\Desktop/userData.xlsx");
//        workbook.write(fileOutputStream);
//
//            Faker faker = new Faker();
//            String firstname = faker.name().firstName();
//            String lastname = faker.name().lastName();
//            String phonenum = faker.phoneNumber().phoneNumber();
//            String email = faker.internet().emailAddress();

//        UserTLA userTLA = new UserTLA();
//            Sheet users = workbook.getSheet("Users");
//            String firstname = userTLA.getFirstName();
//          String lastname = userTLA.getLastName();
//            String phoneNumber = userTLA.getPhoneNumber();
//            String email = userTLA.getEmail();
//            Row row = users.createRow(0);
//            for(int i = 0; i < 20; i ++) {
//                row.createCell(i).setCellValue(userTLA.firstname);
//                row.createCell(i).setCellValue(lastname);
//                row.createCell(i).setCellValue(phoneNumber);
//                row.createCell(i).setCellValue(email);
//            }


    }
}
