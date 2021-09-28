package com.project.characters_java;

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;

public class CharCount extends JFrame implements ActionListener{  
    JLabel lb, lb1,lb2, lb3;  
    JTextArea textArea;  
    JButton countWords, textReverse;
    
    CharCount(){  
        super("Characters Count and Reverse");  
        
        lb=new JLabel("Input text here: ");  
        lb.setBounds(20,20,100,20);
        textArea=new JTextArea();  
        textArea.setBounds(20,45,380,200);  
        textArea.setBackground(new Color(254,200,216));
        
        lb1=new JLabel("Number of Characters: -");
        lb1.setBounds(20,250,150,20);  
        lb2=new JLabel("Number of Words: -");
        lb2.setBounds(46,270,150,20);  
        lb3=new JLabel("Palindrome Check: -");
        lb3.setBounds(40,290,150,20);
        
        countWords =new JButton("Count Words and Characters");  
        countWords.setBounds(20,315,220,30);  
        countWords.addActionListener(this);  

        textReverse=new JButton("Reverse/Palindrome");  
        textReverse.setBounds(250,315,150,30);
        textReverse.addActionListener(this);  
  
        add(textArea);add(countWords);add(textReverse);add(lb);add(lb1);add(lb2);add(lb3); 
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    public void actionPerformed(ActionEvent e){
        String text=textArea.getText();
        String words[]=text.split("\\s");
        String checkPalindrome;
        
        if(e.getSource()==countWords){    
        	lb1.setText("Number of Characters: "+text.length());        
        	lb2.setText("Number of Words: "+words.length); 
        	lb3.setText("Palindrome Check: -");
        }else if(e.getSource()==textReverse){
        	lb1.setText("Number of Characters: -");        
        	lb2.setText("Number of Words: -"); 
        	textArea.setText( new StringBuffer(text).reverse().toString());
        	checkPalindrome = textArea.getText();
        	if(text.equals(checkPalindrome)) {        	       
            	lb3.setText("Palindrome Check: Yes");
        	} else {      
            	lb3.setText("Palindrome Check: No");        		
        	}
        }  
    }
    
public static void main(String[] args) {  
    new CharCount();  
}}  