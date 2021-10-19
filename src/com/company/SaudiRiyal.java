package com.company;

import javax.swing.JOptionPane;

public class SaudiRiyal {
    // 1 SaudiRiyal is equal to...
    final double PKR_VALUE = 42.03;
    final double DOLLAR_VALUE = 0.27;
    final double EURO_VALUE = 0.22;
    final double TURKISH_LIRA_VALUE = 2.34;
    final double JAPANESE_YEN_VALUE = 29.54;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void sRiyalToPkrPopUp() {
        popUp.showMessageDialog(null, this.amount + " Saudi Riyal are equals to " + sRiyalToPkrCalculate() + " Pakistani Rupees", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double sRiyalToPkrCalculate() { return this.amount * PKR_VALUE; }

    public void sRiyalToDollarPopUp() {
        popUp.showMessageDialog(null, this.amount + " Saudi Riyal are equals to " + sRiyalToDollarCalculate() + " Dollars", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double sRiyalToDollarCalculate() {
        return this.amount * DOLLAR_VALUE;
    }

    public void sRiyalToEuroPopUp() {
        popUp.showMessageDialog(null, this.amount + " Saudi Riyal are equals to " + sRiyalToEuroCalculate() + " European Euro", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double sRiyalToEuroCalculate() {
        return this.amount * EURO_VALUE;
    }

    public void sRiyalToLiraPopUp() {
        popUp.showMessageDialog(null, this.amount + " Saudi Riyal are equals to " + sRiyalToLiraCalculate() + " Turkish Lira", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double sRiyalToLiraCalculate() {
        return this.amount * TURKISH_LIRA_VALUE;
    }

    public void sRiyalToYenPopUp() {
        popUp.showMessageDialog(null, this.amount + " Saudi Riyal are equals to " + sRiyalToYenCalculate() + " Japanese Yen", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double sRiyalToYenCalculate() {
        return this.amount * JAPANESE_YEN_VALUE;
    }

    public void sRiyalToSRiyalPopUp(){
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
