/**
 * Created by Steve on 04/10/2014.
 */
public class MoreVariablesAndPrinting
{
    public static void main(String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double inches_in_cm, lbs_in_kg;

        inches_in_cm = 2.34;
        lbs_in_kg = 0.45;

        Name = "Stephen J. Hughes";
        Age = 25; // truth
        Height = 77; // inches
        Weight = 168; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Fair";

        System.out.println( "Let's talk about " + Name + ".");
        System.out.println( "He's " + Height + " inches " + "(or " + Math.round(Height*inches_in_cm) + " cm)" +  " tall.");
        System.out.println( "He's " + Weight + " pounds " + "(or " + Math.round(Weight*lbs_in_kg) + " kg)" +   " heavy.");
        System.out.println( "Actually, that's not too heavy.");
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println( "His teeth are usually " + Teeth + " depending on whether or not he just had coffee.");

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight +
         " I get " + (Age + Height + Weight) + "." );
    }
}
