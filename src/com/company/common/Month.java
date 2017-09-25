package com.company.common;
//For this project you will be
//
//        Showing a list of months and asking the user to choose one
//        Creating a list of months from the given month to the end of the year
//        Displaying the months
//        Note: it will take you at least 12 months to complete this project.
//
//        Getting Started
//
//        Open up a new project in IntelliJ.
//
//        If you don't have a Main.java in the src directory create one and give it a public static void main(String[] args) method.
//
//        packaging
//
//        In the project window right click on src in the project window and then click New and then click package. Enter "com.example" (without the double quotes).
//
//        Notice that under src you now see com.example which is the package.
//
//        Notice also that Main does not have a package statement as the first line.
//
//        Now refactor Main to move it to the package
//
//        Right click on Main
//        Click Refactor and then Move...
//        In the pop-up dialog window enter com.example in the To package field and click Refactor
//        Notice that Main now has a package statement as the first line and that it has moved under the package in the project window.
//
//        Packaging is a way to group Java classes.
//
//        Right click on the com.example package and create a new package named "common".
//
//        Assignment
//
//        We are going to put the Java enumeration is the common package.
//
//        Right click on the common package and then click New and then click Java Class.
//        Change the Kind to Enum and enter Month for the name and then click OK.
//        Enums in Java are typically singular (Month, not Months).
//
//        In the Month enum add the constants JANUARY through DECEMBER.
//
//        Also add a private variable englishName which should be set to January through December and a getter.
//
//        In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)
//
//        In an ArrayList add all the months for the given month and all the following months. This can be done many ways but an elegant solution can be coded using a switch statement.
//
//        Show the list to the user.


public enum Month {
  JANUARY ("January"), FEBRUARY("February"), MARCH("March"), APRIL("April"), MAY("May"), JUNE("June"), JULY("July"), AUGUST("August"), SEPTEMBER("September"), OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");

  private String englishName;

  Month(String englishName) {
    this.englishName = englishName;
  }

  public String GetEnglishName() {
    return englishName;
  }


}
