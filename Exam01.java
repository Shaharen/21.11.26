import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] numArray = new int[3][5]; // 행렬로 생각

		numArray[1][2] = 3;
		numArray[2][4] = 10;

		int value = 1;
		// 입력부
		for (int j = 0; j < numArray.length; j++) { // 행의 길이 numArray.length
			for (int i = 0; i < numArray[0].length; i++) { // 열의 길이 numArray[0].length
				numArray[j][i] = value;
				value++;
				// System.out.print(numArray[j][i] + " ");
			} // System.out.println();
		}
		// 출력부
		for (int j = 0; j < numArray.length; j++) {
			// 한행 출력
			for (int i = 0; i < numArray[0].length; i++) {
				System.out.print(numArray[j][i] + " ");
			}
			System.out.println();
		}
		// System.out.println(Arrays.deepToString(numArray));

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				numArray[j][i] = i + 1 + (5 * j);
				System.out.print(numArray[j][i] + " ");
				// System.out.print(numArray[i][j] + " ");
			}
			System.out.println();

		}
		// System.out.println(Arrays.deepToString(numArray));

	}

}
