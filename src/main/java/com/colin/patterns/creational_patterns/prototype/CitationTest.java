package com.colin.patterns.creational_patterns.prototype;

public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("Colin");

        Citation citation1 = citation.clone();
        citation1.setName("Alice");

        citation.show();
        citation1.show();
    }
}
