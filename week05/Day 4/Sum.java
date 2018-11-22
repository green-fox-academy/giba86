import java.util.ArrayList;

public class Sum {

  ArrayList<Integer> sumsnums = new ArrayList<>();
  int nums;
  int size;
  int sum = 0;

  Sum(int size){
    this.size = size;
  }
  public int SummaryOfList() {

    for (int i = 0; i < size; i++) {
      sumsnums.add(i);
      sum += sumsnums.get(i);
    }
    return sum;
  }


}
