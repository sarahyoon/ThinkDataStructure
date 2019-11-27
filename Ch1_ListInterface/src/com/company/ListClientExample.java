package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {

    private List list;

    public ListClientExample(){
        //list = new LinkedList();
        list = new ArrayList();
    }

    List getList(){
        return list;
    }

    public static void main(String[] args) {

        ListClientExample listClient = new ListClientExample();
        List list = listClient.getList();
        System.out.println(list);

    }
}
