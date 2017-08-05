package ua.goit.java;

import java.util.Arrays;

/**
 * Hello world!
 *
 */


public class App 
{

    public static void main( String[] args )
    {
        Test test;

        for (Test type : Arrays.asList(Test.values())) {
            System.out.println(type.name());
        }


        test = Test.valueOf("HOME");
        System.out.println(test);

    }


}
