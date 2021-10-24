package BASIC.Additional_Problems_MIX.ExamPrepMarch19;

import java.util.Scanner;

public class BasketballTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTournament = scanner.nextLine();                       //•	Име на турнира – текст
        int counterWin = 0;
        int counterLoss = 0;

        while (!nameTournament.equals("End of tournaments")) {
            int countGames = Integer.parseInt(scanner.nextLine());         //•	За всеки турнир n на брой мача

            for (int i = 1; i <= countGames; i++) {                        //•	За всеки мач се четат по два реда
                int pointsDesi = Integer.parseInt(scanner.nextLine());     //	Точки, вкарани от отбора на Деси
                int pointsNotDesi = Integer.parseInt(scanner.nextLine());  //  	Точки, вкарани от противниковия отбор
                int diff = Math.abs(pointsDesi - pointsNotDesi);
                if (pointsDesi >= pointsNotDesi) {
                    counterWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, nameTournament, diff);
                } else {                     //•	След всеки мач да се отпечатва
                    counterLoss++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, nameTournament, diff);
                }
            }
            nameTournament = scanner.nextLine();
        }
        double percentWin=100.0*counterWin/(counterWin+counterLoss);
        double percentLoss=100.0*counterLoss/(counterWin+counterLoss);

        System.out.printf("%.2f%% matches win%n",percentWin);
        System.out.printf("%.2f%% matches lost",percentLoss);

    }
}
