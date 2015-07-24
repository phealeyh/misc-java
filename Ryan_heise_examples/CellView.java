import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class CellView extends JPanel implements View {
	private CellModel model;
	private Spreadsheet spreadsheet;
	private JTable table;

	public CellView(Spreadsheet spreadsheet) {
		this.spreadsheet = spreadsheet;

		setLayout(new BorderLayout());
		model = new CellModel();
		add(table = new JTable(model), BorderLayout.CENTER);
		add(buttons(), BorderLayout.SOUTH);

		spreadsheet.attach(this);
	}

	private Box buttons() {
		Box box = Box.createHorizontalBox();
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new SortController());
		box.add(sortButton);
		JButton randButton = new JButton("Randomise");
		randButton.addActionListener(new RandController());
		box.add(randButton);
		return box;
	}

	public void update() {
		model.fireTableDataChanged();
	}

	private class SortController implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			spreadsheet.sort();
		}
	}

	private class RandController implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			spreadsheet.randomise();
		}
	}

	private class CellModel extends AbstractTableModel {
		public Object getValueAt(int row, int col) {
			return spreadsheet.get(row);
		}

		public int getColumnCount() {
			return 1;
		}

		public int getRowCount() {
			return spreadsheet.getRowCount();
		}
	}
}
