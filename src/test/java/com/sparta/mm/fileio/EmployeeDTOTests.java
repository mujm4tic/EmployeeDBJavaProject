package com.sparta.mm.fileio;

import org.junit.jupiter.api.*;

import static com.sparta.mm.fileio.EmployeeDTO.adjustDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeDTOTests {

    private final String[] employee = {"198529", "Mr.", "Muhammad", "I", "Kareem", "M", "m.kareem@hotmail.co.uk", "9/21/1982", "2/1/2008", "69294"};
    private final EmployeeDTO employeeDTO = new EmployeeDTO(employee);

    @Test
    @DisplayName("adjustDate converts String types to LocalDate")
    void adjustDateConvertsStringTypeToLocalDateDateOfFormatMDY() {
        assertEquals("class java.time.LocalDate", adjustDate("5/16/1993").getClass().toString());
    }


    @Test
    @DisplayName("EmployeeDTO converts employee id String into int")
    void employeeDtoConvertsEmployeeIdStringIntoInt() {
        assertEquals(198529, employeeDTO.getEmpId());
    }

    @Test
    @DisplayName("EmployeeDTO converts employee middle initial String into char")
    void employeeDtoConvertsEmployeeMiddleInitialStringIntoChar() {
        assertEquals('I', employeeDTO.getMiddleInitial());
    }

    @Test
    @DisplayName("EmployeeDTO converts employee gender String into char")
    void employeeDtoConvertsEmployeeGenderStringIntoChar() {
        assertEquals('M',employeeDTO.getGender());
    }

    @Test
    @DisplayName("EmployeeDTO converts employee dob String into Local Date")
    void employeeDtoConvertsEmployeeDobStringIntoLocalDate() {
        assertEquals("class java.time.LocalDate", employeeDTO.getDateOfBirth().getClass().toString());
    }

    @Test
    @DisplayName("EmployeeDTO converts employee date of joining String into Local Date")
    void employeeDtoConvertsEmployeeDateOfJoiningStringIntoLocalDate() {
        assertEquals("class java.time.LocalDate", employeeDTO.getDateOfJoining().getClass().toString());
    }

    @Test
    @DisplayName("EmployeeDTO converts employee salary String into int")
    void employeeDtoConvertsEmployeeSalaryStringIntoInt() {
        Assertions.assertEquals(69294,employeeDTO.getSalary());
    }



}
