package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	static {
		System.out.println("WishMessageGenerator.static Block");
	}
	private Date date;
	
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1-param Constructor");
		this.date=date;
	}
	
	

//setter Method in Target Class

/*
 * public void setDate(Date date) { this.date = date; }
 */
 

//Business logics
  public String WishMessageGeneratorMethod(String name)
  {
	  int hrs=date.getHours();
	  if (hrs<12) {
		return "Good Morning :: "+name;
	}
	  else  if (hrs<16) {
			return "Good Afternoon :: "+name;
		}
	  else  if (hrs<21) {
			return "Good Evening :: "+name;
		}
	  else
		  return "Good Nyt :: "+name;
  }
}
