/*=============================================
  class Teacher - subclass of Character
  =============================================*/

public abstract class Teacher implements Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private String surname;
    private int matchLevel;
    protected String[][] questionBank;
    protected String[] regQuestions;
    protected String name;
    protected String zodiac;
    


    // ~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~

    public Teacher() { // default settings
	name = "DJ";
	zodiac = "taurus";
	surname = "Khaled";
	matchLevel = 0;
	
    }

    public Teacher(String n, String s, String z) {
	this();
	surname = s;
	matchLevel = 0;
	questionBank = new String[][]
	    {{"yo?","i like history"},
	     {"ms garber is bae", "my hair is on point"},
	     {"im not no teacher", "I is a computer scientist"},
	     {"hablo frances", "idk french :P"},
	     {"physics is formulas", "now, a story!"}
	};
	/* position 0 are Hanna's questions
	   1 is Mott
	   2 is Brown
	   3 is Ramirez
	   4 is akh
	*/
	regQuestions = //questions for all
	    new String[] {"how are you?",
			  "what is your zodiac",
			  "what is your favorite class",
	};
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

    public String getName() {
	return name;
    }
    public String getSurname() {
	return surname;
    }

    public int getMatchLevel() {
	return matchLevel;
    }

    // ~~~~~~~~~~~~~~~~~ MUTATORS ~~~~~~~~~~~~~~~~~
    
    public void setMatchLevel(int x) {
	matchLevel = x;
    }

} // end class Teacher
