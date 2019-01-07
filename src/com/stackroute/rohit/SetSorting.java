package com.stackroute.rohit;

import java.util.*;

public class SetSorting {

    public Set<String> sortedSetMethod(Set<String> setOfwords) {

        List<String> listOfWords = new ArrayList<String>();
        listOfWords.addAll(setOfwords);
        Collections.sort(listOfWords);
        System.out.print("Sorted set: ");
        for(int i=0;i<listOfWords.size();i++)
        {
            System.out.print(listOfWords.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList from the set: ");
        for(int i=0;i<listOfWords.size();i++)
        {
            System.out.print(listOfWords.get(i)+" ");
        }
        System.out.println();

        Set<String> newSetOfWords=new LinkedHashSet<String>(listOfWords);
        return newSetOfWords;
    }
}