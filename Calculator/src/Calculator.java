import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,sixButton,fiveButton,
	        fourButton,threeButton,twoButton,oneButton,divButton,
	        mulButton,plusButton,minButton,equalButton,clearButton,
	        dotButton,zeroButton;
	float oldValue,newValue,result;
	int operation;
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 100);
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(30, 40, 540, 50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setFont(new Font("Calisto MT", Font.BOLD, 40));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 220, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 320, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 320, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 420, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
	    zeroButton.setBounds(130, 420, 80, 80);
	    zeroButton.addActionListener(this);
	    zeroButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 420, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 120, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(divButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(330, 220, 80, 80);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(mulButton);
		
	    minButton=new JButton("-");
		minButton.setBounds(330, 320, 80, 80);
		minButton.addActionListener(this);
		minButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(minButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 420, 80, 80);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 420, 80, 80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Calisto MT", Font.BOLD, 40));
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			displayLabel.setText(displayLabel.getText()+"7");
		}else if(e.getSource()==eightButton) {
		    displayLabel.setText(displayLabel.getText()+"8");
     	}else if(e.getSource()==nineButton) {
		    displayLabel.setText(displayLabel.getText()+"9");
	    }else if(e.getSource()==fourButton) {
	    	displayLabel.setText(displayLabel.getText()+"4");
	    }else if(e.getSource()==fiveButton) {
	    	displayLabel.setText(displayLabel.getText()+"5");
	    }else if(e.getSource()==sixButton) {
	    	displayLabel.setText(displayLabel.getText()+"6");
	    }else if(e.getSource()==oneButton) {
	    	displayLabel.setText(displayLabel.getText()+"1");
	    }else if(e.getSource()==twoButton) {
	    	displayLabel.setText(displayLabel.getText()+"2");
	    }else if(e.getSource()==threeButton) {
	    	displayLabel.setText(displayLabel.getText()+"3");
	    }else if(e.getSource()==zeroButton) {
	    	displayLabel.setText(displayLabel.getText()+"0");
	    }else if(e.getSource()==dotButton) {
	    	displayLabel.setText(displayLabel.getText()+".");
	    }else if(e.getSource()==divButton) {
	    	String oldText=displayLabel.getText();
	        oldValue=Float.parseFloat(oldText);
	        operation=1;
	        displayLabel.setText("");
	    }else if(e.getSource()==mulButton) {
	    	String oldText=displayLabel.getText();
	        oldValue=Float.parseFloat(oldText);
	        operation=2;
	        displayLabel.setText("");
	    }else if(e.getSource()==plusButton) {
	        String oldText=displayLabel.getText();
	        oldValue=Float.parseFloat(oldText);
	        operation=3;
	        displayLabel.setText("");
	  
	    }else if(e.getSource()==minButton) {
	    	String oldText=displayLabel.getText();
	        oldValue=Float.parseFloat(oldText);
	        operation=4;
	        displayLabel.setText("");
	        
	    }else if(e.getSource()==equalButton) {
	        String newText=displayLabel.getText();
	        newValue=Float.parseFloat(newText);
	    	switch (operation) {
			case 1:
				result=oldValue/newValue;
				displayLabel.setText(result+"");
				break;
			case 2:
				result=oldValue*newValue;
				displayLabel.setText(result+"");
				break;
			case 3:
				result=oldValue+newValue;
				displayLabel.setText(result+"");
				break;
			case 4:
				result=oldValue-newValue;
				displayLabel.setText(result+"");
				break;
			default:
				break;
			}
	    }else if(e.getSource()==clearButton) {
	    	displayLabel.setText("");
	    }

    }
}