package com.sample;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
        System.out.println(getCurrentDate() + " ~ Hello, World");
    }

    private static Date getCurrentDate(){
		return new Date();
	}

}