package com.revature;

public class Main {
	 public static boolean AlmostPalindrome(String str){
	        char[] chars = str.toCharArray();
	        int strlen = str.length();
	        int incorrect = 0;
	        for (int i = 0; i < strlen/2;i++){
	            if(chars[i] != chars[strlen-(i+1)]){
	                incorrect++;
	            }
	        }
	        if(incorrect == 1){
	            return true;
	        }
	        return false;
	    }
	 

	    public static int numberOfWays(int n){
	        int result = 0;
	        for (int i = n;i > 0; i--){
	            result += ncr(i,n-i);
	        }
	        return result;
	    }

	    public static int ncr(int n, int r){
	        return factorial(n)/(factorial(r)*factorial(n-r));
	    }

	    public static int factorial(int n){
	        int result = 1;
	        for(;n > 0; n--){
	            result *= n;
	        }
	        return result;
	    }
	    
	 public static void main(String[] args) {

	        System.out.println(AlmostPalindrome("abcdcbg"));
	        System.out.println(AlmostPalindrome("abccia"));
	        System.out.println(AlmostPalindrome("abcdaaa"));
	        System.out.println(AlmostPalindrome("1234312"));
	        
	        
	        
	        System.out.println(numberOfWays(1));
	        System.out.println(numberOfWays(2));
	        System.out.println(numberOfWays(5));
	    }
}
