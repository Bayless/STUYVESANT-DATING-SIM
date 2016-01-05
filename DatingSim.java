/*

SOME KIND OF INTRODUCTION/TITLE/WHATEVER HERE

*/

/*=============================================
  class DatingSim -- Driver file for Kate and Bayle's FINAL PROJECT!
  Required classes: Character, Student, Teacher
  =============================================*/

import java.io.*;
import java.util.*;

public class DatingSim{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private Character you;

    private final String[] zodiacs = {"aries","taurus","gemini",
				      "cancer","leo","virgo",
				      "libra","scorpio","sagittarius",
				      "capricorn","aquarius","pisces"};
    private InputStreamReader isr;
    private BufferedReader in;

    
    // ~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~

    public DatingSim() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }

    
    // ~~~~~~~~~~~ METHODS ~~~~~~~~~~~

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
    public String uChoice() {
	try {
	    return in.readLine();
	}
	catch ( IOException e ) {}
	return "";
    }

    // sets up a new game
    public void newGame() {

        String s;
	String t = "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n"; // t for transition

	s = "blahblahblah welcome \n";
	System.out.println(s);

	// step 1 : getting a name
	s = "name? \n";
	String name = "";

	while ( name.equals("") ) { // to prevent empty names
	    System.out.println(s);
	    name = uChoice();
	}

	System.out.println(t);

	// step 2 : getting a zodiac
	s = "zodiac? (lower case only please) \n";
	s += "*zodiac choice list here* \n";
	String zodiac = "";
	
	while ( ! isZodiac(zodiac) ) { // to ensure a valid zodiac
	    System.out.println(s);
	    zodiac = uChoice();
	}

	System.out.println(t);

	// step 3 : finally creating the character!

	you = new Student(name,zodiac);
	
    }

    // time to play!
    public void play(){

	String s;
	String t = "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n";
	
	s = "Welcome, " + you.getName() + "!";
	System.out.println(s);
	System.out.println(t);

    }


    // ~~~~~~~~~~~ MAIN METHOD ~~~~~~~~~~~

    public static void main( String[] args ) {

        DatingSim game = new DatingSim();
	
	game.play();

    }

} //end class DatingSim
