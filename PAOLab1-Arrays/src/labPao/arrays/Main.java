package labPao.arrays;

public class Main {

    public static void main(String[] args) {
        int[] x1;
        x1 = new int[10];

        x1[0] = 10;

        int[] x2 = {1, 2, 3, 4};
        int[] x3 = new int[] {1, 2, 3, 4};

        System.out.println(x1.length);

        int[][] m = new int[3][];
        m[0] = new int[10];
        m[1] = new int[4];
        m[2] = new int[7];

        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                c++;
                m[i][j] = c;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------");
        for (int[] a : m) {
            for (int el : a) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
