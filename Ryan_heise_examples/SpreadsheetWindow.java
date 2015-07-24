import javax.swing.*;
import java.awt.*;

public class SpreadsheetWindow extends JFrame {
	private CellView cellView;
	private GraphView graphView;

	public SpreadsheetWindow(Spreadsheet spreadsheet) {
		setLayout(new GridLayout(1, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(cellView = new CellView(spreadsheet));
		add(graphView = new GraphView(spreadsheet));

		pack();
	}

	public static void main(String[] args) {
		SpreadsheetWindow window = new SpreadsheetWindow(new Spreadsheet(10));
		window.setVisible(true);
	}
}
