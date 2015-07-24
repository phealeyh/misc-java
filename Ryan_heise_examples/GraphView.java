import javax.swing.*;
import java.awt.*;

public class GraphView extends JPanel implements View {
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

		int gap = 5;
		int barHeight = size.height / spreadsheet.getRowCount();
		int realBarHeight = barHeight - gap;

		for (int row = 0; row < spreadsheet.getRowCount(); row++) {
			g.setColor(Color.green);
			g.fillRect(0, row*barHeight, spreadsheet.get(row)*15, realBarHeight);
		}
	}
}
