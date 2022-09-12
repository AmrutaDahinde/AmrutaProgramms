
public class AlphabetPattern {
public static void main(String args[]) {
	int alphabet=65;
	for(int i=0;i<=6;i++)
	{
		for(int j=0;j<=i;j++) {
			System.out.println((char)(alphabet+j)+"");
			
		}
		System.out.println();
	}
}
}
