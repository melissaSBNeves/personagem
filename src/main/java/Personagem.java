import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {


    private String codinome;
    private String nome;

    protected List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList<>();
    }

    public void adicionarPoder(String nome, Integer categoria){
        SuperPoder superPoder = new SuperPoder(nome, categoria);
        poderes.add(superPoder);
    }

    public abstract Double getForcaTotal();


    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<SuperPoder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return """
               Codinome: %s
               Nome: %s
               Poderes: %s""".formatted(codinome, nome, poderes);
    }
}
