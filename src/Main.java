import java.util.Scanner;

/**
 * Kelas Segitiga menyediakan metode untuk menghitung keliling dan luas segitiga
 * berdasarkan panjang sisi yang diberikan, setelah memvalidasi apakah panjang sisi
 * dapat membentuk segitiga yang valid.
 */
class Segitiga {

    /**
     * Metode utama untuk menjalankan program.
     * Mengambil input panjang sisi segitiga, memvalidasi, lalu menghitung keliling
     * dan luas segitiga jika sisi-sisi tersebut valid.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input sisi-sisi segitiga
        double[] sisi = inputSegitiga(input);

        // Validasi segitiga
        if (!validasiSegitiga(sisi)) {
            System.out.println("Sisi-sisi yang dimasukkan tidak membentuk segitiga.");
            return;
        }

        // Menghitung keliling
        double keliling = hitungKeliling(sisi);
        System.out.println("Keliling segitiga: " + keliling);

        // Menghitung luas
        double luas = hitungLuas(sisi, keliling);
        System.out.println("Luas segitiga: " + luas);
    }

    /**
     * Mengambil input panjang ketiga sisi segitiga dari pengguna.
     *
     * @param input objek Scanner untuk membaca input dari pengguna
     * @return array yang berisi panjang ketiga sisi segitiga
     */
    private static double[] inputSegitiga(Scanner input) {
        double[] sisi = new double[3];
        System.out.print("Masukkan panjang sisi a: ");
        sisi[0] = input.nextDouble();
        System.out.print("Masukkan panjang sisi b: ");
        sisi[1] = input.nextDouble();
        System.out.print("Masukkan panjang sisi c: ");
        sisi[2] = input.nextDouble();
        return sisi;
    }

    /**
     * Memvalidasi apakah panjang sisi yang diberikan dapat membentuk segitiga.
     * Aturan validasi segitiga: jumlah dua sisi harus lebih besar dari sisi ketiga.
     *
     * @param sisi array yang berisi panjang ketiga sisi segitiga
     * @return true jika sisi-sisi tersebut dapat membentuk segitiga, false jika tidak
     */
    private static boolean validasiSegitiga(double[] sisi) {
        return sisi[0] + sisi[1] > sisi[2] &&
                sisi[0] + sisi[2] > sisi[1] &&
                sisi[1] + sisi[2] > sisi[0];
    }

    /**
     * Menghitung keliling segitiga berdasarkan panjang sisi-sisinya.
     *
     * @param sisi array yang berisi panjang ketiga sisi segitiga
     * @return keliling segitiga
     */
    private static double hitungKeliling(double[] sisi) {
        return sisi[0] + sisi[1] + sisi[2];
    }

    /**
     * Menghitung luas segitiga menggunakan rumus Heron.
     * Luas dihitung berdasarkan keliling dan panjang sisi-sisinya.
     *
     * @param sisi     array yang berisi panjang ketiga sisi segitiga
     * @param keliling keliling segitiga
     * @return luas segitiga
     */
    private static double hitungLuas(double[] sisi, double keliling) {
        double s = keliling / 2;
        return Math.sqrt(s * (s - sisi[0]) * (s - sisi[1]) * (s - sisi[2]));
    }
}