// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Macchina auto1 = new Macchina("Ferrari","488 GTB",2022,"Rosso");
        Macchina auto2 = new Macchina("BMW","X5",2021,"Nero");
        auto1.mostraDettagli();
        System.out.println("--------------------------");
        auto2.mostraDettagli();
        System.out.println("--------------------------");
        auto2.setColore("Blu");
        System.out.println("La BMW ora è "+auto2.colore);
        auto2.mostraDettagli();
    }
}