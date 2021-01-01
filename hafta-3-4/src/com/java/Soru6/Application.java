package com.java.Soru6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		createFile();
		writeFile();
		readFile();
		
		
	}
		
	public static void createFile(){
	        File file = new File("C:\\Users\\Public\\JavaDemos\\javaFiles\\students.txt");
	        try {
	            if (file.createNewFile()){
	                System.out.println("Dosya Oluşturuldu");
	            }else {
	                System.out.println("Dosya Mevcut");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    
	public static void writeFile() {
	        try {
	            /*
	            Eğer kullanıcının bilgileri kendisinin girmesini istersek aşağıdaki kodları etkinleştirip değişkenleri bufferedWriter
	            kısmına parametre olarak verebiliriz.   
	            
	            int studentsNumber;
	            String name;
	            String lastname;
	            String department;
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Sırasıyla öğrenci no, ismi soyismi ve bölüm bilgilerini giriniz.");
	            studentsNumber = scan.nextInt();
	            name = scan.next();
	            lastname = scan.next();
	            department = scan.next();

	            */

	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Public\\JavaDemos\\javaFiles\\students.txt",true));
	            bufferedWriter.newLine();
	            bufferedWriter.write("Öğrenci No : 101 / ");
	            bufferedWriter.write("Öğrenci İsim : Mehmet Hasan / ");
	            bufferedWriter.write("Öğrenci Soyisim : Akçay / ");
	            bufferedWriter.write("Öğrenci Bölüm : Mobile");
	            bufferedWriter.close();

	        }catch (Exception e){
	            e.printStackTrace();
	        }

	    }

	    
	public static void readFile(){
	        File file = new File("C:\\Users\\Public\\JavaDemos\\javaFiles\\students.txt");
	        try {
	            Scanner reader = new Scanner(file);
	            while (reader.hasNextLine()){
	                System.out.println(reader.nextLine());
	            }
	            reader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	    }
	    
}


