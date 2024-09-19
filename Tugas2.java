import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> mahasiswa = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== Menu CRUD Mahasiswa ===");
            System.out.println("1. Create Mahasiswa");
            System.out.println("2. Read Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    createMahasiswa();
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
            }
        } while (pilihan != 0);
    }

    private static void createMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (mahasiswa.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar. Silakan gunakan NIM lain.");
        } else {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            mahasiswa.put(nim, nama);
            System.out.println("Mahasiswa berhasil ditambahkan.");
        }
    }
    private static void readMahasiswa() {
        if (mahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("\n=== Data Mahasiswa ===");
            for (Map.Entry<String, String> entry : mahasiswa.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }
    private static void updateMahasiswa() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String nim = scanner.nextLine();

        if (mahasiswa.containsKey(nim)) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            mahasiswa.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil diupdate.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }
    private static void deleteMahasiswa() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = scanner.nextLine();

        if (mahasiswa.remove(nim) != null) {
            System.out.println("Data mahasiswa berhasil dihapus.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }
}
