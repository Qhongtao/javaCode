package test;

import java.util.Arrays;

public class addVaTest {
	public static void main(String[] args) {
		int sum = 0;
		int index = 0;
		for (int i = 1; i <=46; i++) {
			for (int j = i+2; j <=48; j++) {
				index = i*(i+1)+j*(j+1);
						for (int k = 1; k <=49; k++) {
							if (k!=i&&k!=j&&k!=(i+1)&&k!=(j+1)) {
								index = index+k;
								}				
							}
						if (index==2015) {
							System.out.println(i);
						}
						}
			}
		}
		
	}

