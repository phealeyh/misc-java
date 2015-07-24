import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableView extends JPanel implements View{ //aka the seperate generated table class
	private Spreadsheet spreadsheet;
	private SpreadsheetTableModel model;
	private JTable table;

	public TableView(Spreadsheet spreadsheet) {
		this.spreadsheet = spreadsheet;

		model = new SpreadsheetTableModel();
		table = new JTable(model);

		setLayout(new BorderLayout());
		add(randomiseButton(), BorderLayout.NORTH);
		add(table, BorderLayout.CENTER);
		add(sortButtons(), BorderLayout.SOUTH);

		spreadsheet.attach(this);
	}

	public void update() {
		model.fireTableDataChanged();
	}

	private JButton randomiseButton() {
		JButton button = new JButton("Randomise");
		button.addActionListener(new RandController());
		return button;
	}

	private JPanel sortButtons() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, spreadsheet.getColCount()));
		for (int i = 0; i < spreadsheet.getColCount(); i++) {
			panel.add(sortButton(i));
		}
		return panel;
	}

	private JButton sortButton(int col) {
		JButton button = new JButton("Sort");
		button.addActionListener(new SortController(col));
		return button;
	}

	private class SpreadsheetTableModel extends AbstractTableModel {
		public Object getValueAt(int row, int col) {
			return spreadsheet.getCell(row, col);
		}

		public int getColumnCount() {
			return spreadsheet.getColCount();
		}

		public int getRowCount() {
			return spreadsheet.getRowCount();
		}
	}

	private class RandController implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			spreadsheet.randomise();
		}
	}

	private class SortController implements ActionListener {
		private int col;

		public SortController(int col) {
			this.col = col;
		}

		public void actionPerformed(ActionEvent event) {
			spreadsheet.sort(col);
		}
	}
}
