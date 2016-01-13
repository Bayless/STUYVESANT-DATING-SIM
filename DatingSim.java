/*

SOME KIND OF INTRODUCTION/TITLE/WHATEVER HERE

*/

/*=============================================
  class DatingSim -- Driver file for Kate and Bayle's FINAL PROJECT!
  Required classes: Character, Student, Teacher
  =============================================*/

import java.io.*;
import java.util.*;

public class DatingSim {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private Character you;

    private InputStreamReader isr;
    private BufferedReader in;

    
    // ~~~~~~~~~~~ CONSTRUCTOR ~~~~~~~~~~~

    public DatingSim() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	System.out.println("\nWelcome!");
	System.out.println("\n*~~~~~~~~~~~~~WHO ARE YOU?~~~~~~~~~~~~~*\n");
	you = new Student();
    }

    
    // ~~~~~~~~~~~ METHODS ~~~~~~~~~~~

    // time to play!
    public void play(){
	
	String t = "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n";

	System.out.println(t);
	System.out.println("Hey there, " + you.getName() + "! \n");

    }


    // ~~~~~~~~~~~ MAIN METHOD ~~~~~~~~~~~

    public static void main( String[] args ) {

        DatingSim game = new DatingSim();
	
	game.play();

    }

} //end class DatingSim
