/*=============================================
  class Teacher - subclass of Character
  =============================================*/

public class Teacher extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private String surname;
    private int matchLevel;


    // ~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~

    public Teacher() { // default settings
	super("DJ","taurus");
	surname = "Khaled";
	matchLevel = 0;
    }

    public Teacher(String n, String s, String z) {
	super(n,z);
	surname = s;
	matchLevel = 0;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

    public String getSurname() {
	return surname;
    }

    public int getMatchLevel() {
	return matchLevel;
    }

} // end class Teacher
