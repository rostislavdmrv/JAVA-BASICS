package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());

        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;

        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {
            String position = scanner.nextLine();

            if (position.equals("W")){
                points += 2000;
                winCount++;
            }
            else if (position.equals("F")){
                points += 1200;
            }
            else  if (position.equals("SF")){
                points += 720;
            }
        }

        System.out.printf("Final points: %s", startPoints + points);
        System.out.println();
        System.out.printf("Average points: %s",points / tournaments);
        System.out.println();
        System.out.printf("%.2f%%", 1.0* winCount/ tournaments * 100);
    }
}
