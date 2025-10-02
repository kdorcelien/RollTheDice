package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = 0, roll2 = 0;
        int counter2 = 0, counter4 = 0, counter6 = 0, counter7 = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            if (sum == 2) counter2++;
            if (sum == 4) counter4++;
            if (sum == 6) counter6++;
            if (sum == 7) counter7++;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

        }

    }

    public int roll() {
        int maxValue = 6, minValue = 1;
        int randomNumber = (int) (Math.random() * maxValue) + minValue;
        return randomNumber;

    }
}
