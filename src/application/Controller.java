package application;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.math.BigInteger;

public class Controller {
	private String a;
	private String b;
	private float result;
@FXML
private Button btn1;
@FXML
private Button btn2;
@FXML
private Button btn3;
@FXML
private Button btn4;
@FXML
private Button btn5;
@FXML
private Button btn6;
@FXML
private Button btn7;
@FXML
private Button btn8;
@FXML
private Button btn9;
@FXML
private Button btn0;
@FXML
private Button plus;
@FXML
private Button moins;
@FXML
private Button diviser;
@FXML
private Button multiplier;
@FXML
private Button clear;
@FXML
private Button egale;
@FXML
private TextField champ;
	
	public void egale() {
		String un = btn1.getText();
		String deux = btn2.getText();
		
	}
	public void btn1() {
		btn1.setOnAction(Event->{
			champ.setText(champ.getText()+"1");
		});
		
		btn2.setOnAction(Event->{
			champ.setText(champ.getText()+"2");
		});
		
		btn3.setOnAction(Event->{
			champ.setText(champ.getText()+"3");
		});
		
		btn4.setOnAction(Event->{
			champ.setText(champ.getText()+"4");
		});
		
		btn5.setOnAction(Event->{
			champ.setText(champ.getText()+"5");
		});
		
		btn6.setOnAction(Event->{
			champ.setText(champ.getText()+"6");
		});
		
		btn7.setOnAction(Event->{
			champ.setText(champ.getText()+"7");
		});
		
		btn8.setOnAction(Event->{
			champ.setText(champ.getText()+"8");
		});
		
		btn9.setOnAction(Event->{
			champ.setText(champ.getText()+"9");
		});
		
		btn0.setOnAction(Event->{
			champ.setText(champ.getText()+"0");
		});
		
		clear.setOnAction(Event->{
			champ.setText("");
		});
		plus.setOnAction(Event->{
			a = champ.getText();
			champ.setText("+");
			champ.setText(a+"+");
		});
		moins.setOnAction(Event->{
			a = champ.getText();
			champ.setText("-");
			champ.setText(a+"-");
		});
		multiplier.setOnAction(Event->{
			a = champ.getText();
			champ.setText("*");
			champ.setText(a+"*");
		});
		diviser.setOnAction(Event->{
			a = champ.getText();
			champ.setText("/");
			champ.setText(a+"/");
		});
	}
@FXML
private void egal() {
	egale.setOnAction(Event->{
		b = champ.getText();
		//b.split("\\+");
		 boolean parts ;
		 String[] part;
		 if(b.contains("+")) {
			 part = b.split("\\+");
			 BigInteger number1 = new BigInteger(part[0].trim());
	         BigInteger number2 = new BigInteger(part[1].trim());
			BigInteger calc = number1.add(number2);
			champ.setText(String.valueOf(calc));
		 }else if (b.contains("-")) {
			 part = b.split("\\-");
			 BigInteger number1 = new BigInteger(part[0].trim());
	         BigInteger number2 = new BigInteger(part[1].trim());
			BigInteger calc =  number1.subtract(number2);
			champ.setText(String.valueOf(calc));
		}else if (b.contains("*")) {
			part = b.split("\\*");
			 BigInteger number1 = new BigInteger(part[0].trim());
	         BigInteger number2 = new BigInteger(part[1].trim());
			BigInteger calc = number1.multiply(number2);
			champ.setText(String.valueOf(calc));
		}else {
			 part = b.split("\\/");
			 BigInteger number1 = new BigInteger(part[0].trim());
	         BigInteger number2 = new BigInteger(part[1].trim());
	         int number = number2.intValue();
	         if(number == 0) {
	        	 champ.setText("");
	        	 champ.setText("un nombre n'est divisible par 0");
	         }else {
	        	 BigInteger calc = number1.divide(number2);
	 			champ.setText(String.valueOf(calc));
			}
		}
		
});
}		
}