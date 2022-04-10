package com.sparta.mm.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOUtils {
    static void readFile(String fileName) {
        try {
            var fileReader = new FileReader(fileName);
            var bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null){
                String[] employeeData = line.split(",");
                EmployeeDTO employeeDTO = new EmployeeDTO(employeeData);
                System.out.println(employeeData);
                line = bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}