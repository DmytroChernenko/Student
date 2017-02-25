package com.company.mc.saturday;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dmitrij on 25.02.17.
 */
public class Main {

    private static int Age;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<Student> list = new ArrayList<>();

        while (!s.equals("exit")) {

            Student student = new Student(s, 20);
            list.add(student);

            s = sc.next();
        }


        for (Student student : list) {
            System.out.println(student.getName());
        }

        fixNames(list);

    }

    private static void fixNames(ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {

            Student student = list.get(i);

            if(student.getName().equals("DIma")) {

            }


        }

    }

}
