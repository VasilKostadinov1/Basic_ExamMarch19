package BASIC.Additional_Problems_MIX.ExamPrepMarch19;

import java.util.Scanner;

public class GameNumberWars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String command = scanner.nextLine();
        int sumFirst = 0;
        int sumSecond = 0;
        boolean isWar = false;

        while (!command.equals("End of game")) {   //до получаване на команда "End of game", се четат многократно по два реда:
            int cardFirst = Integer.parseInt(command);               //1.	Карта, която дава първият играч
            int cardSecond = Integer.parseInt(scanner.nextLine());   //2.	Карта, която дава вторият играч -
            if (cardFirst > cardSecond) {
                sumFirst += cardFirst - cardSecond;
            } else if (cardSecond > cardFirst) {
                sumSecond += cardSecond - cardFirst;
            } else if (cardFirst == cardSecond) {          //При еднакви карти на двамата играчи се прочитат нови два реда
                System.out.println("Number wars!");
                int cardFirst2 = Integer.parseInt(scanner.nextLine());
                int cardSecond2 = Integer.parseInt(scanner.nextLine());
                if (cardFirst2 > cardSecond2) {
                    System.out.printf("%s is winner with %d points%n", first, sumFirst);
                    isWar = true;
                    break;
                } else if (cardFirst2 < cardSecond2) {
                    System.out.printf("%s is winner with %d points%n", second, sumSecond);
                    isWar = true;
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (!isWar) {
            System.out.printf("%s has %d points%n", first, sumFirst);
            System.out.printf("%s has %d points", second, sumSecond);
        }


    }
}
