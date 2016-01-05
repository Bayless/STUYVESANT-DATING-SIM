/*=============================================
  class Teacher - subclass of Character
  =============================================*/

public class Teacher extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    private int matchLevel;


    // ~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~

    public Teacher(String n, String z) {
	super(n,z);
	matchLevel = 0;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

    public int getMatchLevel() {
	return matchLevel;
    }

} // end class Teacher
