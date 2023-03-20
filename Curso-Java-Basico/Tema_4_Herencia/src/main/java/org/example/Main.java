package org.example;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone(
                "apple", "iPhone 14", "8.000.000 COP", "Rojo", "OLED-AMOLED", "iOS", "16 inches"
        );
        SmartWatch watch1 = new SmartWatch(
                "Huawei","band 7","250.000 COP", "Negro", false, "100", "2 semanas"
        );
        System.out.println(phone1);
        System.out.println(watch1);
    }
}