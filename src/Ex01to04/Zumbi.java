package Ex01to04;

public class Zumbi {
    String nome;
    double vida;
    int fome = 0; //goes to 10
    boolean alimentado = false;

    void setAlimentado(int fome){
        if (fome > 5){
            System.out.println("Esta com fome");
            alimentado = false;
        } else {
            System.out.println("Esta alimentado");
            alimentado = true;
        }
    }

    double mostraVida(){
        return vida;
    }

    // metodo recebe a classe como parametro
    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida > quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            return false;
        }
    }

}
