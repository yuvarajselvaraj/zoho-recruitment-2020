import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original_text = sc.next();
        int length = original_text.length();
        for (int i = 1; i <= length; i++) {
            int mid = length / 2;
            for (int j = length; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(original_text.charAt(mid));
                    mid = mid + 1;
                    if (mid == length) {
                        mid = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
