package com.stackroute.rohit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest obj;
    @Before
    public void setUp() throws Exception {
        obj=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void studentData() {
        Student obj1 = new Student(2,"rohit", 11);
        Student obj2 = new Student(1,"rajesh",20);
        Student obj3 = new Student(4,"rohit",22);
        Student obj4 = new Student(3,"samarth",22);
        Student obj5 = new Student(5,"rohit",25);

        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans=obj.DataOfStudent();
        String expected="",actual="";

        for(int i=0;i<list.size();i++)
        {
             expected+=list.get(i).getId()+" "+list.get(i).getNameofstudent()+" "+list.get(i).getAgeofstudent()+" ";
        }
        for(int j=0;j<ans.size();j++)
        {
            actual+=ans.get(j).getId()+" "+ans.get(j).getNameofstudent()+" "+ans.get(j).getAgeofstudent()+" ";

        }
        assertEquals(expected,actual);
    }
}