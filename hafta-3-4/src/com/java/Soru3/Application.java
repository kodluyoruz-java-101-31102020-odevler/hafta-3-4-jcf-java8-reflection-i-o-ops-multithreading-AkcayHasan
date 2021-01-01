package com.java.Soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int studentNumber;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Öğrenci numaranızı giriniz : ");
        studentNumber = scan.nextInt();

        Map<Integer,Students> studentMap = new HashMap<>();
        studentMap.put(studentNumber,new Students("Ayşe","Fatma",19,"Math"));
        studentMap.put(studentNumber,new Students("Mehmet","Akçay",22,"Engineering"));
        studentMap.put(studentNumber,new Students("Ahmet","Mehmet",19,"Physics"));
		

	}

}
