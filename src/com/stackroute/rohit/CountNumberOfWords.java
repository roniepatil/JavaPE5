package com.stackroute.rohit;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfWords {

    /*str = "one one -one___two,,three,one @three*one?two";*/
    public Map<String,Integer> countNumber(String str){

        String regexFor1="one";
        String regexFor2="two";
        String regexFor3="three";
        Pattern pattern1=Pattern.compile(regexFor1);
        Pattern pattern2=Pattern.compile(regexFor2);
        Pattern pattern3=Pattern.compile(regexFor3);
        Matcher match1=pattern1.matcher(str);
        Matcher match2=pattern2.matcher(str);
        Matcher match3=pattern3.matcher(str);
        int number1=0;
        while(match1.find())
        {
            number1++;
        }
        System.out.println(number1);
        int number2=0;
        while(match2.find())
        {
            number2++;
        }
        System.out.println(number2);
        int number3=0;
        while(match3.find())
        {
            number3++;
        }
        System.out.println(number3);
        Map<String,Integer> freq=new HashMap<String, Integer>();
        freq.put("one",number1);
        freq.put("two",number2);
        freq.put("three",number3);
        return freq;
    }
}
