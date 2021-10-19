package com.company;

import javax.swing.JOptionPane;

public class JapaneseYen {
    // 1 Yen is equal to...
    final double PKR_VALUE = 1.42;
    final double DOLLAR_VALUE = 0.0090;
    final double EURO_VALUE = 0.0076;
    final double TURKISH_LIRA_VALUE = 0.079;
    final double SAUDI_RIYAL_VALUE = 0.034;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void yenToPkrPopUp() {
        popUp.showMessageDialog(null, this.amount + " Yen are equals to " + yenToPkrCalculate() + " Pakistani Rupees", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double yenToPkrCalculate() { return this.amount * PKR_VALUE; }

    public void yenToDollarPopUp() {
        popUp.showMessageDialog(null, this.amount + " Yen are equals to " + yenToDollarCalculate() + " Dollars", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double yenToDollarCalculate() {
        return this.amount * DOLLAR_VALUE;
    }

    public void yenToEuroPopUp() {
        popUp.showMessageDialog(null, this.amount + " Yen are equals to " + yenToEuroCalculate() + " European Euro", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double yenToEuroCalculate() {
        return this.amount * EURO_VALUE;
    }

    public void yenToLiraPopUp() {
        popUp.showMessageDialog(null, this.amount + " Yen are equals to " + yenToLiraCalculate() + " Turkish Lira", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double yenToLiraCalculate() {
        return this.amount * TURKISH_LIRA_VALUE;
    }

    public void yenToSRiyalPopUp() {
        popUp.showMessageDialog(null, this.amount + " Yen are equals to " + yenToSRiyalCalculate() + " Saudi Riyal", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double yenToSRiyalCalculate() {
        return this.amount * SAUDI_RIYAL_VALUE;
    }

    public void yenToYenPopUp(){
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
