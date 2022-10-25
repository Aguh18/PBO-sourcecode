package percobaan;

class Parent {
    public int x = 5;
}
    
class child extends Parent {
    public int x = 107;
    public void Info(int x) {
    System.out.println("Nilai x sebagai parameter = " + x);
    System.out .println("Data menber x di class child = " + this.x);
    System.out .println("Data menber x di class Parent = " +
    super.x);}
}



/**
 * InnerParent
 */
 class NilaiX {
    public static void main(String[] args) {
        child tes = new child();
        tes.Info(20);
    }

    
}
    
