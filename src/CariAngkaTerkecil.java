public class CariAngkaTerkecil {
    static int smallest(int a[]) {
        assert (a.length > 0);
        int elemenTerkecil = a[0];
        for (int ii = 1; ii < a.length; ii++) {
            if (a[ii] < elemenTerkecil) {
                elemenTerkecil = a[ii];
            }
        }
        return elemenTerkecil ;
    }

    static void hitung(int N) {
        for (int i = N; i > 0; i -= 5) {
            for (int j = N; j > 0; j /= 2) {
                for (int k = 0; k < 1000 * N; k += N) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myNum = {10, 20, -5, 50, 0};
        System.out.println(smallest(myNum));
        hitung(10);
    }


}
