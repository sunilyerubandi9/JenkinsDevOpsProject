package com.sn.JenkinsDevOpsProject;

/**
 * Hello world!
 * new changes
 */
public class App {
    public static void main( String[] args )	{
    	
    	App obj = new App();
    	
    	System.out.println("a + b + c = "+ obj.add("Service","Now", "DevOps"));
       
    	System.out.println("a + b = "+ obj.add(5,6));
    	System.out.println("a - b = "+ obj.subtact(5,6));
    	System.out.println("a * b = "+ obj.multiply(5,6));
    	System.out.println("a / b = "+ obj.division(30,6));
    	System.out.println("a / b = "+ obj.division(42,6));
  
    }
    
    public int add(int a, int b) {
    	
    	return a+b;
    	
    }
    
    public String add(String a, String b, String c) {
    	
    	return a+" "+b+" "+c;
    	
    }
    
    public int subtact(int a, int b) {
    	
    	return a-b;
    	
    }

   public int multiply(int a, int b) {
    	
    	return a*b;
    	
    }
   
   public float division(int a, int b) {
   	
   	return a/b;
   	
   }

}