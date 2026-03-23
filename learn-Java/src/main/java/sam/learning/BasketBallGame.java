package sam.learning;

import java.util.*;

public class BasketBallGame {
        public int calPoints(String[] operations) {

            int len = operations.length;


            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(Integer.valueOf(operations[0]));

            for(int i=1; i<len; i++) {
                if(operations[i].equals("C")) {
                    arr.remove(arr.size()-1);
                } else if(operations[i].equals("D")) {
                    arr.add(arr.get(arr.size()-1)*2);
                } else if(operations[i].equals("+")) {
                    int last = arr.get(arr.size()-1);
                    int lastButOne = arr.get(arr.size()-2);
                    arr.add(last+lastButOne);
                } else {
                    arr.add(Integer.valueOf(operations[i]));
                }
            }

            int sum =0;

            for(int num: arr) {
                sum += num;
            }

            return sum;
    }
}
