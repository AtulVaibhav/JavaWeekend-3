package com.if_else;

public class Test3 {
  public static String getGrade(int marks){
	  if(marks>=80)return "Distinction";
	  else if(marks>=60 && marks<80) return "1st division";
	  else if(marks>=35 && marks<60) return "2nd division";
	  return "Try Again!!!";
  }
	public static void main(String[] args) {
		String result =Test3.getGrade(-57);
        System.out.println(result);
	}

}
