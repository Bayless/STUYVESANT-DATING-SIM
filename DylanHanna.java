public class DylanHanna extends Teacher {
    
    public DylanHanna() {
	super();
	zodiac = "taurus";
	name = "Dylan";
	surname = "Hanna";
	questionPos = 0;
	super.setMatchLevel(1);
    }
    public String ask(){
	for (String s: questionBank[questionPos]){
	    return s;
	    }
	return "";
    }
    public String getName(String i, String z){
	return name + surname;
    }
}
	
