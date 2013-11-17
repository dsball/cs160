import java.util.StringTokenizer;

//## Asignment
//Author: Daniel Ball
//Date:   Nov 5, 2013
//Class:  CS160
//Email:  dsball@rams.colostate.edu

public class ttest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(":LSKDF a;sdf;lkj    as;ldfkjdf poqiuerwe;lkjndsaf \n\n asdf  \n \n 23409876", " ", true);
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			if(token.equals("\n"))
			{
				System.out.println("newline");
			}
			if(token.equals(" "));
			{
				System.out.println("space");
			}
		}

	}

}
