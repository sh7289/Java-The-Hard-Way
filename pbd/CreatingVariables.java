/**
 * Created by Steve on 04/10/2014.
 */
public class CreatingVariables
{
    public static void main( String[] args)
    {
        int x, y, age;
        double seconds, e, checking;
        String firstName, last_name, title;

        x = 10;
        y = 400;
        age = 39;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName = "Stephen";
        last_name = "Hughes";
        title = "Mr.";

        System.out.println( "The variable x contains " + x);
        System.out.println( "The value " + y + " is stored in the variable y.");
        System.out.println( "The experiment completed in " + seconds + " seconds.");
        System.out.println( "My favourite irrational number is Euler's constant: " + e );
        System.out.println( "Hopefully your balance is more than $" + checking + "!");
        System.out.println( "My full name is " + title + " " + firstName + " " + last_name);
    }
}
