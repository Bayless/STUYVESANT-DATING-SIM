/*=============================================
  class Character - superclass for all characters!
  =============================================*/

public abstract class Character {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    protected String name;
    protected String zodiac;


    // ~~~~~~~~~~~ CONSTRUCTOR ~~~~~~~~~~~
    
    public Character(String n, String z) {
	name = n;
	zodiac = z;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    
    public String getName() {
	return name;
    }
    
    public String getZodiac() {
        return zodiac;
    }
     
} //end class Character
