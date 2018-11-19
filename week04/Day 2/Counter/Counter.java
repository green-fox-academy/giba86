package Counter;

import java.util.Collection;

public class Counter {
    int actual;
    int initial;


    public Counter(int i){
        actual = i;
        initial = i;
    }
    public Counter(){
        this.actual = 0;
        initial = 0;
    }

    public void add(int a) {
        actual += a;
    }
    public void add() {
        actual ++;
    }
    public int get() {
        return actual;
    }
    public void reset() {
        actual = initial;
    }
}
