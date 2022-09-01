package interviewQuestions.Codoway;

import java.util.*;
public class SecondQuestion {

    public static void main(String[] args) {
        Integer rounds=0,total1=0,total2=0,total3=0,bound=6;
        Integer dice1,dice2,dice3;
        List<Output> outputs = new ArrayList<>();


        while (rounds<1||rounds>99){
            System.out.print("Enter number of Rounds:");
            Scanner scanner=new Scanner(System.in);
            rounds=scanner.nextInt();
        }

        for (Integer round = 1; round<= rounds; round++) {
            Random random=new Random();
            dice1=random.nextInt(bound)+1;
            dice2=random.nextInt(bound)+1;
            dice3=random.nextInt(bound)+1;
            if(dice1.equals(dice2)&&dice1>dice3){
                total1=total1+dice1*2;
                total2=total2+dice2*2;
                total3=total3+dice3;
            } else if (dice1.equals(dice3)&&dice1>dice2) {
                total1=total1+dice1*2;
                total2=total2+dice2;
                total3=total3+dice3*2;

            } else if (dice2.equals(dice3)&&dice2>dice1) {
                total1=total1+dice1;
                total2=total2+dice2*2;
                total3=total3+dice3*2;
            }else{
                total1=total1+dice1;
                total2=total2+dice2;
                total3=total3+dice3;
            }
            outputs.add(new Output(round,dice1,dice2,dice3,total1,total2,total3));
        }

        System.out.println("+----------+----------+----------+----------+----------+----------+----------+");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s", "|  ROUND   |", " DICE1 |"," DICE2  |"," DICE3 |", " TOTAL1 |"," TOTAL2 |"," TOTAL3 |");
        System.out.println();
        System.out.println("+----------+----------+----------+----------+----------+----------+----------+");
        for(Output output: outputs){
            System.out.printf("%-10.12s %-10.12s %-10.12s %-10.12s %-10.12s %-10.12s %-10.12s %1s",
                    "|    "+output.getRound(), "|    "+output.getDice1(),"|    "+output.getDice2(),"|    "+output.getDice3(),
                    "|    "+output.getTotal1(),"|    "+output.getTotal2(),"|    "+output.getTotal3(),"|");
            System.out.println();
            System.out.println("+----------+----------+----------+----------+----------+----------+----------+");
        }

    }
}

