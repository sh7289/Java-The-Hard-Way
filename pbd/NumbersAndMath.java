/**
 * Created by Steve on 04/10/2014.
 */
public class NumbersAndMath
{
    public static void main( String [] args )
    {
        System.out.println("I will now count my chickens!");

        System.out.println("Hens: " + (25+30 / 6 ));
        System.out.println("Roosters: " + (100 - 25 * 3 % 4 ));

        System.out.println("Now I will count the eggs!");

        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        System.out.println( 3 + 2 < 5 - 7);

        System.out.println( "What is 3 + 2? " + (3 + 2) );
        System.out.println( "What is 5 - 7? " + (5 - 7 ) );

        System.out.println( "Oh, that's why it's false." );

        System.out.println( "How about some more?" );

        System.out.println( "Is it greater than? " + ( 5 > -2 ));
        System.out.println( "Is it greater than or equal to? " + ( 5 >= -2 ));
        System.out.println( "Is it less than or equal to? " + (5 <= -2 ));
    }
}
