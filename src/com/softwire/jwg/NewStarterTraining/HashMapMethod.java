package com.softwire.jwg.NewStarterTraining;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class HashMapMethod {
    static void extractEmails() throws IOException {
        String inputText = Utils.readFile("C:\\Work\\New starter training\\Code\\2 - EmailExtraction\\sample.txt");

        HashMap<String, Integer> domainCounts = countDomainNames(inputText);

        printResults(domainCounts);
    }

    private static void printResults(HashMap<String, Integer> domainCounts) {
        System.out.println();
        System.out.println("HashMap Method:");

        HashSet<Integer> uniqueCounts = new HashSet<Integer>(domainCounts.values());
        List<Integer> counts = new ArrayList<>(uniqueCounts);
        Collections.sort(counts);
        Collections.reverse(counts);

        for (Integer currentValue : counts) {
            for (String domain: domainCounts.keySet()) {
                if (domainCounts.get(domain).equals(currentValue)) {
                    System.out.println("- " + domain + " : " + currentValue);
                }
            }
        }
    }

    private static HashMap<String, Integer> countDomainNames(String inputText) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9.'_%+-]([A-Za-z0-9.'_%+-])+@(?<domain>([A-Za-z0-9-]+\\.)+[A-Za-z0-9-]+)[^A-Za-z0-9.'_%+-]");
        Matcher matcher = pattern.matcher(inputText);

        HashMap<String, Integer> domainCounts = new HashMap<String, Integer>();

        while (matcher.find()) {
            String domainName = matcher.group("domain");

            if (!domainCounts.containsKey(domainName)) {
                domainCounts.put(domainName, 0);
            }

            domainCounts.put(domainName, domainCounts.get(domainName) + 1);
        }
        return domainCounts;
    }
}
