package com.company;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLOutput;

public class MyFrame extends JFrame implements ActionListener {
    JPanel topPanel;
    JPanel rightPanel;
    JPanel bottomPanel;
    JPanel leftPanel;

    JPanel centerPanel;
    JPanel centerPanel1;
    JPanel centerPanel2;
    JPanel centerPanel3;

    JButton button;

    JComboBox convertFromBox;
    JComboBox convertToBox;

    JLabel enterAmount;
    JTextField amount;



    MyFrame(){
        this.setSize(350,550);
        this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout(5,5));

        //Instantiate
        topPanel = new JPanel();
        rightPanel = new JPanel();
        bottomPanel = new JPanel();
        leftPanel = new JPanel();

        //Instantiate
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,1));
        centerPanel1 = new JPanel();
        centerPanel2 = new JPanel();
        centerPanel3 = new JPanel();


//        topPanel.setBackground(Color.green);
//        rightPanel.setBackground(Color.blue);
//        bottomPanel.setBackground(Color.magenta);
//        leftPanel.setBackground(Color.yellow);
//        centerPanel.setBackground(Color.pink);
//        centerPanel1.setBackground(Color.gray);
//        centerPanel2.setBackground(Color.lightGray);

        topPanel.setPreferredSize(new Dimension(0,20));
        rightPanel.setPreferredSize(new Dimension(40,0));
        bottomPanel.setPreferredSize(new Dimension(0,60));
        leftPanel.setPreferredSize(new Dimension(40,0));

        Border titleBorder = BorderFactory.createLineBorder(new Color(0x3c6e71),2,true);
        Font titleFont = new Font(null,Font.BOLD,17);
        centerPanel1.setBorder(BorderFactory.createTitledBorder(titleBorder,"Enter Currency:",0,0,titleFont));
        centerPanel2.setBorder(BorderFactory.createTitledBorder(titleBorder,"Convert From:",0,0,titleFont));
        centerPanel3.setBorder(BorderFactory.createTitledBorder(titleBorder,"Convert To:",0,0,titleFont));

        centerPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        centerPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Instantiate
        button = new JButton("Convert");
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(120,40));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Border buttonBorder = BorderFactory.createLineBorder(new Color(0x004e64),2,true);
        button.setBorder(buttonBorder);
        button.setBackground(new Color(0x25a18e));
        button.setForeground(Color.white);
        button.setFont(new Font(null,Font.BOLD,12));
        button.addActionListener(this);

        String[] convertFromCurrency = {"Pakistani Rupees","US Dollars","European Euro", "Turkish Lira","Japanese Yen","Saudi Riyal"};
        //Instantiate
        convertFromBox = new JComboBox(convertFromCurrency);
        convertFromBox.setPreferredSize(new Dimension(170,30));

        String[] convertToCurrency = {"US Dollars","Pakistani Rupees","European Euro", "Turkish Lira","Japanese Yen","Saudi Riyal"};
        //Instantiate
        convertToBox = new JComboBox(convertToCurrency);
        convertToBox.setPreferredSize(new Dimension(170,30));

//        JPanel enterAmountPanel = new JPanel();
//        enterAmountPanel.setBackground(Color.green);
//        enterAmountPanel.setLayout(new BorderLayout());
//        enterAmountPanel.setPreferredSize(new Dimension(270,50));

        //Instantiate
        enterAmount = new JLabel("Enter Amount: ");
        amount = new JTextField();

        amount.setPreferredSize(new Dimension(220,25));


        centerPanel1.add(enterAmount);
        centerPanel1.add(amount);
//        centerPanel1.add(enterAmountPanel);
        centerPanel2.add(convertFromBox);
        centerPanel3.add(convertToBox);
        centerPanel.add(centerPanel1);
        centerPanel.add(centerPanel2);
        centerPanel.add(centerPanel3);
        bottomPanel.add(button);
        this.add(topPanel,BorderLayout.NORTH);
        this.add(rightPanel,BorderLayout.EAST);
        this.add(bottomPanel,BorderLayout.SOUTH);
        this.add(leftPanel,BorderLayout.WEST);
        this.add(centerPanel,BorderLayout.CENTER);

        this.setVisible(true);
