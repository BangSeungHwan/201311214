package com.sd.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.Container;

public class GameGUI extends JFrame implements ActionListener {

	JTextField playerTf1;
	JTextField playerTf2;
	JTextField playerSTF1;
	JTextField playerSTF2;	

	JButton b1;
	JButton b2;
	JButton b3;

	public GameGUI() {
		//JFrame f = new JFrame();
		JPanel panel = new JPanel(new GridLayout(6,5));
		getContentPane().add(panel);
		JLabel label1 = new JLabel("Player1 turns on");
		JLabel label2 = new JLabel("Player2 turns on");
		JLabel label3 = new JLabel("Player1 score");
		JLabel label4 = new JLabel("Player2 score");
		playerTf1 = new JTextField(5);
		playerTf2 = new JTextField(5);
		playerSTF1 = new JTextField(5);
		playerSTF2 = new JTextField(5);
		b1 = new JButton("주사위게임");
		b2 = new JButton("윷놀이게임");
		b3 = new JButton("초기화");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		panel.add(label1);
		panel.add(playerTf1);
		panel.add(label2);
		panel.add(playerTf2);
		panel.add(label3);
		panel.add(playerSTF1);
		panel.add(label4);
		panel.add(playerSTF2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if((JButton)e.getSource() == b1){

			Dice d1 = new Dice();
			Dice d2 = new Dice();
		
			int num1 = 0;
			int num2 = 0;

			for(int i=0; i<10; i++) {
				d1.roll();
				d2.roll();
				playerTf1.setText(Integer.toString(d1.getNum()));
				playerTf2.setText(Integer.toString(d2.getNum()));

				if(d1.getNum() > d2.getNum()) {
					num1++;
				}else if(d1.getNum() < d2.getNum()) {
					num2++;
				}			
			}
			playerSTF1.setText(Integer.toString(num1));
			playerSTF2.setText(Integer.toString(num2));
		}

		if((JButton)e.getSource() == b2){
			Yut y1 = new Yut();
			Yut y2 = new Yut();
		
			int num3 = 0;
			int num4 = 0;

			for(int i=0; i<10; i++) {
				y1.roll();
				y2.roll();
				playerTf1.setText(Integer.toString(y1.getNum()));
				playerTf2.setText(Integer.toString(y2.getNum()));

				if(y1.getNum() > y2.getNum()) {
					num3++;
				}else if(y1.getNum() < y2.getNum()) {
					num4++;
				}			
			}
			playerSTF1.setText(Integer.toString(num3));
			playerSTF2.setText(Integer.toString(num4));
		}
		
		if((JButton)e.getSource() == b3) {
			playerTf1.setText("");
			playerTf2.setText("");
			playerSTF1.setText("");
			playerSTF2.setText("");
		}
	}
}