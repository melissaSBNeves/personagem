public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double totalForca = 0.;

        for (SuperPoder sp: poderes) {
            totalForca += sp.getCategoria();
        }

        return totalForca;
    }

    @Override
    public String toString() {
        return  """
                %s
                Força total: %.2f
                """.formatted(super.toString(), getForcaTotal());
    }
}
