import java.util.*;

public class Spreadsheet {
	private int[] data;
	private LinkedList<View> views;

	public Spreadsheet(int size) {
		data = new int[size];
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
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

	public int getRowCount() {
		return data.length;
	}

	public int get(int i) {
		return data[i];
	}

	public void set(int i, int number) {
		data[i] = number;
		notifyAllViews();
	}

	public void sort() {
		Arrays.sort(data);
		notifyAllViews();
	}

	public void randomise() {
		for (int i = 0; i < data.length; i++) {
			int pos = (int)(data.length * Math.random());

			swap(i, pos);
		}
		notifyAllViews();
	}

	private void swap(int pos1, int pos2) {
		int temp = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = temp;
	}
}
