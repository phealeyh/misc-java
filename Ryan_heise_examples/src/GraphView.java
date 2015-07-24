import java.awt.*;
import javax.swing.*;

public class GraphView extends JPanel implements View { //aka the right panel calss
	private Color[] colors = { Color.green, Color.red, Color.yellow, Color.blue, Color.orange };
	private Spreadsheet spreadsheet;

	public GraphView(Spreadsheet spreadsheet) {
		this.spreadsheet = spreadsheet;
		spreadsheet.attach(this);
	}

	public void update() {
		repaint();
	}

	public void paint(Graphics g) {
		Dimension size = getSize();

		g.setColor(Color.black);
		g.fillRect(0, 0, size.width, size.height);

		for (int i = 0; i < spreadsheet.getColCount(); i++) {
			paintGraph(g, i, size);
		}
	}

	private void paintGraph(Graphics g, int col, Dimension size) {
		final int BUTTON_HEIGHT = 20;
		int width = size.width / spreadsheet.getColCount();
		int left = col * width;
		int top = BUTTON_HEIGHT;
		int height = size.height - top - BUTTON_HEIGHT;
		int barHeight = height / spreadsheet.getRowCount();
		int realBarHeight = barHeight - 3;

		Color color = colors[col];

		g.setColor(color);
		for (int row = 0; row < spreadsheet.getRowCount(); row++) {
			g.fillRect(left, top + row*barHeight, spreadsheet.getCell(row, col), realBarHeight);
		}
	}
}
