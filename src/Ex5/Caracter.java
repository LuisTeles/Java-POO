package Ex5;

public class Caracter {
    int vida = 100;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        vida -= 5;
    }

}
