public class Main {
    public static <L> void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 69.8f, 14, 2, 3);

        l[2] = new Lutador("Anderson", "Paraguay", 19, 1.78f, 87.8f, 14, 2, 3);

        l[3] = new Lutador("Junin", "Alemanha", 39, 1.50f, 85.8f, 14, 2, 3);

        l[4] = new Lutador("CaoLouco", "EUA", 25, 1.67f, 77.8f, 14, 2, 3);

        l[5] = new Lutador("MalucoDoDegrau", "Japão", 32, 1.88f, 67.8f, 14, 2, 3);

        Luta UEC01 = new Luta();

        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();

    }
}