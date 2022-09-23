package ru.job4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Info {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.print(currentDate.format(formatter));
    }
}
