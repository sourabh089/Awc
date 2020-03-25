package Evan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datecompare {
	static String invdate = "12/09/2020";
	static String gldate = "10/09/2020";

	public static void main(String[] args) throws ParseException {

		Date Invoicedate = new SimpleDateFormat("dd/MM/yyyy").parse(invdate);
		System.out.println("converted INvoice date " + Invoicedate);
		Date GLdate = new SimpleDateFormat("dd/MM/yyyy").parse(gldate);
		System.out.println("Converted GL date " + GLdate);
		System.out.println("comparision " + (Invoicedate.compareTo(GLdate)));

	}

}
