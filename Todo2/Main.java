import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Buat Array
        ArrayList<String> eskrim = new ArrayList<>();

        // Tambah Data ke Array
        eskrim.add("Vanila");
        eskrim.add("Taro");
        eskrim.add("Matcha");
        eskrim.add("Cokelat");
        eskrim.add("Strawberry");

        // Tampilkan Isi Array
        System.out.println("Array Es Krim:");
        for (String element : eskrim) {
            System.out.println(element);
        }

        // Penghapusan Data dari Array
        eskrim.remove("Taro");

        // Tampilkan isi Array setelah penghapusan
        System.out.println("\nArray Es Krim setelah penghapusan:");
        for (String element : eskrim) {
            System.out.println(element);
        }

        // Menampilkan ukuran Array
        int size = eskrim.size();
        System.out.println("\nJumlah Array Es Krim: " + size);

        // Memeriksa apakah Array kosong atau tidak
        boolean isEmpty = eskrim.isEmpty();
        System.out.println("Apakah Array Es krim kosong? " + isEmpty);
    }
}
