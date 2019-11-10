package com.hackerrankday4classvsinstance.app;

import java.util.Scanner;

public class Person
{
    private int age;
    public Person(int initialAge)
    {
        this.age = initialAge;
        if(age < 0)
        {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

    public void amIOld()
    {
        if(age < 13)
        {
            System.out.println("You are young.");
        }
        else if(age >= 13 && age < 18)
        {
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }
    public void yearPasses()
    {
        age++;
    }

    public static void main(String[] args)
    {
        //Object declaration
        Scanner sc = new Scanner(System.in);
        //Input
        int T = sc.nextInt();

        //Process
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        //Close input
        sc.close();
    }
}
