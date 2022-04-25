import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int[] var1 = { 1, 2, 3, 4 };
        int[] var2 = new int[4];
        int[] var3 = var1;
        int[] var4 = new int[4];

        var4 = Arrays.copyOf(var1, var1.length);

        for (int i = 0; i < var1.length; i++) {
            var2[i] = var1[i];
        }

        for (int i : var1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (int i : var3) {
            System.out.print(i + ", ");
        }

        var1[0] = 11;
        var3[1] = 22;

        System.out.println();
        for (int i : var1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (int i : var3) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (int i : var2) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (int i : var4) {
            System.out.print(i + ", ");
        }

    }

}
