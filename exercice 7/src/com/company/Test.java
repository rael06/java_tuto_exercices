package com.company;

import java.util.List;

public class Test {
    public static int main (String arrayName) {
        List array = Main_2.mapOfArrays.get(arrayName);
        return array.size();
    }
}
