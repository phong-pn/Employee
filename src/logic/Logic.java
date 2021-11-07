package logic;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Employee.Employee;
import Employee.ExperienceEmployee;
import Employee.FresherEmployee;
import Employee.InternEmployee;

public class Logic {
    public static List<Employee> searchIntern(List<Employee> employees) {
        ArrayList<Employee> result = new ArrayList<Employee>();

        for (Employee employee : employees) {
            if (employee instanceof InternEmployee) {
                result.add(employee);
            }
        }

        return result;
    }

    public static List<Employee> searchFresher(List<Employee> employees) {
        ArrayList<Employee> result = new ArrayList<Employee>();

        for (Employee employee : employees) {
            if (employee instanceof FresherEmployee) {
                result.add(employee);
            }
        }

        return result;
    }


    public static List<Employee> searchExperience(List<Employee> employees) {
        ArrayList<Employee> result = new ArrayList<Employee>();

        for (Employee employee : employees) {
            if (employee instanceof ExperienceEmployee) {
                result.add(employee);
            }
        }

        return result;
    }

    public static Boolean checkBirthDay(Date birthDay) {
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);

        calendar.setTime(birthDay);
        int birthDayYear = calendar.get(Calendar.YEAR);
        if (nowYear - birthDayYear >=18) return true;
        return false;
    }


    public static Boolean checkEmail(String email) {
        return email.contains("@");
    }


    public static Boolean checkPhone(String phone) {
        return phone.length() == 10 ? true : false;
    }

    
    public static void deleteEmployees(List<Employee> employees, String employeeId) {
        
    }
}
