/**
 * Created by Steve on 04/10/2014.
 */
public class MoreVariablesAndPrinting
{
    public static void main(String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "Stephen J. Hughes";
        Age = 25; // truth
        Height = 77; // inches
        Weight = 168; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Fair";

        System.out.println( "Let's talk about " + Name + ".");
        System.out.println( "He's " + Height + " inches tall.");
        System.out.println( "He's " + Weight + " pounds heavy.");
        System.out.println( "Actually, that's not too heavy.");
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println( "His teeth are usually " + Teeth + " depending on whether or not he just had coffee.");

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight +
         " I get " + (Age + Height + Weight) + "." );
    }
}