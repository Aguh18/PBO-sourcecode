class Naruto extends Anime {
    @Override
    public void mengeluarkanJurus() {
      System.out.println("Hakke kusho");
    }
    public static void main(String[] args) {
      Naruto naruto = new Naruto();
      naruto.mengeluarkanJurus();
    }
  }
  