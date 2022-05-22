package com.deneme;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int m, t, f, k, ta, mu;
		var input = new Scanner(System.in);

		System.out.println("Matematik sinav notunu giriniz: ");
		m = input.nextInt();		
		
		System.out.println("Turkce sinav notunu giriniz: ");	
		t = input.nextInt();
		
		System.out.println("Fizik sinav notunu giriniz: ");	
		f = input.nextInt();
		
		System.out.println("Kimya sinav notunu giriniz: ");	
		k = input.nextInt();
		
		System.out.println("Tarih sinav notunu giriniz: ");	
		ta = input.nextInt();
		
		System.out.println("Muzik sinav notunu giriniz: ");	
		mu = input.nextInt();
		
		double ort = (m + t + f + k + ta + mu )/6;
		
		System.out.println("Sinavlarinizin ortalamasi: " + ort);
		
	}
	
}
