package com.gl.transactionmanagement;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		int arr[];
		int size, targetno;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the transaction");
		size = sc.nextInt();

		System.out.println("Enter the values of array.");
		arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Transactional values are.");
		for(int i=0; i<size;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		System.out.println("Enter the total no of targets that needs to be achieved.");
		targetno = sc.nextInt();

		while (targetno != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target.");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions.");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Target is not achieved.");
			targetno--;
		}
		sc.close();
	}
}
