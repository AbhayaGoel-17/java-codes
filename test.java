package Lec2;

import java.util.Scanner;

public class test{

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows (N): ");
		        int N = scanner.nextInt();
		        scanner.close();

		        int row = 1;
		        int num = 1;
		        while (row <= N) {
		            int spaces = N - row;
		            int col = 1;
		            while (col <= spaces) {
		                System.out.print("  ");
		                col++;
		            }

		            int count = 1;
		            while (count <= row) {
		                System.out.print(num + " ");
		                num++;
		                count++;
		            }

		            count = row - 1;
		            while (count >= 1) {
		                System.out.print(num + " ");
		                num--;
		                count-=2;
		            }

		            System.out.println();
		            row++;
		        }
		    }
		}

		
			
		