package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с пробелами");
        String msg = scanner.nextLine();

        DictionaryGenerator dictionaryGenerator =
                (s) -> Arrays.stream(s.split(" ")).sorted().collect(Collectors.toList());

        System.out.println("Словарь:");
        System.out.println(dictionaryGenerator.createDictionary(msg));
    }
}

