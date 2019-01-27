package com.company;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        //Make sure args length is only 1, then set to String
       // if (args.length != 1) {
         //   throw new IllegalArgumentException("You need to specify a valid mp3 directory");
        //}

        //String inputDirectoryPath = args[0];
        String inputDirectoryPath = "/home/billy/Music";

        //Convert User String to Paths
        Path mp3DirectoryPath = Paths.get(inputDirectoryPath);


        //Check existence of path
        boolean fileNotExist = Files.notExists(mp3DirectoryPath);

        if(fileNotExist){
            throw new IllegalArgumentException("Your directory does not exist!");
        }


        //Create ArrayList to store song metadata
        ArrayList<Path> mp3Paths = new ArrayList<>();

        //Create DirectoryStream to read in all files that end in .mp3
        try(DirectoryStream<Path> listOfFiles  = Files.newDirectoryStream(mp3DirectoryPath,"*.{mp3}")){
            listOfFiles.forEach(p -> { mp3Paths.add(p); });
        } catch (IOException x){
            System.err.println(x);
        }



    }

}
