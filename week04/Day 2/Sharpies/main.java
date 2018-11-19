package Sharpies;

public class main {



    public static void main(String[] args) {

        SharpieSet gabika = new SharpieSet();

        gabika.sharpieSet.add(new Sharpie("black", 0.52));
        gabika.sharpieSet.add(new Sharpie("grey", 0.52));
        gabika.sharpieSet.add(new Sharpie("red", 0.25));
        gabika.sharpieSet.add(new Sharpie("yellow", 0.52));
        gabika.sharpieSet.add(new Sharpie("batmanBlue", 0.52));
        gabika.sharpieSet.add(new Sharpie("marinAqua", 0.52));
        gabika.sharpieSet.add(new Sharpie("pinkyBlood", 0.52));
        gabika.sharpieSet.add(new Sharpie("purpleOrange", 0.52));

        for (int i = 0; i < gabika.sharpieSet.size(); i++) {
            int timesToBeUsed = (int) (Math.random() * 80 + 10);
            gabika.sharpieSet.get(i).use(timesToBeUsed);
            System.out.println(gabika.sharpieSet.get(i));
            gabika.trash(i);
        }
        System.out.println(gabika);

//        int timesToBeUsed = (int) (Math.random() * 80);
//        blackUsed.use(timesToBeUsed);
//        if(blackUsed.inkAmount > 5){
//            sharpieSet.add(blackUsed);
//        }

    }
}
