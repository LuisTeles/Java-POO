package Ex01;

public class Main {
    public static void main(String[] args) {
        Zumbi z = new Zumbi();
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 80;

        z1 = z2;

        System.out.println(z1.vida);
        System.out.println(z2.vida);
    }
}
