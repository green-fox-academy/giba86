package Sharpies;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String colorka, double widthecske){
        this.color = colorka;
        this.width = widthecske;
        this.inkAmount = 50;
    }
    public void use(int a){ //a is how many times it was used
        double inkUsage = 0.586; // per use
        inkAmount -= inkUsage * a;
    }

    public String toString(){
        return  color + " " + width + " " + inkAmount;
    }
}
