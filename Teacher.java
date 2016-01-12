/*=============================================
  class Teacher - subclass of Character
  =============================================*/

public abstract class Teacher implements Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    protected String surname;
    protected String[][] questionBank;
    protected String[] regQuestions;
    protected String name;
    protected String zodiac;
    protected int matchLevel;
    protected int questionPos;

    // ~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~

    public Teacher() { // default settings
	name = "DJ";
	zodiac = "taurus";
	surname = "Khaled";
	matchLevel = 0;
	
    }

    public Teacher(String n, String s, String z, int pos) {
	name = n;
	surname = s;
	zodiac = z;
	matchLevel = 0;
	questionBank = new String[][]
	    {{"yo?","i like history"},
	     {"oui oui baguette", "hablo francais"},
	     {"im not no teacher", "I is a computer scientist"},
	     {"dammit ronald", "luv u barbara"},
	     {"physics is formulas", "now, a story!"}
	};
	/* position 0 are Hanna's questions
	   1 is Ramirez
	   2 is Brown
	   3 is Mott
	   4 is Akh
	*/
	regQuestions = //questions for all
	    new String[] {"how are you?",
			  "what is your zodiac",
			  "what is your favorite class",
	};
	questionPos = pos;
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
    public String getZodiac(){
	return zodiac;
    }

    // ~~~~~~~~~~~~~~~~~ MUTATORS ~~~~~~~~~~~~~~~~~
    
    public void setMatchLevel(int x) {
	matchLevel = x;
    }

    public abstract String ask();

} // end class Teacher
