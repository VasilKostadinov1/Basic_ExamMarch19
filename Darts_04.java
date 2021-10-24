package BASIC.Additional_Problems_MIX.ExamPrepMarch19;

import java.util.Scanner;

public class Darts_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // see Kaloyan solution!!

        String name = scanner.nextLine();
        boolean points301 = false;
        int points = 301;
        int count = 0;
        int countFalse = 0;
        String sector = scanner.nextLine();

        while (!sector.equals("Retire")) {
            int shot = Integer.parseInt(scanner.nextLine());
            switch ((sector)) {
                case "Single":
                    shot *= 1;
                    break;
                case "Double":
                    shot *= 2;
                    break;
                case "Triple":
                    shot *= 3;
                    break;
            }
            if (shot > points) {   // При изстрел, даващ повече точки от наличните, той се зачита за неуспешен и играчът трябва да хвърля отново
                countFalse++;
                sector = scanner.nextLine();   //!!!
                continue;   // !!!
            }
            points -= shot;  // initial points are decreases, once we are sure that all above conditions are met!
            count++;
            if (points == 0) {
                points301 = true;
                break;     //!!!
            }
            sector = scanner.nextLine();
        }
        if (points301) {
            System.out.printf("%s won the leg with %d shots.", name, count);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, countFalse);
        }



    }
}
