package logic;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import Certificate.Certificate;
import Employee.Employee;
import Employee.ExperienceEmployee;
import Employee.FresherEmployee;
import Employee.InternEmployee;

public class Logic {

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        Logic.employees = employees;
    }


    private static List<Employee> employees;

    public static List<Employee> searchIntern() {
        ArrayList<Employee> result = new ArrayList<Employee>();

        for (Employee employee : employees) {
            if (employee instanceof InternEmployee) {
                result.add(employee);
            }
        }

        return result;
    }

    public static List<Employee> searchFresher() {
        ArrayList<Employee> result = new ArrayList<Employee>();

        for (Employee employee : employees) {
            if (employee instanceof FresherEmployee) {
                result.add(employee);
            }
        }

        return result;
    }


    public static List<Employee> searchExperience() {
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

    public static void edit(Employee employee) {
        System.out.println("Chỉnh cc");
        
    }

    public static void deleteEmployee(Employee employee){
        employees.remove(employee);
    }

    public static void insertEmployee() {
        Employee employee = null;
        String id = getString("Nhập ID");
        String fullName = getString("Nhập full name");

        System.out.println("Nhập birth day: ");
        int day = getInt("Nhập ngày");
        int month = getInt("Nhập tháng");
        int year = getInt("Nhập năm");

        Date birthDay = Util.getDateFrom(year, month, day);
        String SDT = getString("Nhập SDT");
        String email = getString("Nhập email");
        int type = getInt("Nhập employee_type");
        int count = getInt("Nhập employee_count");

        System.out.println();

        switch (type) {
            case 0:
                employee = insertExperienceProperty();
                break;
        
            case 1:

                employee = insertFresherProperty();
                break;

            case 2:
                employee = insertInternProperty();
                break;



        }

        Certificate certificate = new Certificate();

        String certificateId = getString("Nhập certificateID");
        String certificateName = getString("Nhập certificateName");
        String certificateRank = getString("Nhập certificateRank");

        
        System.out.println("Nhập certificateDate: ");
    
        day = getInt("Nhập ngày");
        month = getInt("Nhập tháng");
        year = getInt("Nhập năm");
      
        certificate.setCertificateDate(Util.getDateFrom(year, month, day));
        certificate.setCertificateId(certificateId);
        certificate.setCertificateName(certificateName);
        certificate.setCertificateRank(certificateRank);
        ArrayList<Certificate> certificates = new ArrayList();
        certificates.add(certificate);


        employee.setCertificates(certificates);
        employee.setId(id);
        employee.setBirthDay(birthDay);
        employee.setEmail(email);
        employee.setEmployeeCount(count);
        employee.setFullName(fullName);
        employee.setPhoneNumber(SDT);

        employees.add(employee);

    }
    private static InternEmployee insertInternProperty() {

        InternEmployee intern = new InternEmployee();
   
        String major = getString("Nhập major");
        int semester = getInt("Nhập học kì");
        String universityName = getString("Nhập trường");

        intern.setMajor(major);
        intern.setSemester(semester);
        intern.setUniversityName(universityName);
        return intern;
    }
    private static FresherEmployee insertFresherProperty() {
        FresherEmployee fresher = new FresherEmployee();
  
        System.out.println("Nhập ngày ra trường: ");
    
        int day = getInt("Nhập ngày");
        int month = getInt("Nhập tháng");
        int year = getInt("Nhập năm");

        String rank = getString("Nhập xếp loại tốt nghiệp");

        String education = getString("Nhập tên trường");

        fresher.setGraduationDate(Util.getDateFrom(year, month, day));
        fresher.setEducationRank(rank);
        fresher.setEducation(education);

        return fresher;


    }
    private static ExperienceEmployee insertExperienceProperty() {
        ExperienceEmployee pro = new ExperienceEmployee();
        Scanner sc = new Scanner(System.in);

        int expInYear = getInt("Nhập năm kinh nghiệm");

        System.out.println("Nhập pro skill: ");
        String proSkill = getString("Nhập pro skill");
      
        pro.setExpInYear(expInYear);
        pro.setProSkill(proSkill);

        return pro;

    }

    private static String getString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print(message + ": ");
        return sc.next();
    }

    private static int getInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print(message + ": ");
        return sc.nextInt();
    }
}

