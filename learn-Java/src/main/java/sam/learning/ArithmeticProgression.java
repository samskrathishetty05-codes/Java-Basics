package sam.learning;

public class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for(int num: arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if((max-min)%(n-1) !=0) {
            return false;
        }

        int diff = (max-min)/(n-1);

        HashSet<Integer> set = new HashSet<>();

        for(int num: arr) {
            set.add(num);
        }

        for(int i=0; i<n; i++) {
            int expectedValue = min + (i*diff);
            if(!set.contains(expectedValue)) {
                return false;
            }
        }

        return true;

    }
}
