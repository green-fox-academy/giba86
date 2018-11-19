package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        int firstDomino = (int) (Math.random() * 5 - 0);
        System.out.println((firstDomino + 1) + ". domino was selected first which is " + dominoes.get(firstDomino));
        List<Domino> sortedDominoes = new ArrayList<>();

        sortedDominoes.add(dominoes.get(firstDomino));

        for (int i = 0; i < dominoes.size() - 1; i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (sortedDominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide() && !(sortedDominoes.get(i) == dominoes.get(j))) {
                    sortedDominoes.add(dominoes.get(j));
                }
            }

        }
        System.out.println(sortedDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}