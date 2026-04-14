package org.example;

import java.util.Arrays;

public class PolePsu {
    public static void main(String[] args) {
        Pes[] arr = {
           new Pes("Ghkstřt", "rasa1"),
           new Pes("Cgřřiý", "rasa2"),
           new Pes("Xycil", "rasa3"),
        };
        Arrays.sort(arr);
        for(Pes p : arr){
            System.out.println(arr[p].jmeno + arr[p].rasa);
        }
    }
}
