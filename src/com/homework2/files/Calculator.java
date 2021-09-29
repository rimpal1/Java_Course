package com.homework2.files;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class Calculator {
    public static class Main extends JFrame implements ActionListener {
        JTextField textFieldInput1;
        JTextField textFieldInput2;
        JTextField textFieldAnswer;
    public static void main(String[] args) {
        new Main().display();
    }

        private void display() {
            setSize(new Dimension(600,450) );
            Container container = getContentPane();
            container.setLayout(null);
            container.setBackground(Color.decode("#ECE9D8"));

            //adding text fields
            textFieldInput1 = new JTextField(" ");
            textFieldInput1.setBounds(50,140,120,50);
            textFieldInput1.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            textFieldInput2 = new JTextField(" ");
            textFieldInput2.setBounds(250,140,120,50);
            textFieldInput2.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            textFieldAnswer = new JTextField(" ");
            textFieldAnswer.setBounds(430,140,120,50);
            textFieldAnswer.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            container.add(textFieldInput1);
            container.add(textFieldInput2);
            container.add(textFieldAnswer);

            //adding action listener
            textFieldInput1.addActionListener(this);
            textFieldInput2.addActionListener(this);
            textFieldAnswer.addActionListener(this);

            //adding radio buttons
            JRadioButton plusButton = new JRadioButton();
            plusButton.setBounds(200,110,20,20);
            plusButton.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            JRadioButton minusButton = new JRadioButton();
            minusButton.setBounds(200,160,20,20);
            minusButton.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            JRadioButton multiplyButton = new JRadioButton();
            multiplyButton.setBounds(200,210,20,20);
            multiplyButton.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            JRadioButton divisionButton = new JRadioButton();
            divisionButton.setBounds(200,260,20,20);
            divisionButton.setBorder(new LineBorder(Color.decode("#7996ac"),1));

            container.add(plusButton);
            container.add(minusButton);
            container.add(multiplyButton);
            container.add(divisionButton);

            //adding action listener
            plusButton.addActionListener(this);
            minusButton.addActionListener(this);
            multiplyButton.addActionListener(this);
            divisionButton.addActionListener(this);
            //adding labels

            JLabel plusLabel = new JLabel("+");
            plusLabel.setBounds(230,110,20,20);

            JLabel minusLabel = new JLabel("-");
            minusLabel.setBounds(230,160,20,20);

            JLabel multiplyLabel = new JLabel("*");
            multiplyLabel.setBounds(230,213,20,20);

            JLabel divideLabel = new JLabel("/");
            divideLabel.setBounds(230,260,20,20);

            JLabel equalsLabel = new JLabel("=");
            equalsLabel.setBounds(400,160,20,20);

            container.add(plusLabel);
            container.add(minusLabel);
            container.add(multiplyLabel);
            container.add(divideLabel);
            container.add(equalsLabel);

            setVisible(true);


        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try{
                textFieldInput1.getText();
                textFieldInput2.getText();
            }catch (ArithmeticException exception){
                System.out.println("Dividing by 0 is not correct");
            }catch (InputMismatchException exception){
                System.out.println("Please enter integer value");
            }
        }
    }

}
