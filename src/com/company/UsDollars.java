package com.company;

import javax.swing.JOptionPane;

public class UsDollars {
    //  US 1 Dollar is equal to...
    final double PKR_VALUE = 156.85;
    final double EURO_VALUE = 0.84;
    final double TURKISH_LIRA_VALUE = 8.74;
    final double JAPANESE_YEN_VALUE = 110.23;
    final double SAUDI_RIYAL_VALUE = 3.75;

    private double amount;

    JOptionPane popUp = new JOptionPane();

    public void usdToPkrPopUp() {
        popUp.showMessageDialog(null, this.amount + " USD are equals to " + usdToPkrCalculate() + " Pakistani Rupees", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double usdToPkrCalculate() { return this.amount * PKR_VALUE; }

    public void usdToEuroPopUp() {
        popUp.showMessageDialog(null, this.amount + " USD are equals to " + usdToEuroCalculate() + " European Euro", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double usdToEuroCalculate() {
        return this.amount * EURO_VALUE;
    }

    public void usdToLiraPopUp() {
        popUp.showMessageDialog(null, this.amount + " USD are equals to " + usdToLiraCalculate() + " Turkish Lira", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double usdToLiraCalculate() {
        return this.amount * TURKISH_LIRA_VALUE;
    }

    public void usdToYenPopUp() {
        popUp.showMessageDialog(null, this.amount + " USD are equals to " + usdToYenCalculate() + " Japanese Yen", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double usdToYenCalculate() {
        return this.amount * JAPANESE_YEN_VALUE;
    }

    public void usdToSRiyalPopUp() {
        popUp.showMessageDialog(null, this.amount + " USD are equals to " + usdToSRiyalCalculate() + " Saudi Riyal", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
    private double usdToSRiyalCalculate() {
        return this.amount * SAUDI_RIYAL_VALUE;
    }

    public void usdToUsdPopUp(){
        popUp.showMessageDialog(null,"Both Convert From and Convert To currencies should not be same..!" , "RESULT", JOptionPane.WARNING_MESSAGE);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
