package BASIC.Additional_Problems_MIX.ExamPrepMarch19;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine()); //желаната от Тихомир Иванов височина в сантиметри
        int countTotal=0;
        int countNonSuccess=0;
        boolean isNonSucceeded=false;

                                                                        //височината й се вдига с 5 сантиметра
        for (int i = desiredHeight - 30; i <= desiredHeight; ) {   //той започва тренировката си като поставя летвата на височина 30см по-ниско от целта
            int currentHeight = Integer.parseInt(scanner.nextLine());
            countTotal++;
            if (currentHeight>i){  // !! only >, otherwise program stops
                i+=5;
                countNonSuccess=0; // !!! zero the non-success count, after each success

            } else {
                countNonSuccess++;
            }
            if (countNonSuccess==3){    //три неуспешни скока на една и съща височина
                System.out.printf("Tihomir failed at %dcm after %d jumps.%n", i ,countTotal );
                isNonSucceeded=true;
                break;
            }
        }
        if (!isNonSucceeded){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desiredHeight , countTotal);
        }




    }
}
