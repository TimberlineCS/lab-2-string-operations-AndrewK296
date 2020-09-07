public class StringOperations{
  
  public static void main(String args[])
  {
//Andrew Kim
//AP computer science 1
// September 9th

// challenge 1

String letterOne = "Scissors";
int letterOneHalf = letterOne.length()/2;
String FirstHalf1 = letterOne.substring(0,letterOneHalf);
String SecondHalf1 = letterOne.substring(letterOneHalf);
System.out.print(SecondHalf1.toLowerCase());
System.out.println(FirstHalf1.toLowerCase());

String letterTwo = "Picture";
int letterTwoHalf = letterTwo.length()/2;
String FirstHalf2 = letterTwo.substring(0,letterTwoHalf);
String SecondHalf2 = letterTwo.substring(letterTwoHalf);
System.out.print(SecondHalf2.toLowerCase());
System.out.println(FirstHalf2.toLowerCase());

String letterThree = "Computer";
int letterThreeHalf = letterThree.length()/2;
String FirstHalf3 = letterThree.substring(0,letterThreeHalf);
String SecondHalf3 = letterThree.substring(letterThreeHalf);
System.out.print(SecondHalf3.toLowerCase());
System.out.println(FirstHalf3.toLowerCase());

// challenge 2

System.out.println("                     _________");
System.out.println("                    /_________/\\");
System.out.println("                    \\ \\      / /");
System.out.println("                  ___\\ \\____/_/___");
System.out.println("                 /____\\ \\_________/\\");
System.out.println("                 \\ \\   \\ \\/ /    / /");
System.out.println("                  \\ \\   \\/ /\\   / /");
System.out.println("                   \\ \\  / /  \\ / /");
System.out.println("                    \\_\\/_/    \\_\\/");
}
}
