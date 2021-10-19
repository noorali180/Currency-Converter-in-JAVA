package com.company;

import javax.swing.JOptionPane;

public class TurkishLira {
    // 1 Lira is equal to...
    final double PKR_VALUE = 17.98;
    final double DOLLAR_VALUE = 0.11;
    final double EURO_VALUE = 0.096;
    final double JAPANESE_YEN_VALUE = 12.64;
    final double SAUDI_RIYAL_VALUE = 0.43;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void liraToPkrPopUp() {
        popUp.showMessageDialog(null, this.amount + " Lira are equals to " + liraToPkrCalculate() + " Pakistani Rupees", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double liraToPkrCalculate() { return this.amount * PKR_VALUE; }

    public void liraToDollarPopUp() {
        popUp.showMessageDialog(null, this.amount + " Lira are equals to " + liraToDollarCalculate() + " Dollars", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double liraToDollarCalculate() {
        return this.amount * DOLLAR_VALUE;
    }

    public void liraToEuroPopUp() {
        popUp.showMessageDialog(null, this.amount + " Lira are equals to " + liraToEuroCalculate() + " European Euro", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double liraToEuroCalculate() {
        return this.amount * EURO_VALUE;
    }

    public void liraToYenPopUp() {
        popUp.showMessageDialog(null, this.amount + " Lira are equals to " + liraToYenCalculate() + " Japanese Yen", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double liraToYenCalculate() {
        return this.amount * JAPANESE_YEN_VALUE;
    }

    public void liraToSRiyalPopUp() {
        popUp.showMessageDialog(null, this.amount + " Lira are equals to " + liraToSRiyalCalculate() + " Saudi Riyal", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double liraToSRiyalCalculate() {
        return this.amount * SAUDI_RIYAL_VALUE;
    }

    public void liraToLiraPopUp(){
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
