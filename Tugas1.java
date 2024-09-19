import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);

        // Menutup scanner
        scanner.close();
    }
}
