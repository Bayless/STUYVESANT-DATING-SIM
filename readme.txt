To launch the program, write: "javac DatingSim.java" into the command line. Then, enter "java DatingSim" to start the Sim!

PLOT 
You’re a junior in high school, and it’s finally time for the best part of the year: Junior Prom! The only problem is, everybody hates you, so you can’t get a date. So, like any other young girl in distress, you take the obvious approach: GO WITH A TEACHER! 
In this Dating Sim, your goal is to approach your teachers and interact with them, trying to make them fall for you so you can ask one of them to prom in the end. They may accept or reject you, depending on how you’ve placed. Who knows where the path of love will take you? 
BEHIND THE SCENES 
There is an abstract class Character which is the superclass of Teacher and Student. Teacher itself is also an abstract class and it has five subclasses (one for each teacher). Each teacher has a few unique characteristics that he will use as discussion topics. The Student is the user and s/he answers questions that the teacher asks (based on his discussion topics). Depending on the response, the loveRating of the teacher (an instance variable in the specific 
teacher) will either increase, decrease, or remain the same. The teacher’s loveRating can also vary depending on specific attributes of the student. The questions within each topic will be selected randomly each time the game is played. In the end, the student chooses which teacher they’d like to ask to prom, and if the teacher’s loveRating is high enough, they will win the game. If not, they can ask another 
teacher, or just give up. Whether or not you win, the loveRatings of all the teachers will be revealed after the game is over.  
