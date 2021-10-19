package com.company;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class PakistaniPKR {

    //  Pakistani 1 Rupees is equal to...
    final double DOLLAR_VALUE = 0.0064;
    final double EURO_VALUE = 0.0054;
    final double TURKISH_LIRA_VALUE = 0.056;
    final double JAPANESE_YEN_VALUE = 0.70;
    final double SAUDI_RIYAL_VALUE = 0.024;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void pkrToDollarPopUp() {
        popUp.showMessageDialog(null, this.amount + " PKR are equals to " + pkrToDollarCalculate() + " Dollars", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double pkrToDollarCalculate() { return this.amount * DOLLAR_VALUE; }

    public void pkrToEuroPopUp() {
        popUp.showMessageDialog(null, this.amount + " PKR are equals to " + pkrToEuroCalculate() + " European Euro", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double pkrToEuroCalculate() {
        return this.amount * EURO_VALUE;
    }


    public void pkrToLiraPopUp() {
        popUp.showMessageDialog(null, this.amount + " PKR are equals to " + pkrToLiraCalculate() + " Turkish Lira", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double pkrToLiraCalculate() {
        return this.amount * TURKISH_LIRA_VALUE;
    }


    public void pkrToYenPopUp() {
        popUp.showMessageDialog(null, this.amount + " PKR are equals to " + pkrToYenCalculate() + " Japanese Yen", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double pkrToYenCalculate() {
        return this.amount * JAPANESE_YEN_VALUE;
    }


    public void pkrToSRiyalPopUp() {
        popUp.showMessageDialog(null, this.amount + " PKR are equals to " + pkrToSRiyalCalculate() + " Saudi Riyal", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double pkrToSRiyalCalculate() {
        return this.amount * SAUDI_RIYAL_VALUE;
    }

    public void pkrToPkrPopUp() {
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }
}


