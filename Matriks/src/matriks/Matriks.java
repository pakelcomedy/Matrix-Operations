package matriks;
import java.util.Scanner;

public class Matriks {

    public static void main(String[] args) {
        int[][] matrixA;
        int[][] matrixB;
        int[][] hasil;
        int row1, column1, row2, column2;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Ordo Matriks A : ");
        row1 = input.nextInt();
        System.out.println("x");
        column1 = input.nextInt();
        matrixA = new int[row1][column1];

        System.out.println("Masukkan Ordo Matriks B : ");
        row2 = input.nextInt();
        System.out.println("x");
        column2 = input.nextInt();
        matrixB = new int[row2][column2];

        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Ukuran Matriks A dan Matriks B tidak sesuai !");
        } else {
            hasil = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print("Masukkan nilai Matriks A ke [" + i + "][" + j + "] : ");
                    matrixA[i][j] = input.nextInt();
                }
            }
            System.out.println("--------------------------------------");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print("Masukkan nilai Matriks B ke [" + i + "][" + j + "] : ");
                    matrixB[i][j] = input.nextInt();
                }
            }
            System.out.println("--------------------------------------");
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah matriks");
            System.out.println("2. Kurang matriks");
            System.out.println("3. Nilai maximum baris");
            System.out.println("4. Keluar");
            System.out.print("Pilih [1-4]: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Menu yang dipilih tidak tersedia !");
                return;
            }
            System.out.println("--------------------------------------");
            System.out.println("Matriks A ");
            for (int i = 0; i < matrixA.length; i++) {
                System.out.print("[");
                for (int j = 0; j < matrixB[0].length; j++) {
                    if (j < (matrixB[0].length - 1)) {
                        System.out.print(matrixA[i][j]);
                        System.out.print(",");
                    } else {
                        System.out.print(matrixA[i][j]);
                    }
                }
                System.out.println("]");
            }
            System.out.println("Matriks B ");
            for (int i = 0; i < matrixA.length; i++) {
                System.out.print("[");
                for (int j = 0; j < matrixB[0].length; j++) {
                    if (j < (matrixB[0].length - 1)) {
                        System.out.print(matrixB[i][j]);
                        System.out.print(",");
                    } else {
                        System.out.print(matrixB[i][j]);
                    }
                }
                System.out.println("]");
            }
            if (choice == 1) {
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixA[0].length; j++) {
                        hasil[i][j] = matrixA[i][j] + matrixB[i][j];
                    }
                }
                System.out.println("Hasil dari penambahan : ");
            } else if (choice == 2) {
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixA[0].length; j++) {
                        hasil[i][j] = matrixA[i][j] - matrixB[i][j];
                    }
                }
                System.out.println("Hasil dari pengurangan : ");
            } else if (choice == 3) {
                System.out.println("Nilai maksimum barisnya adalah " + column1);
                return;
            } else {
                System.out.println("Terima Kasih !");
                System.exit(0);
            }

            for (int i = 0; i < matrixA.length; i++) {
                System.out.print("[");
                for (int j = 0; j < matrixB[0].length; j++) {
                    if (j < (matrixB[0].length - 1)) {
                        System.out.print(hasil[i][j]);
                        System.out.print(",");
                    } else {
                        System.out.print(hasil[i][j]);
                    }
                }
                System.out.println("]");
            }
        }
    }
}