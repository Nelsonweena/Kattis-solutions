

import java.util.Scanner;

public class reversebinary2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int originalNum = Integer.parseInt(sc.nextLine());

		String binaryString = Integer.toBinaryString(originalNum);

		String reverseBinaryString = "";

		int binLen = binaryString.length();

		for (int i = 0; i < binLen; i++) {
			reverseBinaryString += binaryString.charAt(binLen - i - 1);
		}

		int newNum = Integer.parseInt(reverseBinaryString, 2);

		System.out.println(Integer.toString(newNum));
		sc.close();
	}
}