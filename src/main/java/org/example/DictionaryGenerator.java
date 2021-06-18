package org.example;

import java.util.List;

@FunctionalInterface
public interface DictionaryGenerator {
    public List<String> createDictionary(String text);
}
