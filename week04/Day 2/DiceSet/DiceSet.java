package DiceSet;

public class DiceSet {

    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

        for (int i = 0; i < 5; i++) {
            System.out.print(diceSet.dices[i] + " ");
            while(diceSet.getCurrent(i) != 6){
                diceSet.reroll(i);
              //  System.out.println(diceSet.getCurrent(i));
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(diceSet.getCurrent(i) + " ");
        }
    }
}