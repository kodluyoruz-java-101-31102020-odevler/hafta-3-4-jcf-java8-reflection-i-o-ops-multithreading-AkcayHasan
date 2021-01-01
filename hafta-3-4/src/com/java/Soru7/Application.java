package com.java.Soru7;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> firstNumbers = numbers.subList(0, 2500);
        List<Integer> secondNumbers = numbers.subList(2500, 5000);
        List<Integer> thirdNumbers = numbers.subList(5000, 7500);
        List<Integer> fourthNumbers = numbers.subList(7500, 10000);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 is started.");
                for (int num : firstNumbers) {
                    if (num % 2 == 0) {
                        oddNumbers.add(num);
                    } else {
                        evenNumbers.add(num);
                    }
                }
                System.out.println("Odd numbers from thread1 : " + oddNumbers);
                System.out.println("Even numbers from thread1 : " + evenNumbers);
            }
        });
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 is started.");
                for (int num1 : secondNumbers) {
                    if (num1 % 2 == 0) {
                        oddNumbers.add(num1);
                    } else {
                        evenNumbers.add(num1);
                    }
                }
                System.out.println("Odd numbers from thread2 : " + oddNumbers);
                System.out.println("Even numbers from thread2 : " + evenNumbers);

            }
        });
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread3 is started.");
                for (int num2 : thirdNumbers) {
                    if (num2 % 2 == 0) {
                        oddNumbers.add(num2);
                    } else {
                        evenNumbers.add(num2);
                    }
                }
                System.out.println("Odd numbers from thread3 : " + oddNumbers);
                System.out.println("Even numbers from thread3 : " + evenNumbers);
            }
        });
        thread3.start();

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread4 is started.");
                for (int num3 : fourthNumbers) {
                    if (num3 % 2 == 0) {
                        oddNumbers.add(num3);
                    } else {
                        evenNumbers.add(num3);
                    }
                }
                System.out.println("Odd numbers from thread4 : " + oddNumbers);
                System.out.println("Even numbers from thread4 : " + evenNumbers);
            }
        });
        thread4.start();
		
	}

}
