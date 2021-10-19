package com.company;

import javax.swing.JOptionPane;

public class EuropeanEuro {
    // 1 Euro is equal to...
    static double PKR_VALUE = 187.62;
    static double DOLLAR_VALUE = 1.19;
    static double TURKISH_LIRA_VALUE = 10.29;
    static double JAPANESE_YEN_VALUE = 132.23;
    static double SAUDI_RIYAL_VALUE = 4.47;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void euroToPkrPopUp() {
        popUp.showMessageDialog(null, this.amount + " Euro are equals to " + euroToPkrCalculate() + " Pakistani Rupees", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double euroToPkrCalculate() { return this.amount * PKR_VALUE; }

    public void euroToDollarPopUp() {
        popUp.showMessageDialog(null, this.amount + " Euro are equals to " + euroToDollarCalculate() + " Dollars", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double euroToDollarCalculate() {
        return this.amount * DOLLAR_VALUE;
    }

    public void euroToLiraPopUp() {
        popUp.showMessageDialog(null, this.amount + " Euro are equals to " + euroToLiraCalculate() + " Turkish Lira", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double euroToLiraCalculate() {
        return this.amount * TURKISH_LIRA_VALUE;
    }

    public void euroToYenPopUp() {
        popUp.showMessageDialog(null, this.amount + " Euro are equals to " + euroToYenCalculate() + " Japanese Yen", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double euroToYenCalculate() {
        return this.amount * JAPANESE_YEN_VALUE;
    }

    public void euroToSRiyalPopUp() {
        popUp.showMessageDialog(null, this.amount + " Euro are equals to " + euroToSRiyalCalculate() + " Saudi Riyal", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double euroToSRiyalCalculate() {
        return this.amount * SAUDI_RIYAL_VALUE;
    }

    public void euroToEuroPopUp(){
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
