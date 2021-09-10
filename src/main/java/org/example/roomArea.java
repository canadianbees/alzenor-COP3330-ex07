/*
 *  UCF COP3330 Fall 2021 roomArea Class file
 *  Copyright 2021 Celina Alzenor
 */
package org.example;
import java.util.Scanner;

public class roomArea
{
    private int length;
    private int width;

    //gets the specification of the room from user
    public roomArea()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        this.length = scan.nextInt();

        System.out.print("What is the length of the room in feet? ");
        this.width =scan.nextInt();
    }

    //calculates area and converts it from square feet to square meters, prints both
    public void Calculate()
    {
        float C = (float) 0.09290304;

        System.out.println("You entered dimensions of "+this.length+" feet by "+this.width+" feet.");

        int area = this.length * this.width;
        float areaMeters = area * C;

        System.out.println("The area is \n"+area+" square feet\n"+areaMeters+" square meters.");


    }



}
