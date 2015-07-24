import javax.swing.*;
import java.awt.*;

public class SpreadsheetWindow extends JFrame { //aka the main gui window
	private Spreadsheet spreadsheet;
	private TableView tableView;
	private GraphView graphView;

	public SpreadsheetWindow(Spreadsheet spreadsheet) {
		this.spreadsheet = spreadsheet;

		setLayout(new GridLayout(1, 2));
		add(tableView = new TableView(spreadsheet));
		add(graphView = new GraphView(spreadsheet));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		
	}

	public static void main(String[] args) {
		SpreadsheetWindow window = new SpreadsheetWindow(new Spreadsheet(10, 3));
		window.setVisible(true);
	}
}
