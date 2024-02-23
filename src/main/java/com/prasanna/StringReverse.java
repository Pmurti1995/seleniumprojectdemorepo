package com.prasanna;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am not ok";
	    String[] words = input.split("\\s"); 
	    StringBuilder sb = new StringBuilder(); 
	    for (int i = words.length - 1; i >= 0; i--) {
	      sb.append(words[i]).append(" "); 
	    }
	    System.out.println(sb.toString().trim());
	  }
	
      
	}


