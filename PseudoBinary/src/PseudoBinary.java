import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PseudoBinary {

	public static void pseudoBinary(int n) {
		int temp, count=0, p, m, rem;
		while(n!=0) {
			temp = n;
			p = 1;
			m = 0;
			while(temp != 0) {
				rem = temp % 10;
				temp/= 10;
				if(rem!=0)
					m+= p;
				p*= 10;				
			}
			n-= m;
			if(n!=0)
				System.out.print(m+"+");
			else
				System.out.println(m);
			count++;
		}
		System.out.println("\nCount="+count);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");

		int num = Integer.parseInt(br.readLine());

		// System.out.println("The entered number is " + num);
		pseudoBinary(num);
	}

}
