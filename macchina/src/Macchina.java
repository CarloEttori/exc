public class Macchina {
    public String marca;
    public String modello;
    public int anno;
    public String colore;

    public Macchina(String marca, String modello, int anno, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno=anno;
        this.colore=colore;

    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public String getColore() {
        return colore;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void mostraDettagli(){
        System.out.println(marca);
        System.out.println(modello);
        System.out.println(anno);
        System.out.println(colore);
    }

    public void avvia(){
        System.out.println("la " + marca + modello +" è stata avviata.");
    }
    public void ferma(){
        System.out.println("La " + marca + modello +" è stata ferma.");
    }
}
