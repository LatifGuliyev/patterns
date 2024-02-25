package org.lg.patterns.strategy.compression;

public class WordDocumentCompression implements CompressionStrategy {
    @Override
    public String compress(String fileContent) {
        System.out.println("This is word document compression");
        return "Word document compressed content";
    }
}
