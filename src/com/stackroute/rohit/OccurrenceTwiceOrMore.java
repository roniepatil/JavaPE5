package com.stackroute.rohit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurrenceTwiceOrMore {

    public Map<String, Boolean> checkOccurrence(String[] input){

        Map<String,Integer> newmap=new HashMap<String, Integer>();

        for(String str:input){
            Integer n=newmap.get(str);
            n=(n==null)?1:++n;
            newmap.put(str,n);
        }
        Map<String,Boolean> wing=new HashMap<String, Boolean>();
        for(Map.Entry<String,Integer> entry:newmap.entrySet()){
            if(entry.getValue()>=2){
                wing.put(entry.getKey(),true);
            }
            else
                wing.put(entry.getKey(),false);
        }
        return wing;
    }
}
