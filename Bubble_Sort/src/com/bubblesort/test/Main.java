package com.bubblesort.test;

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
	
	System.out.println(num);
	int temp;
	for(int i=0;i<num.size()-1;i++){
		for(int j=0;j<num.size()-i-1;j++){
			if(num.get(j) > num.get(j+1)){
				temp = num.get(j);
				num.set(j, num.get(j+1));
				num.set(j+1,temp);
			}
		}
	}
	
	System.out.println(num);
	
	}

}