//        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane tPopUp = new JOptionPane();
        ImageIcon image = new ImageIcon("PKR.png");
        tPopUp.setIcon(image);

        double getAmountDouble = 0;
        if(Double.parseDouble(amount.getText()) <= 0){
            new JOptionPane().showMessageDialog(null, "Enter a valid currency", "Warning",JOptionPane.WARNING_MESSAGE);
            amount.setText(" ");
        }
        else {
            getAmountDouble = Double.parseDouble(amount.getText());

            PakistaniPKR pakistaniPKR = new PakistaniPKR();
            UsDollars usDollars = new UsDollars();
            EuropeanEuro europeanEuro = new EuropeanEuro();
            TurkishLira turkishLira = new TurkishLira();
            JapaneseYen japaneseYen = new JapaneseYen();
            SaudiRiyal saudiRiyal = new SaudiRiyal();




            //Pakistani Rupees...
            if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "US Dollars" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToDollarPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "European Euro" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToEuroPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "Turkish Lira" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToLiraPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "Japanese Yen" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToYenPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "Saudi Riyal" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToSRiyalPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Pakistani Rupees" && convertToBox.getSelectedItem() == "Pakistani Rupees" ){
                pakistaniPKR.setAmount(getAmountDouble);
                pakistaniPKR.pkrToPkrPopUp();

                amount.setText(" ");
            }



            

            //US Dollars...
            if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "Pakistani Rupees"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToPkrPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "European Euro"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToEuroPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "Turkish Lira"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToLiraPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "Japanese Yen"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToYenPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "Saudi Riyal"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToSRiyalPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "US Dollars" && convertToBox.getSelectedItem() == "US Dollars"){
                usDollars.setAmount(getAmountDouble);
                usDollars.usdToUsdPopUp();

                amount.setText(" ");
            }





            //EUROPEAN EURO...
            if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "Pakistani Rupees"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToPkrPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "US Dollars"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToDollarPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "Turkish Lira"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToLiraPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "Japanese Yen"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToYenPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "Saudi Riyal"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToSRiyalPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "European Euro" && convertToBox.getSelectedItem() == "European Euro"){
                europeanEuro.setAmount(getAmountDouble);
                europeanEuro.euroToEuroPopUp();

                amount.setText(" ");
            }





            // Turkish Lira...
            if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "Pakistani Rupees"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToPkrPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "US Dollars"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToDollarPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "European Euro"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToEuroPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "Japanese Yen"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToYenPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "Saudi Riyal"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToSRiyalPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Turkish Lira" && convertToBox.getSelectedItem() == "Turkish Lira"){
                turkishLira.setAmount(getAmountDouble);
                turkishLira.liraToLiraPopUp();

                amount.setText(" ");
            }





            //Japanese Yen...
            if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "Pakistani Rupees"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToPkrPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "US Dollars"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToDollarPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "European Euro"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToEuroPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "Turkish Lira"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToLiraPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "Saudi Riyal"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToSRiyalPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Japanese Yen" && convertToBox.getSelectedItem() == "Japanese Yen"){
                japaneseYen.setAmount(getAmountDouble);
                japaneseYen.yenToYenPopUp();

                amount.setText(" ");
            }





            //Saudi Riyal...
            if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "Pakistani Rupees"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToPkrPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "US Dollars"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToDollarPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "European Euro"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToEuroPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "Turkish Lira"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToLiraPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "Japanese Yen"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToYenPopUp();

                amount.setText(" ");
            }
            else if(convertFromBox.getSelectedItem() == "Saudi Riyal" && convertToBox.getSelectedItem() == "Saudi Riyal"){
                saudiRiyal.setAmount(getAmountDouble);
                saudiRiyal.sRiyalToSRiyalPopUp();

                amount.setText(" ");
            }

        }
    }
}

// green        0x3c6e71
//red           0xf94144
//light green   0x25a18e
//golden        0xff7f51
// dark red     0xb71c1c
