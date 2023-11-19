public class Main {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        customer01.nama = "Ezra";
        customer01.alamat = "Pesbal";
        customer01.namaBarang = "Yamaha 101";
        customer01.jenisBarang= "Gitar";
        customer01.kodeBarang = "111";

        customer01.mesenOnsite();
        System.out.println("Nama Customer: " + customer01.nama);
        System.out.println("Alamat: " + customer01.alamat);
        System.out.println("Nama Barang:" + customer01.namaBarang);
        System.out.println("Jenis Barang:" + customer01.jenisBarang);
        System.out.println("Kode Barang:" + customer01.kodeBarang);
        
    }
    
}
