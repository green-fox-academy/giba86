package Sharpies;

import java.util.ArrayList;

public class SharpieSet {
    ArrayList<Sharpie> sharpieSet = new ArrayList<>();
//    int quantityOfSharpie;

    public void trash(int i) {
        if (sharpieSet.get(i).inkAmount <= 5) {
            System.out.println("This " + sharpieSet.get(i).color + " sharpie is useless, bin it!");
            sharpieSet.remove(i);
        }
    }

    public SharpieSet(ArrayList<Sharpie> sharpieSet) {
        this.sharpieSet = sharpieSet;
    }

    public SharpieSet() {

    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "sharpieSet=" + sharpieSet +
                '}';
    }
}
