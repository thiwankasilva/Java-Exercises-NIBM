package com.nibm;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        // creating LinkedHashSet using the Set
        Set<String> data = new LinkedHashSet<String>();

        data.add("Java");
        data.add("Thiwanka");
        data.add("Example");
        data.add("Set");

        data.remove("Set");
        System.out.println(data.isEmpty());
        System.out.println(data.contains("Thiwanka"));

        System.out.println(data);
        data.clear();
        System.out.println(data);
    }
}
