
public class StudentNames{
	
	public static void main(String args[]){
	String[] ranks = {"zero", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"};
	System.out.println("Number of command line args = " + args.length);
		for (int i = 0; i<args.length; i++){
			System.out.println(ranks[i+1] + " student name is : " + args[i]);
		}
}	

}