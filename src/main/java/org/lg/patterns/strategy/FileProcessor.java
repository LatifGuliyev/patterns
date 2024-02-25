package org.lg.patterns.strategy;

import org.lg.patterns.strategy.compression.CompressionStrategy;

public class FileProcessor { // This class can contain other business cases for file processing
    private CompressionStrategy compressionStrategy;

    public FileProcessor(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public String processFile(String fileContent) {
        // Apply other process steps etc.
        return this.compressionStrategy.compress(fileContent);
    }
}
