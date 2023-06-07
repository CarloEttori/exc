// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void  main(String[] args){
        Persona persona1 = new Persona("Mario", 25);
        persona1.saluta();
        persona1.festeggiaCompleanno();
        System.out.println(persona1.getEtà());
        persona1.setNome("Luigi");
        System.out.println(persona1.getNome());
    }
}