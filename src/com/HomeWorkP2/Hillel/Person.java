package com.HomeWorkP2.Hillel;

import java.time.LocalDate;


public class Person {

    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getAge() {
        return age;
    }

    public Person (String firstName, String lastName, String middleName, String date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = getAge(date);
    }
    public Person (String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public Person (String fio){
        String[] arrayFio = fio.split(" ");
        this.firstName = arrayFio[1];
        this.lastName = arrayFio[0];
        this.middleName = arrayFio[2];
    }

    public String getFio (){
        return firstName +" "+ lastName +" "+ middleName;
    }
    public String getShortFio (){
        return lastName + " "+ firstName.charAt(0) + ". " + middleName.charAt(0)+".";
    }
    public int getAge(String dateOfHB){
        LocalDate date = LocalDate.now();
        int yearsOld;
        int nowYear= date.getYear();
        int nowMonth= date.getMonthValue();
        int nowDay = date.getDayOfMonth();
        String[] arrayDate = dateOfHB.split("\\.");
        int day = Integer.parseInt(arrayDate[0]);
        int month = Integer.parseInt(arrayDate[1]);
        int year = Integer.parseInt(arrayDate[2]);
        yearsOld = nowYear - year;
        if(month > nowMonth){
            yearsOld = yearsOld - 1;
        }else if (nowMonth == month && day >= nowDay){
            yearsOld = yearsOld - 1;
        }
        return yearsOld;
    }

    @Override
    public String toString() {
        return "\nФИО =" + firstName + " " + middleName + " " + lastName + "\nЛет" + age;
    }
}