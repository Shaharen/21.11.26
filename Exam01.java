import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		// 2���� �迭
		int[][] numArray = new int[3][5]; // ��ķ� ����

		numArray[1][2] = 3;
		numArray[2][4] = 10;

		int value = 1;
		// �Էº�
		for (int j = 0; j < numArray.length; j++) { // ���� ���� numArray.length
			for (int i = 0; i < numArray[0].length; i++) { // ���� ���� numArray[0].length
				numArray[j][i] = value;
				value++;
				// System.out.print(numArray[j][i] + " ");
			} // System.out.println();
		}
		// ��º�
		for (int j = 0; j < numArray.length; j++) {
			// ���� ���
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
