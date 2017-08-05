package ua.goit.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        FileManager fileManager = (FileManager) context.getBean("fileManager");

        System.out.println(fileManager.getFolderList(File.separator + "home"));



    }
}
