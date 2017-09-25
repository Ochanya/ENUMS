package com.company.common;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Month> months = new ArrayList<>();
        List<String> englishMonths = new ArrayList<>();
        List<String> userMonths = new ArrayList<>();
        System.out.println("Please pick a month");

       for (Month month : Month.values()) {
            months.add(month);
            englishMonths.add(month.GetEnglishName());

           System.out.print(month.GetEnglishName()+"  ");


       }

        String input = new Scanner(System.in).nextLine();
       for (int i=0; i<months.size(); i++){
         String month = months.get(i).toString();
           if (month.equals(input.toUpperCase())) {
             for (int j=months.get(i).ordinal(); j<months.size();j++ ){
               userMonths.add(months.get(j).toString());

             }
           }
       }
       for (String monthsResults : userMonths)
      System.out.println(monthsResults);

    }
}
