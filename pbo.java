
import java.util.Scanner;
/* PROGRAM PENJUMLAHAN MATRIKS*/
class PenjumlahanMatriks {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int A[][] = new int[2][2];
            int B[][] = new int[2][2];
            int C[][] = new int[2][2];
            String myText = "MANTAB";

            System.out.println("Masukkan Matriks A");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                    A[i][j] = input.nextInt();
                }
            }
            System.out.println("Masukkan Matriks B");
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    System.out.print("[" + (k + 1) + "][" + (l + 1) + "]:");
                    B[k][l] = input.nextInt();
                }
            }
            System.out.println("Matriks A");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(+(A[i][j]) + " ");
                }
                System.out.println(" ");
            }
            System.out.println("Matriks B");
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    System.out.print(+(B[k][l]) + " ");
                }
                System.out.println(" ");
            }
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    C[x][y] = A[x][y] + B[x][y];
                }
            }
            System.out.println("Hasil penjumlahan Matriks A dan Matriks B");
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    System.out.print(+(C[x][y]) + " ");
                }
                System.out.println(" ");
            }
            int x = 0;
                if (x < 2) {
                    System.out.println("PROGRAM BERHASIL BERJALAN");
                } else {
                    System.out.println("PROGRAM TIDAK DAPAT DIJALANKAN");
                }

                int i = 0;
                do{
                    System.out.println("mantab");
                    i++;
                }while (i<3);
        }

}
