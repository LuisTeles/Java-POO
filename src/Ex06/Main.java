package Ex06;

public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Pilot piloto1 = new Pilot();
        Motor motor1;

        //agregacao piloto pode existir independentemente do kart
        kart1.piloto = piloto1;

        //composicao motor so existe se kart existir
        //so posso acessar o motor vindo do kart
        kart1.motor.cilindrada = "150";

    }
}
