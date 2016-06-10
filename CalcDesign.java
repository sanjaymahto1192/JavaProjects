import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class CalcDesign extends JFrame{


	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn0;
	public JButton btnEqual;
	public JButton btnAdd;
	public JButton btnSub;
	public JButton btnMul;
	public JButton btnDiv;
	public JButton btnClear;
	public JButton btnCos;
	public JButton btnSin;
	public JButton btnTan;
	public JButton btnExp;
	public JButton btnToDeg;
	public JButton btnToRad;
	public JButton btnDot;
	public JTextField txt;
	public double result;
	public double temp;
	String display = "";
	public JFrame f;
	String sym = "";

	public CalcDesign() {
		f = new JFrame("Layout");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.WEST);
		f.add(p3,BorderLayout.CENTER);
		f.setSize(360,400);
		f.setResizable(false);
		
		p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
		txt = new JTextField(15);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setEditable(false);
		txt.setPreferredSize(new Dimension(40,40));
		p1.add(txt);

		p2.setLayout(new GridLayout(4,3,5,5));
		p2.add(btn1 = new JButton("1"));
		p2.add(btn2 = new JButton("2"));
		p2.add(btn3 = new JButton("3"));
		p2.add(btn4 = new JButton("4"));
		p2.add(btn5 = new JButton("5"));
		p2.add(btn6 = new JButton("6"));
		p2.add(btn7 = new JButton("7"));
		p2.add(btn8 = new JButton("8"));
		p2.add(btn9 = new JButton("9"));
		p2.add(btn0 = new JButton("0"));
		p2.add(btnDot= new JButton("."));
		btnEqual = new JButton("=");
		btnEqual.setPreferredSize(new Dimension(50,10));
		p2.add(btnEqual);


		p3.setLayout(new GridLayout(4,3,5,5));
		p3.add(btnClear = new JButton("C"));
		p3.add(btnAdd = new JButton("+"));
		p3.add(btnSub = new JButton("-"));
		p3.add(btnMul = new JButton("*"));
		p3.add(btnDiv = new JButton("/"));
		p3.add(btnCos = new JButton("Cos"));
		p3.add(btnSin = new JButton("Sin"));
		p3.add(btnTan = new JButton("Tan"));
		p3.add(btnExp = new JButton("e"));
		p3.add(btnToDeg = new JButton("Deg"));
		p3.add(btnToRad = new JButton("Rad"));



		f.setVisible(true);


		btn1.addActionListener(new ListenOne());
		btn2.addActionListener(new ListenTwo());
		btn3.addActionListener(new ListenThree());
		btn4.addActionListener(new ListenFour());
		btn5.addActionListener(new ListenFive());
		btn6.addActionListener(new ListenSix());
		btn7.addActionListener(new ListenSeven());
		btn8.addActionListener(new ListenEight());
		btn9.addActionListener(new ListenNine());
		btn0.addActionListener(new ListenZero());
		btnDot.addActionListener(new ListenDot());

		btnAdd.addActionListener(new ListenAdd());
		btnSub.addActionListener(new ListenSub());
		btnMul.addActionListener(new ListenMul());
		btnDiv.addActionListener(new ListenDiv());
		btnClear.addActionListener(new ListenClear());
		btnCos.addActionListener(new ListenCos());
		btnSin.addActionListener(new ListenSin());
		btnTan.addActionListener(new ListenTan());
		btnToDeg.addActionListener(new ListenToDeg());
		btnToRad.addActionListener(new ListenToRad());
		btnEqual.addActionListener(new ListenEqual());
		btnExp.addActionListener(new ListenExp());


	}

	class ListenOne implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "1");
		}


	}

	class ListenTwo implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "2");
		}

	}

	class ListenThree implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "3");
		}

	}

	class ListenFour implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "4");
		}

	}

	class ListenFive implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "5");
		}

	}

	class ListenSix implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "6");
		}

	}

	class ListenSeven implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "7");
		}

	}

	class ListenEight implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "8");
		}

	}

	class ListenNine implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "9");
		}

	}

	class ListenZero implements ActionListener{

		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + "0");
		}

	}


	class ListenDot implements ActionListener {
		public void actionPerformed(ActionEvent a){
			display = txt.getText();
			txt.setText(display + ".");
		}
	}


	class ListenClear implements ActionListener{

		public void actionPerformed(ActionEvent a){
			txt.setText("");
			result =0;
			temp=0;
			sym = "";
		}

	}


	class ListenAdd implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());
			txt.setText("");
			sym+="+";
		}

	}

	class ListenSub implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());
			txt.setText("");
			sym+="-";
		}

	}

	class ListenMul implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());
			txt.setText("");
			sym+="*";
		}

	}

	class ListenDiv implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());
			txt.setText("");
			sym+="/";
		}

	}

	class ListenCos implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.cos(Math.toRadians(temp));
			txt.setText(Double.toString(result));

		}

	}

	class ListenSin implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.sin(Math.toRadians(temp));
			txt.setText(Double.toString(result));

		}

	}

	class ListenTan implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.tan(Math.toRadians(temp));
			txt.setText(Double.toString(result));

		}

	}

	class ListenToDeg implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.toDegrees(temp);
			txt.setText(Double.toString(result));

		}

	}

	class ListenToRad implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.toRadians(temp);
			txt.setText(Double.toString(result));

		}

	}

	class ListenExp implements ActionListener{

		public void actionPerformed(ActionEvent a){
			sym = "";
			temp = Double.parseDouble(txt.getText());

			result= Math.exp(temp);
			txt.setText(Double.toString(result));

		}

	}

	class ListenEqual implements ActionListener {

		public void actionPerformed(ActionEvent a){

			result= Double.parseDouble(txt.getText());

			if(sym.equals("+")) {
				result+=temp;
				txt.setText(Double.toString(result));
				sym="";
			}


			if(sym.equals("-")) {
				result-=temp;
				txt.setText(Double.toString(result));
				sym="";
			}

			if(sym.equals("*")) {
				result*=temp;
				txt.setText(Double.toString(result));
				sym="";
			}

			if(sym.equals("/") && result!=0) {
				result= temp/result;
				txt.setText(Double.toString(result));
				sym="";
			}

			if(sym.equals("+")) {
				result+=temp;
				txt.setText(Double.toString(result));
				sym="";
			}
		}

	}


	public static void main (String args[]) {

		CalcDesign cd = new CalcDesign();
		cd.pack();
		cd.setLocationRelativeTo(null);
		cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



}





