package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dmitrij on 08.02.17.
 */
public class ArraysLesson {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        //String[] students = new String[n];
        ArrayList<String> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            students.add(reader.readLine());
        }




        for (String student : students) {
            System.out.println(student);
        }




    }
}
