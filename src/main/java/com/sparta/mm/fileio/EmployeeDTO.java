package com.sparta.mm.fileio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeDTO {

    //Emp ID,Name Prefix,First Name,Middle Initial,Last Name,Gender,E Mail,Date of Birth,Date of Joining,Salary

    private int empId;
    private String namePrefix;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private char gender;
    private String email;
    private LocalDate dateOfBirth; //local date dob
    private LocalDate dateOfJoining;
    private int salary;

    public EmployeeDTO(String[] employeeData) {
        this.empId = Integer.parseInt(employeeData[0]);
        this.namePrefix = employeeData[1];
        this.firstName = employeeData[2];
        this.middleInitial = employeeData[3].charAt(0);
        this.lastName = employeeData[4];
        this.gender = employeeData[5].charAt(0);
        this.email = employeeData[6];
        this.dateOfBirth = adjustDate(employeeData[7]);
        this.dateOfJoining = adjustDate(employeeData[8]);
        this.salary = Integer.parseInt(employeeData[9]);
    }

    public static LocalDate adjustDate(String date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/uuuu");
        LocalDate employeeDate = LocalDate.parse(date, format);
        return employeeDate;
    }

    public int getEmpId() {
        return empId;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", namePrefix='" + namePrefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
