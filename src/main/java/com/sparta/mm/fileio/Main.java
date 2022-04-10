package com.sparta.mm.fileio;

public class Main {
    public static void main(String[] args) {
        FileIOUtils.readFile("src/resources/EmployeeRecords.csv");
    }

}

//System.out.println(bufferedReader.readLine());
//System.out.println(bufferedReader.readLine());

//for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
//                System.out.println(line);
//            } ---swaps for while loop
