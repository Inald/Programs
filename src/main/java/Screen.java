import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Screen {
    private JPanel panelMain;
    private JTextField txtMoney;
    private JButton btnRefresh;
    private JButton checkButton;
    private JComboBox cmbCurrency;
    private JTextField txtConversion;
    private static String currency;


    Screen() {
        //sets up the screen in which user operates with

        btnRefresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "APP UPDATED");


        }
        });
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Yet to be completed");

            }
        });


        cmbCurrency.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 currency = cmbCurrency.getSelectedItem().toString();
                 if(currency.equals("Dollars")){
                    String usd = getData("http://data.fixer.io/api/latest?access_key=237d9c939f1c58252c675ef0fa32bfd4","USD");
                     System.out.println(usd);
                 }else if(currency.equals("Lek")){

                }else if(currency.equals("Euro")){

                 }
            }
        });
    }

    public String getData(String U, String Currency){

        StringBuffer rsp = new StringBuffer();

        try {

            URL ticker = new URL(U);
            HttpURLConnection con = (HttpURLConnection) ticker.openConnection();
            con.setRequestMethod("GET");



            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            //while((inputLine = in.readLine()) != null){

            //}
            in.close();


        }catch (Exception e){

        }
        return rsp.toString();
    }


    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }

    public JTextField getTxtMoney() {
        return txtMoney;
    }

    public void setTxtMoney(JTextField txtMoney) {
        this.txtMoney = txtMoney;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public void setBtnRefresh(JButton btnRefresh) {
        this.btnRefresh = btnRefresh;
    }

    public JButton getCheckButton() {
        return checkButton;
    }

    public void setCheckButton(JButton checkButton) {
        this.checkButton = checkButton;
    }

    public JComboBox getCmbCurrency() {
        return cmbCurrency;
    }

    public void setCmbCurrency(JComboBox cmbCurrency) {
        this.cmbCurrency = cmbCurrency;
    }

    public JTextField getTxtConversion() {
        return txtConversion;
    }

    public void setTxtConversion(JTextField txtConversion) {
        this.txtConversion = txtConversion;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        Screen.currency = currency;
    }
}
