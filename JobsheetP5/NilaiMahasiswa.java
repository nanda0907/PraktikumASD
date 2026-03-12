package JobsheetP5;

public class NilaiMahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    NilaiMahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    // UTS tertinggi (Divide and Conquer)
    int utsTertinggi(NilaiMahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int lMax = utsTertinggi(arr, l, mid);
        int rMax = utsTertinggi(arr, mid+1, r);

        if(lMax > rMax){
            return lMax;
        }else{
            return rMax;
        }
    }

    // UTS terendah (Divide and Conquer)
    int utsTerendah(NilaiMahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lMin = utsTerendah(arr, l, mid);
        int rMin = utsTerendah(arr, mid+1, r);

        if(lMin < rMin){
            return lMin;
        }else{
            return rMin;
        }
    }

    // rata-rata UAS (Brute Force)
    double rataUAS(NilaiMahasiswa arr[]){
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            total = total + arr[i].uas;
        }
        return total / arr.length;
    }
}