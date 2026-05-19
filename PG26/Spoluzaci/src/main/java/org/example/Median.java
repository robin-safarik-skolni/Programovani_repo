package org.example;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        String[] arr = {
            "Zumr Erik",
            "Gabrielová Adéla",
            "Ohnesorg Ema",
            "Peterková Violeta",
            "Pitsur Nazarii",
            "Poláková Lucie",
            "Pospíšil Tomáš",
            "Roszkowski Ondřej",
            "Rybnikář David",
            "Řezáč Adam",
            "Šafařík Robin",
            "Šyška Oleksandr",
            "Tůma Jakub",
            "Vaňha Daniel",
            "Vopravil Vojtěch",

        };
        System.out.println(arr[arr.length/2]);
        Arrays.sort(arr); //vytřídit seznam
        System.out.println(arr[arr.length/2]);
    }
}