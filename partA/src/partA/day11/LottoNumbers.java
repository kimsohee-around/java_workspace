package partA.day11;

import java.util.Arrays;

public class LottoNumbers {

	
	public static void main(String[] args) {
		

		int[] lottoNumbers = new int[6];
		int i=0;
		int temp = (int)(Math.random()*45 +1);
		lottoNumbers[i]=temp;
		System.out.println(String.format("lotto[%d] = %d", i,lottoNumbers[i++]));
	
		while(i!=6) {
			temp = (int)(Math.random()*45 +1);
			int j=0;
			for(j=0;j<i;j++) {
				if(lottoNumbers[j]==temp) {
					System.out.println("*배열에 있는 값 : "+temp);
					break;
				}
			}
			
			if(j==i) {
				lottoNumbers[i]=temp;
				System.out.println(String.format("lotto[%d] = %d", i,lottoNumbers[i]));
				i++;
			}
		}

		System.out.println(Arrays.toString(lottoNumbers));
	}
}
