
import java.util.ArrayList;
import java.util.Arrays;

public class NumOfPeopleInBus {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(new int[]{8, 0}, new int[]{4, 6}, new int[]{10, 9}, new int[]{2, 4}, new int[]{3, 1}));

        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
     /*   int on = 0;
        int off = 0;

        for (int[] each : stops) { // O(n)
            on += each[0];
            off += each[1];
        }

        return on - off;

      */

        int numberOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numberOfPeople = numberOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numberOfPeople;
    }
}
/*
1. There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
Take a look on the test cases next page.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.
The second value in the first integer array is 0, since the bus is empty in the first bus stop.
2. What is the time complexity of your solution?
 */