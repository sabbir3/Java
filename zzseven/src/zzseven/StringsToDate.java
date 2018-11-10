package zzseven;
import java.util.*;
import java.text.*;

public class StringsToDate {
	public static void main(String args[])
	{
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd");
		Scanner in = new Scanner(System.in);
		String input = new String();
		input = in.nextLine();
		System.out.print(input + " Parses as ");
		Date t;
	try
	{
		t = ft.parse(input);
		System.out.println(t);
	}
	catch(ParseException e)
	{
		System.out.println("Unparseable using" + ft);
	}
}
}