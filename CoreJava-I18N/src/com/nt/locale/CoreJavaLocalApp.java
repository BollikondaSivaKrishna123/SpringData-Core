package com.nt.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class CoreJavaLocalApp {

	public static void main(String[] args) {
	Locale l=new Locale(args[0], args[1]);
	ResourceBundle rs=ResourceBundle.getBundle("App", l);
	System.out.println(rs.getString("sno")+"......"+rs.getString("sname")+"......"+rs.getString("saddr")+"......"
			+rs.getString("fname")+"......"+rs.getString("msg"));
		
		
	}

}
