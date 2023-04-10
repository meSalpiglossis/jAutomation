package src.main.java.maxima.temp.files;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class FileTools {

    public static void main(String[] args) {

//        FileInputStream fis = new FileInputStream("src\\config.properties");
//
//        Properties properties = new Properties();
//
//        properties.load(fis);
//
//        fis.close();
//
//        System.out.println(properties.get("user1.username"));




//=============================================================
        String filePath = "test.txt";


//        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter(filePath, true);
//            fileWriter.write("log record\n");
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("File error: " + e);
//        }


        File file = new File(filePath);
        String string = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                string += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            /*do nothing*/
            System.out.println("File error: " + e);
        }
//        finally {
//            try {
//                scanner.close();
//            } catch (NullPointerException e) {
//                System.out.println("File wasn't open");
//            }
//        }
        System.out.println(string);


    }
}
