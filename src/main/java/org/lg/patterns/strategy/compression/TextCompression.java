package org.lg.patterns.strategy.compression;

public class TextCompression implements CompressionStrategy {
    @Override
    public String compress(String fileContent) {
        System.out.println("This is text compression logic");
        return "Text compressed content";
    }
}

