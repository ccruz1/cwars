package org.example;

import java.util.*;

public class paragram {

    public boolean check(String sentence){


        String finalString = sentence.replaceAll("\\s","");
        System.out.println(finalString);

        List<Character> chars = new ArrayList<>();
        for (char ch : finalString.toCharArray()) {
            chars.add(ch);
        }

        Set<Character> mySet = new HashSet<>(chars);
        System.out.println(mySet);
        System.out.println(mySet.size());


        if(mySet.size() == 26){
            return true;
        }else{
            return false;
        }

    }
}