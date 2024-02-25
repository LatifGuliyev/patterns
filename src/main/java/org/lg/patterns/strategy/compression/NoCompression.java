package org.lg.patterns.strategy.compression;

public class NoCompression implements CompressionStrategy {
    @Override
    public String compress(String fileContent) {
        System.out.println("No compression applied");
        return "Original file content";
    }
}
