/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.sg.intermediate.javadatetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/**
 *
 * @author Austin Wong
 */
public class BirthdayCalculator {

    public static void main(String[] args){
        BirthdayCalculator myBC = new BirthdayCalculator();
        LocalDate birthday = myBC.getBirthday();
        String birthdayDayOfWeek = myBC.getDayOfWeekStr(birthday);
        System.out.println("Your birthday was on a " + birthdayDayOfWeek + 
                " when you were born.");
        
        LocalDate today = LocalDate.now();
        LocalDate birthdayThisYear = 
                birthday.withYear(today.getYear());
        String birthdayDayOfWeekThisYear = 
                myBC.getDayOfWeekStr(birthdayThisYear);
        
        System.out.println("Your birthday is on a "
                + birthdayDayOfWeekThisYear +
                " this year.");
        
        System.out.println("Today is " + today.format(DateTimeFormatter.ISO_DATE));
        // Important to use java.time.temporal.ChronoUnit.DAYS
        System.out.println("Only " + today.until(birthdayThisYear, DAYS)
                + " days until your birthday");
        System.out.println("You're going to be turning "
                + birthday.until(birthdayThisYear).getYears() + " years old.");
    }
    
    public LocalDate getBirthday(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What's your birthday? (MM/DD/YYYY)");
        String inputBirthday = scan.nextLine();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthday = LocalDate.parse(
                inputBirthday, dtf);
        
        return birthday;
    }
    
    public String getDayOfWeekStr(LocalDate ld){
        DayOfWeek day = ld.getDayOfWeek();
        return day.toString();
    }
    
}
