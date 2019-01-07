package com.stackroute.rohit;

import java.util.Iterator;
import java.util.List;

public class  UpdateSpecArrElement {
    public List<String> updateSpecificElements(List<String> InMessage, String valueOfWord, int indexOfWord) {

        if(InMessage.size()==0)
        {
            return null;
        }
       InMessage.set(indexOfWord,valueOfWord);
       InMessage.clear();
       System.out.println("Array list  after removing all elements:"+ InMessage);
       return InMessage;
    }
}
