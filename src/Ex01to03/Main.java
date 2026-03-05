package Ex01to03;

public class Main {
    public static void main(String[] args) {
        Zumbi z = new Zumbi();
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        //z1.transfereVida(z2,50);
        //z2.transfereVida(z1,50);

        // z1 aponta para z2
        z1 = z2;

        z2.vida = 300;

        System.out.println(z1.mostraVida()); // z1 = 300
        //System.out.println(z2.mostraVida());
    }
}
