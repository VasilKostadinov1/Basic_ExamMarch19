package BASIC.Additional_Problems_MIX.ExamPrepMarch19;

import java.util.Scanner;

public class FitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int countWorkOut = 0;     // Back", "Chest", 'Legs", "Abs"
        int countProtein = 0;    // Protein shake", "Protein bar"
        int countBack=0;
        int countChest=0;
        int countLegs=0;
        int countAbs=0;
        int countProteinShake=0;
        int countProteinBar=0;

        for (int i = 1; i <= people; i++) {
            String activity = scanner.nextLine(); // ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
            if (activity.equals("Back") || activity.equals("Chest") || activity.equals("Legs") || activity.equals("Abs")) {
                countWorkOut++;
                if (activity.equals("Back")){
                    countBack++;
                } else if (activity.equals("Chest")){
                    countChest++;
                }else if (activity.equals("Legs")){
                    countLegs++;
                }else if (activity.equals("Abs")){
                    countAbs++;
                }
            } else if (activity.equals("Protein shake") || activity.equals("Protein bar")) {
                countProtein++;
                if (activity.equals("Protein shake")){
                    countProteinShake++;
                } else if (activity.equals("Protein bar")){
                    countProteinBar++;
                }
            }
        }
        System.out.printf("%d - back%n",countBack);
        System.out.printf("%d - chest%n",countChest);
        System.out.printf("%d - legs%n",countLegs);
        System.out.printf("%d - abs%n",countAbs);
        System.out.printf("%d - protein shake%n",countProteinShake);
        System.out.printf("%d - protein bar%n",countProteinBar);

        double percentWorkOut = (double)countWorkOut*100/(countWorkOut+countProtein);
        double percentProtein = (double)countProtein*100/(countWorkOut+countProtein);

        System.out.printf("%.2f%% - work out%n",percentWorkOut);
        System.out.printf("%.2f%% - protein%n",percentProtein);
    }
}
