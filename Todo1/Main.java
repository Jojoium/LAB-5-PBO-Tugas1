public class Main {
    public static void main(String[] args) {

        kucing pawpurr= new kucing("Pawpurr", "british shorthair", "abu-abu", 4);
        pawpurr.berjalan();
        pawpurr.makan();
        pawpurr.tidur();
        pawpurr.meow();

        kucing meowsca= new kucing("Meowsca", "scottish fold", "coklat", 2);
        meowsca.tidur();
        meowsca.berjalan();
        meowsca.makan();
        meowsca.meow();

        kucing oreo= new kucing("Oreo", "Maine Coon", "hitam putih", 3);
        oreo.tidur();
        oreo.meow();
        oreo.berjalan();
        oreo.makan();
    }

}