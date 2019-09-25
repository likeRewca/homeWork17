package com.HomeWorkP2.Hillel;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {

    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String fio;
    protected String shortFio;
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
    public String getFio() {
        return fio;
    }
    public String getShortFio() {
        return shortFio;
    }
    public int getAge() {
        return age;
    }

    public Person (String firstName, String lastName, String middleName, String date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.fio = getFio(firstName, lastName, middleName);
        this.shortFio = getShortFio(firstName, lastName, middleName);
        this.age = getAge(date);
    }
    public Person (String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.fio = getFio(firstName, lastName, middleName);
        this.shortFio = getShortFio(firstName, lastName, middleName);
    }
    public Person (String fio){
        splitFio(fio);
        this.fio = fio;
        this.shortFio = getShortFio(firstName, lastName, middleName);
    }

    private String getFio (String firstName, String lastName, String middleName){
        return firstName +" "+ lastName +" "+ middleName;
    }

    private String getShortFio (String firstName, String lastName, String middleName){
        return lastName + " "+ firstName.charAt(0) + ". " + middleName.charAt(0)+".";
    }
    private void splitFio(String fio){
        String[] arrayFio = fio.split(" ");
        this.firstName = arrayFio[1];
        this.lastName = arrayFio[0];
        this.middleName = arrayFio[2];
    }
    private int getAge(String dateOfHB){
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

}