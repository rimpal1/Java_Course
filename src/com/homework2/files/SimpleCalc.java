package com.homework2.files;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.text.DecimalFormat;

public class SimpleCalc extends JFrame{

  JPanel panel;
    JTextField input1, input2, result;
    JRadioButton add,subtract,multiply, divide;
    JLabel equalsLabel;


    public SimpleCalc() {
        panel = new JPanel();
        GroupLayout paneLayout = new GroupLayout(panel);
        panel.setBackground(Color.decode("#ECE9D8"));
        panel.setLayout(paneLayout);

        input1 = new JTextField(" ");
        input1.setBounds(50, 140, 120, 50);
        input1.setHorizontalAlignment(JTextField.CENTER);
        input1.setBorder(new LineBorder(Color.decode("#7996ac"), 1));

        add = new JRadioButton("+");
        add.setBounds(200, 110, 76, 30);
        add.addActionListener(
                actionEvent -> {
                    String firstInput = input1.getText().trim();
                    String secondInput = input2.getText().trim();
                    if(firstInput.isEmpty() || secondInput.isEmpty())
                        JOptionPane.showMessageDialog(panel,"Input fields can't be empty",
                                "Empty textfield",JOptionPane.ERROR_MESSAGE);
                    else{
                        try{
                            int firstInputInt = Integer.parseInt(firstInput);
                            int secondInputInt = Integer.parseInt(secondInput);
                            int answer = firstInputInt + secondInputInt;
                            result.setText(String.valueOf(answer));
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(panel,
                                    "Alphabets or any other number than integer is not permitted",
                                    "Error!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );
        subtract = new JRadioButton("-");
        subtract.setBounds(200, 160, 65, 30);
        subtract.addActionListener(
                actionEvent -> {
                    String firstInput = input1.getText().trim();
                    String secondInput = input2.getText().trim();
                    if(firstInput.isEmpty() || secondInput.isEmpty())
                        JOptionPane.showMessageDialog(panel,"Input fields can't be empty",
                                "Empty textfield",JOptionPane.ERROR_MESSAGE);
                    else{
                        try{
                            int firstInputInt = Integer.parseInt(firstInput);
                            int secondInputInt = Integer.parseInt(secondInput);
                            int answer = firstInputInt - secondInputInt;
                            result.setText(String.valueOf(answer));
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(panel,
                                    "Alphabets or any other number than integer is not permitted",
                                    "Error!",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );

        multiply = new JRadioButton("*");
        multiply.setBounds(200, 210, 65, 40);
        multiply.addActionListener(
                actionEvent -> {
                    String firstInput = input1.getText().trim();
                    String secondInput = input2.getText().trim();
                    if(firstInput.isEmpty() || secondInput.isEmpty())
                        JOptionPane.showMessageDialog(panel,"Input fields can't be empty",
                                "Empty textfield",JOptionPane.ERROR_MESSAGE);
                    else{
                        try{
                            int firstInputInt = Integer.parseInt(firstInput);
                            int secondInputInt = Integer.parseInt(secondInput);
                            int answer = firstInputInt * secondInputInt;
                            result.setText(String.valueOf(answer));
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(panel,
                                    "Alphabets or any other number than integer is not permitted",
                                    "Error!",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );
        divide = new JRadioButton("/");
        divide.setBounds(200, 260, 65, 30);
        divide.addActionListener(
                actionEvent -> {
                    String firstInput = input1.getText().trim();
                    String secondInput = input2.getText().trim();
                    if(firstInput.isEmpty() || secondInput.isEmpty())
                        JOptionPane.showMessageDialog(panel,"Input fields can't be empty",
                                "Empty textfield",JOptionPane.ERROR_MESSAGE);
                    else{
                        try{
                            if(Integer.parseInt(secondInput)== 0){
                                JOptionPane.showMessageDialog(panel,"A number can not divided by 0.","Invalid input",JOptionPane.ERROR_MESSAGE);
                            }
                            else {
                                double firstInputInt = Integer.parseInt(firstInput);
                                double secondInputInt = Integer.parseInt(secondInput);
                                double answer = firstInputInt / secondInputInt;
                                DecimalFormat dc = new DecimalFormat("0.000");
                                String formattedText = dc.format(answer);
                                result.setText(String.valueOf(formattedText));

                            }
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(panel,
                                    "Alphabets or any other number than integer is not permitted",
                                    "Error!",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(add);
        buttonGroup.add(subtract);
        buttonGroup.add(multiply);
        buttonGroup.add(divide);

        input2 = new JTextField(" ");
        input2.setBounds(250, 140, 120, 50);
        input2.setHorizontalAlignment(JTextField.CENTER);
        input2.setBorder(new LineBorder(Color.decode("#7996ac"), 1));

        result = new JTextField(" ");
        result.setBounds(450, 140, 120, 50);
        result.setHorizontalAlignment(JTextField.CENTER);
        result.setBorder(new LineBorder(Color.decode("#7996ac"), 1));

        equalsLabel = new JLabel("=");
        equalsLabel.setBounds(400, 160, 20, 20);




        panel.setLayout(null);
        panel.add(input1);
        panel.add(input2);
        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);
        panel.add(equalsLabel);
        panel.add(result);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.add(panel);
       this.setSize(600,430);
       this.setVisible(true);
    }


    public static void main(String[] args) {
        new SimpleCalc();
    }
}
