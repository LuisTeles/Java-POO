package Ex01;

public class Zumbi {
    String nome;
    int vida;
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
}
