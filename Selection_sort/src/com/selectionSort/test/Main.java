package com.selectionSort.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		char choice = 0;
		do{
			System.out.println("Enter the number: ");
			num.add(scan.nextInt());
			System.out.println("Do you want to enter more numbers? y/n : ");
			choice = scan.next().charAt(0);
		}while(choice=='y');

		scan.close();
		int temp;
		for(int i=0;i<num.size()-1;i++){
			int min = searchSmallest(i+1, num);
			int indexOfMin = num.indexOf(min);
			temp = num.get(i);
			num.set(indexOfMin,temp);
			num.set(i, min);
			
		}
		System.out.println(num);

	}
	

	public static int searchSmallest(int start,List<Integer> nums){
		long min= 1000000;
		for(int i=start;i<nums.size();i++){
			if(nums.get(i)<min)
			min = nums.get(i);
		}
		
		return (int)min;
		
	}

}