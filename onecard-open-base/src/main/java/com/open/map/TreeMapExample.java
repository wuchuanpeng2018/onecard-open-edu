package com.open.map;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        Iterator iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println("iterator1 = " + iterator1.next());
        }
        map.clear();
        map.put("3",3);
        map.put("1",1);
        map.put("2",2);
        Iterator iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println("iterator2 = " + iterator2.next());
        }
    }

}
