package com.gl.currencydenominations;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		MergeSort mergesort = new MergeSort();
		NotesCount notescount = new NotesCount();
		System.out.println("Enter the size of currency denominations.");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value.");
		for(int i=0; i<size; i++) {
			notes[i] = sc.nextInt();					
		}
		
		System.out.println("Enter the amount you want to pay.");
		int amount = sc.nextInt();
		mergesort.sort(notes, 0, notes.length-1);
		notescount.notesCount(notes, amount);
		
		sc.close();
	}
}
