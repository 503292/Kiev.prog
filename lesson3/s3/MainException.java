package lesson3.s3;

import javax.swing.JOptionPane;

public class MainException {
	public static void main(String[] args) {
		double a;

		for (;;) {

			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				if (a < 0) {
					throw new NegativException();
				}

				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Cancel");
				a = 0;
				break;
			} catch (NegativException e) {

				JOptionPane.showMessageDialog(null, e.getMessage());

			}
		}
		System.out.println(a);
	}
}
