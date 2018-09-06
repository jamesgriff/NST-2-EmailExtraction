package com.softwire.jwg.NewStarterTraining;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ManualMethod.extractEmails();
        RegexMethod.extractEmails();
        HashMapMethod.extractEmails();
    }

}
