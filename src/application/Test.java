package application;
import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1+1";

		 String[] parts = input.split("\\+");
		 BigInteger number1 = new BigInteger(parts[0].trim());
        BigInteger number2 = new BigInteger(parts[1].trim());
		BigInteger calc = number1.add(number2);
		String result =  String.valueOf(calc);

		System.out.println("Résultat : " + result);
	}

}
