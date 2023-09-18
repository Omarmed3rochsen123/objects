import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Choice = 1;
        Scanner emil = new Scanner(System.in);
        System.out.println("Hello world!");
        Shoes.kickPlayer();
        while (Choice == 1) {
            System.out.println("What do you want to do now?");
            System.out.println("Type 1 to attack, type 2 to exit");
            System.out.print(": ");
            Choice = emil.nextInt();

            Player.AttackMonster(Monster.HP, Monster.Attack, Player.PlayerHP, Player.PlayerAttack);
        }

    }
}