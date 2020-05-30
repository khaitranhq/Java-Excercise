package com.leoaslan.chapter3.excer6;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excer6 {
        public static void main(String[] args) {
        try{
            File f = new File("~/zbc.txt");
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr); //FileNotFoundException
            String line;
            while((line = br.readLine()) != null) { //IOEXception
                System.out.println(line);
            }

            fr.close(); //IOException
            br.close(); //IOException
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
