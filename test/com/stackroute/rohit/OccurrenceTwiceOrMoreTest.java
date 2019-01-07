package com.stackroute.rohit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OccurrenceTwiceOrMoreTest {
    OccurrenceTwiceOrMore obj;
    @Before
    public void setUp() throws Exception {
        obj=new OccurrenceTwiceOrMore();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkOccurrenceCorrect1(){
        String  arr[] ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> mp=new HashMap<String,Boolean>();
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",false);
        assertEquals(mp,obj.checkOccurrence(arr));
    }

    @Test
    public void checkOccurrenceCorrect2(){
        String  arr[] ={"a","b","c","d","a","c","c","d","e"};
        Map<String,Boolean> mp=new HashMap<String,Boolean>();
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",true);
        mp.put("e",false);
        assertEquals(mp,obj.checkOccurrence(arr));
    }

}