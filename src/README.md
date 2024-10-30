# Segitiga

Proyek ini merupakan aplikasi sederhana dalam Java yang digunakan untuk menghitung **keliling** dan **luas segitiga**. Aplikasi ini menerima panjang tiga sisi segitiga dari pengguna, memvalidasi apakah sisi-sisi tersebut membentuk segitiga yang valid, kemudian menghitung keliling dan luas menggunakan rumus Heron.

## Fitur
- Input panjang tiga sisi segitiga dari pengguna.
- Validasi segitiga berdasarkan aturan geometri (jumlah dua sisi harus lebih besar dari sisi ketiga).
- Menghitung keliling segitiga.
- Menghitung luas segitiga menggunakan rumus Heron.

## Struktur Proyek
- **Segitiga.java**: Kelas utama yang berisi metode-metode untuk menjalankan program, validasi segitiga, menghitung keliling, dan menghitung luas.

## Cara Menjalankan Program
1. Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda. Anda dapat memverifikasinya dengan menjalankan:
   ```bash
   java -version
2. Clone atau unduh proyek ini ke komputer Anda.
3. Buka terminal atau command prompt, lalu navigasikan ke direktori proyek.
4. Kompilasi file Segitiga.java dengan perintah berikut:
   javac Segitiga.java
5. Jalankan program dengan perintah:
   java Segitiga
### Contoh Penggunaan
Setelah menjalankan program, masukkan panjang ketiga sisi segitiga sesuai permintaan. Berikut adalah contoh input dan output program:
* Masukkan panjang sisi a: 3
* Masukkan panjang sisi b: 4
* Masukkan panjang sisi c: 5
* Keliling segitiga: 12.0
* Luas segitiga: 6.0
* Jika sisi-sisi yang dimasukkan tidak membentuk segitiga, program akan memberikan pesan berikut:
### Informasi Tambahan
* Program ini menggunakan rumus Heron untuk menghitung luas segitiga.
* Sebelum menghitung keliling dan luas, program memastikan bahwa panjang sisi yang dimasukkan membentuk segitiga yang valid.
### Kontribusi
Jika Anda tertarik untuk mengembangkan lebih lanjut atau menambahkan fitur, Anda dipersilakan untuk melakukan fork dan pull request.
### Lisensi
Proyek ini tidak memiliki lisensi khusus. Anda bebas menggunakannya untuk pembelajaran atau proyek pribadi.

File README.md ini menyediakan informasi penting tentang proyek, instruksi menjalankan program, contoh penggunaan, dan rincian tambahan untuk membantu pengguna memahami dan menjalankan aplikasi.
