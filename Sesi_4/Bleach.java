public class Bleach extends Anime {
    @Override
    public void mengeluarkanJurus() {
        System.out.println("getsuga Tensho");
    }
    public static void main(String[] args) {
        Bleach ichigo = new Bleach();
        ichigo.mengeluarkanJurus();
        ichigo.mengeluarkanJurus(1);
    }
}
