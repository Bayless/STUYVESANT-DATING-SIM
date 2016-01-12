public class DylanHanna extends Teacher {
    
    public DylanHanna() {
	super("Dylan","Hanna","taurus",0);
    }

    public String ask(){
	for ( String s: questionBank[questionPos] ) {
	    return s;
	    }
	return "";
    }

    public String getName(){
	super.getName();
    }

}
	
