package week3assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Assignment {
  public static int subtract (int numberOne, int nubmerTwo) {
    int result=nubmerTwo-numberOne;
    System.out.println(nubmerTwo +"-"+ numberOne+"=" + result);
    return result;
  }
  public static int[] addX(int n, int array[], int x)
  {
      int i;

      int newarray[] = new int[n + 1];
      for (i = 0; i < n; i++)
        newarray[i] = array[i];
      newarray[n] = x;

      return newarray;
  }
  public static String[] sayXTimes(String wordToSay, int n) {
    String [] saidXTimes = new String[n];
    int index = 0;
    for (String word : saidXTimes){
      saidXTimes[index]=wordToSay;
      System.out.print(saidXTimes[index]);
      index ++;
     }
    
    return saidXTimes;
  }
  public static String fullName(String firstName, String lastName) {
    String full = firstName+" "+lastName;
    return full;
  }
  public static void main(String[] args) {
    int [] ages=  {
      3,9,23,64,2,8,28,93  
    };
    subtract(ages[0],ages[ages.length-1]);
    int newNumb=25;
    int n=1;//How many new numbers are we adding 
    ages=addX(n, ages, newNumb);
    subtract(ages[0],ages[ages.length-1]);
    System.out.println("Done with Part 1 of assignment!");
    String[] names = new String[] {
      "Sam","Tommy","Tim","Sally","Buck","Bob"
    };
    int index =0;
    int totalCharacters=0;
    for (String name : names){
      System.out.println(name+"("+name.length()+")");
      totalCharacters=totalCharacters+name.length();
     }
    System.out.println("Average letters per Name = "+((float)totalCharacters/names.length));
    index = 0;
    for (String name : names){
       System.out.print(name+" ");
      }
    System.out.println();
    System.out.println("Done with Part 2 of assignment!");
    System.out.println("How do you access the last element of any array? arrayName[arrayname.lenght-1]");
    System.out.println("Done with Part 3 of assignment");
    System.out.println("Hos do you access the first element of any array? arrayName[0]");
    System.out.println("Done with Part 4 of assignment");
    int[] nameLengths =new int[names.length];
    for (String name : names){
      nameLengths[index] = name.length();
      System.out.print(nameLengths[index]+" ");
      index++;
     }
    System.out.println();
    System.out.println("Done with Part 5 of assignment");
    int sum =0;
    for (int i =0;i<nameLengths.length;i++) {
      sum = sum + nameLengths[i];
      
    }
    System.out.println(sum);
    System.out.println("Done with Part 6 of assignment");
    String word = "Potato";
    final int timesToSay = 5;
    
    sayXTimes(word, timesToSay);
    System.out.println();
    System.out.println("Done with Part 7 of assignment");
    String FN="Zachery";
    String LN="Montoya";
    String myName=fullName(FN, LN);
    System.out.println(myName);
    System.out.println("Done with Part 8 of assignment");
    
    
    

  }

}
