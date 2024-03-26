public class kucing {
    String nama;
    String jenis;
    String warnarambut;
    int umur;


    public kucing(String nama, String jenis, String warnarambut, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.warnarambut = warnarambut;
        this.umur = umur;
    }

    //    methhod
    public void makan() { System.out.println(nama + " sedang makan."); }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    public void meow() {
        System.out.println(nama + ": Meow! Meow!");
    }
}