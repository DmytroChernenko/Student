package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        System.out.println(getTime(new ArrayList()));
        System.out.println(getTime(new LinkedList()));

    }

    public static double getTime(List list) {

        Date start = new Date();

        insert1000(list);

        Date finish = new Date();

        return finish.getTime() - start.getTime();
    }

    private static void insert1000(List list) {

        for (int i = 0; i < 400000; i++) {
            list.add(0,"Vova");
        }


    }
}
