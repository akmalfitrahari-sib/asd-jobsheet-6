public class MahasiswaBerprestasi03 {
    Mahasiswa03 [] listMhs;
    int idx;

    MahasiswaBerprestasi03(int n) {
        listMhs = new Mahasiswa03[n];
    }

    void tambah(Mahasiswa03 m) {
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("-------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa03 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
