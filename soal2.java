import java.util.Scanner;
import java.util.ArrayList;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, nomorMenuYgDipesan, jumlah, totalBiaya = 0;

        System.out.println();
        System.out.println("=== Selamat Datang di Kafe ===");
        System.out.println();
        System.out.println("=== Menu ===");
        System.out.println("1. Nasi Goreng - Rp20000");
        System.out.println("2. Mie Goreng - Rp15000");
        System.out.println("3. Roti Bakar - Rp12000");
        System.out.println("4. Kentang Goreng - Rp10000");
        System.out.println("5. Teh Tarik - Rp8000");
        System.out.println("6. Cappucino - Rp20000");
        System.out.println("7. Chocolate Ice - Rp25000");
        System.out.println();

        // Array
        String[] listMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] hargaMenu = {20000, 15000, 12000, 10000, 8000, 20000, 25000};
        ArrayList<String> pesanan = new ArrayList<>();
        ArrayList<Integer> jumlahPesanan = new ArrayList<>();
        ArrayList<Integer> jumlahHarga = new ArrayList<>();

        do {
            System.out.println("Pilih opsi berikut:");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Daftar Pesanan");
            System.out.println("3. Hitung Total Bayar");
            System.out.println("4. Selesai");

            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                nomorMenuYgDipesan = input.nextInt();
                System.out.print("Masukkan jumlah yang ingin dipesan: ");
                jumlah = input.nextInt();
                System.out.println("  >> " + jumlah + " " + listMenu[nomorMenuYgDipesan - 1] + " berhasil ditambahkan ke pesanan");
                pesanan.add(listMenu[nomorMenuYgDipesan - 1]);
                jumlahPesanan.add(jumlah);
                jumlahHarga.add(hargaMenu[nomorMenuYgDipesan - 1]);

            } else if (pilihan == 2) {
                System.out.println();
                int biayaMenu = 0;

                for (int i = 0; i < pesanan.size(); i++) {
                    System.out.println("  >> " + jumlahPesanan.get(i) + " " + pesanan.get(i) + " - Rp" + jumlahHarga.get(i));
                    biayaMenu += jumlahHarga.get(i) * jumlahPesanan.get(i);
                }
                System.out.println("===================");
                System.out.println("Biaya sementara = Rp" + biayaMenu);
            } else if (pilihan == 3) {

                totalBiaya = 0;
                for (int i = 0; i < pesanan.size(); i++) {
                    totalBiaya += jumlahHarga.get(i) * jumlahPesanan.get(i);
                }
                System.out.println("Total biaya seluruh pesanan: Rp" + totalBiaya);
            } else if (pilihan == 4) {

                System.out.println("Terima kasih telah memesan di kafe kami!");
                break; 
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (true);

        input.close(); 
    }
}

       