package sesi9.nosatu;

class Mahasiswa <T,O,P> {
    private T nim;
    private O name;
    private P clas;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public T getNim() {
        return nim;
    }

    public void setName(O name) {
        this.name = name;
    }

    public O getName() {
        return name;
    }
    
    public void setClas(P clas) {
        this.clas = clas;
    }

    public P getClas() {
        return clas;
    }

}

public class MahasiswaKu {
    
    public static void main(String[] args) {
        
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
