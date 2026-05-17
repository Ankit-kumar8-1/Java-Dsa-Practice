package DesignPattern.Singleton;

import java.security.cert.TrustAnchor;

public class UnderStandVolatile {

    public  static volatile boolean containTrueOrFalse = true;


    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            while (containTrueOrFalse){
                System.out.println("Loop is Running...");
            }

            System.out.println("Loop is stop !");
        });
        t1.start();

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        containTrueOrFalse = false;
    }
}
