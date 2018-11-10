import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indexes of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
    public static ArrayList<Integer> subInt(int x, int[] task){
        ArrayList<Integer> answerReverse = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int temp;

        for (int i = 0; i < task.length; i++) {
            temp = task[i];
            while(temp > 0){
                if(temp % 10 == x){
                    answer.add(i);
                    break;
                }else {
                    temp = temp / 10;
                }
            }
        }
        for (int i = 0; i < answerReverse.size(); i++) {
            answer.add(answerReverse.get(answerReverse.size() - 1 - i));
        }
        return answer;
    }
}

//        for (int i = 0; i < task.length; i++) {
//            if(x == task[i] || task[i] % 10 == x || task[i] % 100 == (x * 10)){
//                answer.add(i);
//            }
//        }
//        //System.out.println("this function works on numbers below 100");
//        return answer;