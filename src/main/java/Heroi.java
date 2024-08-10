public class Heroi extends Personagem{

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double totalForca = 0.;

        for (SuperPoder sp: poderes) {
            totalForca += sp.getCategoria();
        }

        return totalForca + (totalForca * 0.15);
    }

    @Override
    public String toString() {
        return """
               %s
               Força total: %.2f
               """.formatted(super.toString(), getForcaTotal());


    }
}
