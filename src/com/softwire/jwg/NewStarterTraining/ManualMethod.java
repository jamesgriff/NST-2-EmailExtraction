package com.softwire.jwg.NewStarterTraining;

import java.io.IOException;

class ManualMethod {
    static void extractEmails() throws IOException {
        String inputText = Utils.readFile("C:\\Work\\New starter training\\Code\\2 - EmailExtraction\\sample.txt");

        String textToSearch = "softwire.com";
        int numberOfSoftwireEmails = 0;

        for (int i = 0; i < inputText.length(); i++) {
            if (Utils.getSubstring(inputText, i, textToSearch.length()).equals(textToSearch)) {
                numberOfSoftwireEmails++;
            }
        }

        System.out.println();
        System.out.println("Manual Method: " + numberOfSoftwireEmails);
    }
}
