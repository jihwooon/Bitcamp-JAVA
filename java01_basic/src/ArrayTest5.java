class ArrayTest5 {
	public static void main(String[] args) {
		// 2���� �迭 : ������� �迭�� �����Ҷ�

		int[][] arr = new int[5][3];// �ʱⰪ�� 0�̴�.

		int arr2[][];
		arr2 = new int[5][5];

		// 2���� �迭�� ������ �����ϱ�
		arr[0][1] = 30;
		arr[2][0] = 10;
		arr[3][2] = 20;

		for (int r = 0; r < arr.length; r++) {// �� 0,1,2,3,4
			for (int c = 0; c < arr[r].length; c++) {// ��
				System.out.println(arr[r][c] + "\t");
			}
			System.out.println();
		}

		// 2���� �迭�� �ʱⰪ ����
		// int num[][] = new int[][]{}

		int num[][] = { { 30, 40, 50 }, { 40, 60, 10 }, { 40, 50, 80 } };// 3�� 3��
		System.out.println("-----------------------------");

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
				
				}
			System.out.println();
		}
	}// public end

}// class end
