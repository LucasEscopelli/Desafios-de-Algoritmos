package provas;

import java.util.Scanner;

public class CasasRua {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// input for cell
		int cell_size = in.nextInt();
		int cell[] = new int[cell_size];
		for (int idx = 0; idx < cell_size; idx++) {
			cell[idx] = in.nextInt();
		}
		System.out.println("a");
		// input for days
		int days = in.nextInt();

		int[] result = stateOfCells(cell, days);
		for (int idx = 0; idx < result.length - 1; idx++) {
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}

	// 0 | 1 0 1 0 1 0 1 0 | 0
	public static int[] stateOfCells(int[] cell, int days) {
		int[] answer = new int[100];
		answer = seila(cell);
		
		for (int i = 0; i < days; i++) {
			answer = seila(cell);
		}

		return answer;
	}
	
	private static int[] seila(int cell[]) {
		
		int[] answer = new int[8];
		
		for (int i = 0; i < cell.length; i++) {
			if (i == 0) {
				answer[i] = cell[i + 1];

			} else if (i == (cell.length - 1)) {
				answer[i] = cell[i - 1];
			} else {
				if (cell[i + 1] == cell[i - 1]) {
					answer[i] = 0;
				} else {
					answer[i] = 1;
				}
			}
		}
		return answer;
	}

}
