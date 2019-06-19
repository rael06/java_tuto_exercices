package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyArray extends ArrayList {
    public List<String> values;
    public MyArray(String arg1, String arg2, String arg3, String arg4) {
        this.values = new ArrayList<>();
        values.add(arg1);
        values.add(arg2);
        values.add(arg3);
        values.add(arg4);
    }

    public String toString(int i) {
        String newLine = System.getProperty("line.separator");
        return this.values.get(i);
    }
}
