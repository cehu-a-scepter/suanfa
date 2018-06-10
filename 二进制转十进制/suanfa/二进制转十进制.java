package suanfa;

import java.util.Scanner;
import java.lang.Math;
public class 二进制转十进制 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		int sum=0;
		for(int i=str.length();i>0;i--) {
			if(str.charAt(i)==1) {
				sum+=Math.pow(2,(i-1));
			}else if(str.charAt(i)==0) {
				sum+=0;
			}
		}
		System.out.println(sum);
	}
}