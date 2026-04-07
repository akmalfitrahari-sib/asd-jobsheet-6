import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(n);
        
        for (int i = 0; i < n; i++) {
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("--------------------");

            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
