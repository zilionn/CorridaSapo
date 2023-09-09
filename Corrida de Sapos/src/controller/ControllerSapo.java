package controller;

public class ControllerSapo extends Thread {

    private static final int saltoMax = 10;
    private static final int distMax = 100;
    private static final int sapTot = 5;
    private static int posiFin = 0;

    private int sapo;

    public ControllerSapo(int sapo) {
        this.sapo = sapo;
    }

    @Override
    public void run() {
        int distanciaPercorrida = 0;
        while (distanciaPercorrida < distMax) {
            int salto = (int) (Math.random() * (saltoMax + 1));
            distanciaPercorrida += salto;
            if (distanciaPercorrida > distMax) {
                distanciaPercorrida = distMax;
            }
            System.out.println("O sapo de número " + (sapo + 1) + " deu um salto incrível de " + salto + " metros! Continue assim! (" + distanciaPercorrida + "/" + distMax + " metros percorridos)");
            if (distanciaPercorrida == distMax) {
                posiFin++;
                System.out.println("O sapo de número " + (sapo + 1) + " chegou em " + posiFin + "º lugar! Arrasou demais!");
                if (posiFin == sapTot) {
                    System.out.println("───── 𝘍𝘐𝘔 𝘋𝘈 𝘊𝘖𝘙𝘙𝘐𝘋𝘈 ─────");
                }
            }
            try {
                sleep((int) (Math.random() * 1001));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}