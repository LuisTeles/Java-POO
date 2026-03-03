package Ex5;

public class Main {
    public static void main(String[] args) {
        Caracter jhon = new Caracter();

        jhon.vida = 100;

        Arma arma = new Arma();
        arma.resistencia = 50;
        arma.poder = 100;
        jhon.arma = arma;

        jhon.usarArma();
        arma.mostraInfoArma();

        jhon.tomarDano();
        System.out.println(jhon.vida);

    }
}
