package com.softwire.jwg.NewStarterTraining;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexMethod {
    static void extractEmails() throws IOException {
        String inputText = Utils.readFile("C:\\Work\\New starter training\\Code\\2 - EmailExtraction\\sample.txt");

        Pattern pattern = Pattern.compile("\\W(\\w|[.'_%+-])+@softwire\\.com\\W");
        Matcher matcher = pattern.matcher(inputText);

        int numberOfSoftwireEmails = 0;

        while (matcher.find()) {
            numberOfSoftwireEmails++;
        }

        System.out.println();
        System.out.println("Regex Method: " + numberOfSoftwireEmails);
    }
}
