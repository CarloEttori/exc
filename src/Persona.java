public class Persona<Età, Nome> {
    public String Nome;
    public int Età;


    public Persona (String Nome,int Età){
        this.Nome=Nome;
        this.Età= Età;

    }
    public void saluta(){
        System.out.println("Ciao, mi chiamo "+ Nome);
    }
    public void festeggiaCompleanno(){
        this.Età = Età +1;
        System.out.println("Buon compleanno! Hai appena compiuto " + Età +" anni.");
    }

    // setter
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void setEtà(int eta){
        this.Età = Età;
    }


    // getter
    public String getNome(){
        return Nome;
    }

    public int getEtà(){
        return Età;
    }
}
