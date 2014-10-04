/**
 * Created by Steve on 04/10/2014.
 */
public class VariablesAndNames
{
    public static void main( String[] args)
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        // number of cars
        cars = 100;

        // passengers that will fit in 1 car
        space_in_a_car = 4;

        // number of drivers
        drivers = 30;

        // number of passengers
        passengers = 90;

        // number of cars not driven
        cars_not_driven = cars - drivers;

        // number of cars that are driven
        cars_driven = drivers;

        // space available to passengers
        carpool_capacity = cars_driven * space_in_a_car;

        // average passengers per car
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available.");
        System.out.println( "There are only " + drivers + " drivers available.");
        System.out.println( "There will be " + cars_not_driven + " empty cars today.");
        System.out.println( "We can transport " + carpool_capacity + " people today.");
        System.out.println( "We have " + passengers + " to carpool today.");
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car.");
    }
}
