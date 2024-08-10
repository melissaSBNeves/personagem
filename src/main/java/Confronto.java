import java.util.ArrayList;
import java.util.List;

public class Confronto {

    public Confronto() {}

    public void lutar(Heroi heroi, Vilao vilao){

        System.out.println(heroi.getNome() + " VS " + vilao.getNome());

        String msgVencedor = "*------- VENCEDOR DO COMBATE -------*";

        if(heroi.getForcaTotal() > vilao.getForcaTotal()){
            System.out.println(msgVencedor);
            System.out.println(heroi.toString());

        } else if (heroi.getForcaTotal() < vilao.getForcaTotal()) {
            System.out.println(msgVencedor);
            System.out.println(vilao.toString());
        }else{
            System.out.println("*------- HOUVE UM EMPATE -------*");
        }

    }
}
