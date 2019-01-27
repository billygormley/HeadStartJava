package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot","B-to-B","win-win","front-end", "web-based",
                                "pervasive", "smart", "six-sigma","critical-path", "dynamic"};
        

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                                "clustered", "branded","outside-the-box", "positioned", "networked", "focused",
                                "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                                    "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};


        // Get lengths of arrays
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Choose a random value from each array
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Build the Phrase-O-Matic string
        String phrase = wordListOne[rand1] + " " +  wordListTwo[rand2] + " " + wordListThree[rand3];

        // Output Phrase-O-Matic string
        System.out.println("What we need is a " + phrase);


    }
}
