package exercises;

import java.util.Arrays;

public class ExerciseThreePointSeven {

    public static void main(String[] args) {
        ExerciseThreePointSeven exerciseThreePointSeven = new ExerciseThreePointSeven();
        exerciseThreePointSeven.onlyOddNumbers();
    }

    public void onlyOddNumbers() {

        int[] myArray = { 1, 1, 2, 3, 5, 8 };

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                System.out.println(myArray[i]);
            }
        }

    }

    //couldn't get this one to work
    public void separateString() {

        String providedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat " +
                "them in a house. I will not eat them with a mouse.";
        String [] splitString = providedString.split(" ");
        System.out.println(Arrays.toString(splitString));

    }



}
