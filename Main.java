import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();

        System.out.println(Arrays.toString(test.getBackingArray()));
        System.out.println(test.size());

        for (int i = 0; i < 9; i++) {
            test.addToBack(i);
        }
        System.out.println(Arrays.toString(test.getBackingArray()));
        System.out.println(test.size());

        Integer rem1 = test.removeFromFront();
        System.out.println(rem1);
        System.out.println(Arrays.toString(test.getBackingArray()));
        System.out.println(test.size());

        /**
        test.addToBack(3);
        System.out.println(test.getBackingArray());
        System.out.println(test.size());

        test.addToBack(4);
        System.out.println(test.getBackingArray());
        System.out.println(test.size());

        test.addToFront(1);
        System.out.println(test.getBackingArray());
        System.out.println(test.size());
         */


    }
}
