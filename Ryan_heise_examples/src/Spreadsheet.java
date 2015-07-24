import java.util.*;

public class Spreadsheet { //aka apartment classs
	private int[][] data;
	private LinkedList<View> views;

	public Spreadsheet(int rows, int cols) {
		data = new int[rows][cols];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				data[row][col] = (int)(100*Math.random()) + 1;
			}
		}

		views = new LinkedList<View>();
	}

	public void attach(View view) {
		views.add(view);
	}

	private void notifyAllViews() {
		for (View view : views) {
			view.update();
		}
	}

	public void setCell(int row, int col, int value) {
		data[row][col] = value;
		notifyAllViews();
	}

	public int getCell(int row, int col) {
		return data[row][col];
	}

	public int getRowCount() {
		return data.length;
	}

	public int getColCount() {
		return data[0].length;
	}

	public void sort(int col) {
		for (int right = data.length - 1; right > 0; right--) {
			for (int i = 0; i < right; i++) {
				if (getCell(i, col) > getCell(i+1, col)) {
					swapRows(i, i+1);
				}
			}
		}
		notifyAllViews();
	}

	public void randomise() {
		for (int row = 0; row < getRowCount(); row++) {
			int randomRow = (int)(Math.random()*getRowCount());
			swapRows(row, randomRow);
		}
		notifyAllViews();
	}

	private void swapRows(int i, int j) {
		int[] temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
