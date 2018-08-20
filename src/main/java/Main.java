import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Screen screen = new Screen();
        JFrame frame = new JFrame("Screen");
        frame.setContentPane(screen.getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(400, 400, 550, 400);

        Setup(screen);
    }

    private static void Setup(Screen screen) {
        JComboBox cmbCurrency = screen.getCmbCurrency();

        cmbCurrency.getSelectedItem();
        cmbCurrency.addItem(("Euro"));
        cmbCurrency.addItem("Lek");
        cmbCurrency.addItem("Dollars");
    }

}
