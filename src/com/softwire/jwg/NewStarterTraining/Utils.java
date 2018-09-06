package com.softwire.jwg.NewStarterTraining;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {
    public static String getSubstring(String inputText, int i, int length) {
        int beginIndex = i;
        int endIndex = Math.min(i + length, inputText.length());
        return inputText.substring(beginIndex, endIndex);
    }

    public static String readFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes);
    }
}
