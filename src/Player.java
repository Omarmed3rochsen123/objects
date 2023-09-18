public class Player {
    static int PlayerHP = 20;
    static int PlayerAttack = 5;

    static void AttackMonster(int HP, int Attack, int PLayerHP, int PlayerAttack) {
        if (Math.random() * PlayerAttack > Math.random() * Attack) {
            System.out.println("You succesfully attacked the monster");
            HP -= PlayerAttack;
            System.out.println("Monster remaining HP: " + HP);
        } else {
            System.out.println("You got hit lol");
            PlayerHP -= Attack;
            System.out.println("player HP: " + PLayerHP);
        }
    }
}
