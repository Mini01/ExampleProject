package com.biz.exam.method;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeepMethod {
	
	
	  
	  
	
	public boolean isLeepYear(int intYear) {
		boolean leepOk = false;
		if(intYear % 4 ==0) {
			leepOk = true;
			if(intYear % 100 == 0 ) {
				leepOk = false;
				if(intYear % 400 == 0) {
					leepOk = true;
				}
			}
		}
		return leepOk;
	}

}
