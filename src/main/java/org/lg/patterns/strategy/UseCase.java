package org.lg.patterns.strategy;

import org.lg.patterns.strategy.compression.*;

import java.util.List;

public class UseCase {
    public static void main(String... args) {
        FileProcessor fileProcessor = new FileProcessor(new NoCompression());

        List<String> fileNames = List.of("file1.txt", "file2.audio", "file3.docx", "file4.other");

        fileNames.forEach(fileName ->
                {
                    String fileExtension = getFileExtension(fileName);
                    CompressionStrategy compressionStrategy = getCompressionStrategy(fileExtension);
                    fileProcessor.setCompressionStrategy(compressionStrategy);

                    System.out.printf("-------processing: %s-----%n", fileName);
                    String result = fileProcessor.processFile("Test file content");
                    System.out.printf("Result: %s%n", result);
                }
        );
    }

    public static String getFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf('.');
        if (lastDotIndex != -1 && lastDotIndex < filename.length() - 1) {
            return filename.substring(lastDotIndex + 1);
        } else {
            return "other";
        }
    }

    public static CompressionStrategy getCompressionStrategy(String fileExtension) {
        return switch (fileExtension) {
            case "txt" -> new TextCompression();
            case "audio" -> new AudioCompression();
            case "docx" -> new WordDocumentCompression();
            default -> new NoCompression();
        };
    }
}
