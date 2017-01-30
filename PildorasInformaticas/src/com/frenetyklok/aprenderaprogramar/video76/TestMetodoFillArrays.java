package com.frenetyklok.aprenderaprogramar.video76;
import java.util.Arrays;

public class TestMetodoFillArrays {
	
	public static void main(String[] args){
		
		int[] miArray = new int[10];
		
		Arrays.fill(miArray, 33);
		
		for(int tmp: miArray){
			System.out.print(tmp + ", ");
		}
		
		System.out.println("");
		
		Arrays.fill(miArray, 1, 9, 7);
		
		for(int tmp: miArray){
			System.out.print(tmp + ", ");
		}
		
	}

}
