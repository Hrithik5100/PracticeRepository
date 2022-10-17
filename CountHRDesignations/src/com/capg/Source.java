package com.capg;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			String[] output = new String[num];
			String[] input = new String[num];
			int count = 0;
			for(int i=0;i<num;i++) {
				input[i]=sc.next();
			}
			for(int i=0;i<num;i++) {
				if(input[i].contains("HR")) {
					output[count]=input[i];
					count++;
				}
			}
			if(count==0) {
				System.out.println("No dept found");
			}
			else {
				System.out.println("Total"+" "+count+" "+ "designations found");
				for(int i=0;i<count;i++) {
					System.out.println(output[i].toUpperCase());
				}
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
		

	}

}
