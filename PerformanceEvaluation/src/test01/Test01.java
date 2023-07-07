package test01;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/05
 * 이름 : 노수현
 * 내용 : 01. JAVA,MSA 수행평가
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
