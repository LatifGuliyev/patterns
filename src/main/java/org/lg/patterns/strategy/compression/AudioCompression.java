package org.lg.patterns.strategy.compression;

public class AudioCompression implements CompressionStrategy {
    @Override
    public String compress(String fileContent) {
        System.out.println("This is audio compression logic");
        return "Audio compressed content";
    }
}
