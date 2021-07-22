import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOps {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string with numbers and operators");
		String seq = br.readLine();
		// System.out.println("The entered string is "+seq);

		StringBuffer num = new StringBuffer(), oper = new StringBuffer();

		for (int i = 0; i < seq.length(); i++) {
			if (Character.isDigit(seq.charAt(i))) {
				num.append(seq.charAt(i));
			} else {
				oper.append(seq.charAt(i));
			}
		}
		// System.out.println(num+" "+oper);
		int sum, temp;
		char op;
		sum = Character.getNumericValue(num.charAt(0));
		// System.out.println(sum);
		for (int i = 1; i < num.length(); i++) {
			temp = Character.getNumericValue(num.charAt(i));
			op = oper.charAt(i-1);
			switch (op) {
			case '+':
				sum += temp;
				break;
			case '-':
				sum -= temp;
				break;
			case '*':
				sum *= temp;
				break;
			case '/':
				sum /= temp;
				break;
			default:
				System.out.println("Error - Invalid Operator");

			}
		}
		System.out.println(sum);

	}

}
