/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.sg.intermediate.javadatetimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 *
 * @author Austin Wong
 */
public class DateTimePractice {

    public static void main(String[] args){
        
        LocalDate ld = LocalDate.now();
        
        // Date from well-formed ISO-8601 string
        ld = LocalDate.parse("2015-01-01");
        
        // Date from string of different pattern
        ld = LocalDate.parse("02/07/2010", 
                DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        
        // Math operations with LocalDate object
        LocalDate past = ld.minusDays(8);
        past = past.minusYears(2);
        past = past.plusMonths(3);
        
        // Calculate time between 2 dates
        Period diff = ld.until(past);
        
        // Formatting Dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        // Same format
        String formatted = ld.format(formatter);
        
        // New format
        formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd=yyyy+=+=+="));
        
        // ofLocalizedDate uses localization information from the system
        // to determine how the date should be formatted
        formatted = past.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        
        System.out.println(formatted);
        System.out.println(diff);
        
        // Converting Date Object (legacy object) into a LocalDate object
        Date legacyDate = new Date();
        // Step 1: Convert the Date into a ZonedDateTime object
        ZonedDateTime zdt = ZonedDateTime.ofInstant(
                legacyDate.toInstant(), ZoneId.systemDefault());
        // Step 2: Convert the ZonedDateTime object into a LocalDate object
        ld = zdt.toLocalDate();
        
    }
    
}
