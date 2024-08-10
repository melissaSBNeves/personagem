public class App {

    public static void main(String[] args) {

        Confronto confronto = new Confronto();
        Heroi heroi01 = new Heroi("Mulher Maravilha", "Diana Prince");
        Heroi heroi02 = new Heroi("Ninja Copiador", "Kakashi Hatak");
        Vilao vilao01 = new Vilao("Hera Venenosa", "Pamela Isley");
        Vilao vilao02 = new Vilao("Demômio do gás oculto", "Zabuza Momochi");

        heroi01.adicionarPoder("Força", 9);
        heroi01.adicionarPoder("Super velocidade", 8);
        heroi01.adicionarPoder("Fator generativo", 10);

        heroi02.adicionarPoder("Kamui", 8);
        heroi02.adicionarPoder("Chidori", 7);
        heroi02.adicionarPoder("Sharingan", 8);

        vilao01.adicionarPoder("Imunidade tóxica", 6);
        vilao01.adicionarPoder("Manipulação de plantas", 8);
        vilao01.adicionarPoder("Hipnose", 8);

        vilao02.adicionarPoder("Corte em Vários Pedaços", 7);
        vilao02.adicionarPoder("Espada Rotativa Voadora", 7);
        vilao02.adicionarPoder("Técnica do Clone de Água", 8);

        confronto.lutar(heroi01, vilao01);
        confronto.lutar(heroi02, vilao02);
        confronto.lutar(heroi01, vilao02);
        confronto.lutar(heroi02, vilao01);

    }


}
