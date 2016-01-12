/*=============================================
  class Student - subclass of Character
  =============================================*/

import java.io.*;
import java.util.*;

public class Student implements Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private String name;
    private String zodiac;
    private final String[] zodiacs = {"aries","taurus","gemini",
				      "cancer","leo","virgo",
				      "libra","scorpio","sagittarius",
				      "capricorn","aquarius","pisces"};
    private InputStreamReader isr;
    private BufferedReader in;


    // ~~~~~~~~~~~ CONSTRUCTOR ~~~~~~~~~~~

    public Student() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	name = inputName();
	zodiac = inputZodiac();
    }


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~

    // gets and returns name from the user
    public String inputName() {
	String n = "";
	while ( n.equals("") ) { // to ensure non-empty names
	    System.out.println("Name? \n");
	    n = input();
	}
	return n;
    }

    // gets and returns zodiac from the user
    public String inputZodiac() {
	String z = "";
	while ( ! isZodiac(z) ) { // to ensure a valid sign
	    System.out.println("\nZodiac sign? (lower case only please)");
	    System.out.println("\nINSERT LIST OF ZODIACS HERE\n");
	    z = input();
	}
	return z;
    }

    // tells whether a string represents a zodiac sign
    public boolean isZodiac(String z) {
	for ( String s : zodiacs ) {
	    if ( s.equals(z) ) {
		return true;
	    }
	}
	return false;
    }

    // gets the user's choice
    public String input() {
	try {
	    return in.readLine();
	}
	catch ( IOException e ) {}
	return "";
    }

    public String getName() {
	return name;
    }

    public String getZodiac() {
	return zodiac;
    }

} // end class Student
