package partA.day11;

import java.util.Arrays;

public class LottoNumbersss {

	
	public static void main(String[] args) {
		

		int[] lottoNumbers = new int[6];
		
		for(int i=0;i<6;i++) {
			lottoNumbers[i] = (int)(Math.random()*6+1);
			for(int j=0;j<i;j++) {
				if(lottoNumbers[i] == lottoNumbers[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(lottoNumbers));

	}
}
