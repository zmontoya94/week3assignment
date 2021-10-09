package week3assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

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
  public static boolean isGreaterThan100(int[] numberToEval) {
    int total = 0;
    for (int num : numberToEval) {
      total = total+num;
    }
    if (total>100)return(true);
    else return(false);
  }
  public static double displayAverage(double doubleToEval[]) {
    double doubleAverage;
    double total = 0;
    for (int i=0;i<doubleToEval.length;i++) {
      total=total+doubleToEval[i];
    }
    doubleAverage=total/doubleToEval.length;
    return doubleAverage;
  }
  public static double[] displayAverageTimesDeux(double doubleToEval1[],double[] doubleToEval2) {
    double[] doubleAverage= {0,0};
    double total = 0;
    for (int i=0;i<doubleToEval1.length;i++) {
      total=total+doubleToEval1[i];
    }
    doubleAverage[0]=total/doubleToEval1.length;

    double total2 = 0;
    for (int i=0;i<doubleToEval2.length;i++) {
      total2=total2+doubleToEval2[i];
    }
    doubleAverage[1]=total2/doubleToEval2.length;
    return doubleAverage;
  }
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    final double tenFifty =10.50;
    if (isHotOutside = true && moneyInPocket > tenFifty) return true;
    else return false;
  }
  //this method gets the system info of the device currently running the java application. 
  public static String[] systemInfo() throws UnknownHostException {
    InetAddress address = InetAddress.getLocalHost(); 
    String hostIP = address.getHostAddress() ;
    String hostName = address.getHostName();
    String sysInf[]= {System.getProperty("os.name"),hostIP,hostName};
    
    return sysInf;
  }
  
  public static void main(String[] args) throws UnknownHostException {
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
    int[] arrayToTest = {10, 20, 30, 40, 50};
    boolean isGreaterThanOneHundred = isGreaterThan100(arrayToTest);
    System.out.println("Is the array greater than 100? "+ isGreaterThanOneHundred);
    System.out.println("Done with Part 9 of assignment");
    double[] averageDoubleArr= {20.6,15.6,5.5,6.3,9.9,5.5,100.258,5849.2569,.063};
    double returnedAverage=displayAverage(averageDoubleArr);
    System.out.println("The Average of the double is: "+ returnedAverage);
    System.out.println("Done with Part 10 of assignment");
    double[] doubleArray1= {20.6,15.6,5.5,6.3,9.9,5.5,100.258,5849.2569,.063};
    double[] doubleArray2= {5.5,6.6,7.7,8.8,9.9,10.10,11.11,12.12};
    double[] returnedAverages = displayAverageTimesDeux(doubleArray1, doubleArray2);
    System.out.println(Arrays.toString(returnedAverages));
    System.out.println("Done with Part 11 of assignment");
    double moneyIHave = 10.51;
    boolean isItHot = true;
    boolean canIhaveDrink = willBuyDrink(isItHot, moneyIHave);
    String notBoolDrink= "maybe";
    if (canIhaveDrink=true)  notBoolDrink = "Yes";
    if (canIhaveDrink=false)  notBoolDrink = "no";
    System.out.println("Can I have a drink: "+ notBoolDrink);
    System.out.println("Done with Part 12 of assignment");
    String[] whatIsMySysInfo=systemInfo();
    System.out.println(Arrays.toString(whatIsMySysInfo));
    System.out.println("Done with Part 13 of assignment");

  }

}
