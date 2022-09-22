import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings, "west").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>(); // stack is holding the indexes who can see the sunset

        // this part is for East by default
        int i = 0;
        int step = 1;

        // this part is for West
        if (direction.equalsIgnoreCase("west")) {

            i = buildings.length - 1;
            step = -1;

        }

        while (i >= 0 && i < buildings.length) { // combination condition for both west and east

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {

                stack.pop();
            }
            stack.push(i);
            i += step; // basically for west i starts at the end of the building's length, and step is -1, so it will keep going back like 7+(-1)=6..
            // meanwhile for east it will just start from 0 and keep increasing by 1 like 0+1=1...
        }
        // now I have a stack with the indices of the buildings that can see the sunset

        if (direction.equalsIgnoreCase("west")) { // in order to get the ascending order of the indices, we need to reverse for the west
            Collections.reverse(stack); // sorting could work too but complexity of sorting is n log n meanwhile for reversing it is n
        }

        return new ArrayList<>(stack);
    }
}
