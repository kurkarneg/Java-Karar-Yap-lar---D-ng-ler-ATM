package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Bakiye görüntüleme");
        System.out.println("2. Para yatırma");
        System.out.println("3. Para çekme");
        System.out.println("4. Çıkış");
        int girdi = input.nextInt();
        int bakiye = 10000;
        int islemmiktari = 0 ;
        int parayt = 0;
        int paract = 0;
        if(girdi == 4){
        }else if (girdi < 1 || girdi > 4){
            while(girdi!=4) {
                switch (girdi) {
                    case 1:
                        System.out.println(bakiye); // Ben bakiye goruntulemeyide islem olarak aldim tam olarak belirtmemis ama ben almak istedim o yuzden toplma islem sayisinda bu da gozukucek
                        break;
                    case 2:
                        System.out.println("Yatirilacak para miktarinni giriniz");
                        int paray = input.nextInt();
                        if (paray > 0){
                            bakiye = bakiye + paray;
                            islemmiktari++;
                        }else{
                            System.out.println("Gecersiz miktar menuye yonlendiriliyorusunuz");
                        }
                        break;
                    case 3:
                        System.out.println("Cekilecek para miktarinni giriniz");
                        int parac = input.nextInt();
                        if (parac <= bakiye){
                            bakiye = bakiye - parac;
                            islemmiktari++;
                        }else{
                            System.out.println("Islem gerceklestirilemiyor yeterli bakiyeniz yok");
                        }
                        break;
                    default:
                        System.out.println("Gecersiz menu secimi");





                }
                System.out.println("1. Bakiye görüntüleme");
                System.out.println("2. Para yatırma");
                System.out.println("3. Para çekme");
                System.out.println("4. Çıkış");
                girdi = input.nextInt();







            }
            System.out.println("Islem miktari " + islemmiktari);
            System.out.println("Kalan bakiye " + bakiye);
            System.out.println("Sistemden cikilyor");

        }else {
            while(girdi!=4) {
                switch (girdi) {
                    case 1:
                        System.out.println(bakiye); // Ben bakiye goruntulemeyide islem olarak aldim tam olarak belirtmemis ama ben almak istedim o yuzden toplma islem sayisinda bu da gozukucek
                        break;
                    case 2:
                        System.out.println("Yatirilacak para miktarinni giriniz");
                        int paray = input.nextInt();
                        if (paray > 0){
                            bakiye = bakiye + paray;
                            islemmiktari++;
                        }else{
                            System.out.println("Gecersiz miktar menuye yonlendiriliyorusunuz");
                        }
                        break;
                    case 3:
                        System.out.println("Cekilecek para miktarinni giriniz");
                        int parac = input.nextInt();
                        if (parac <= bakiye){
                            bakiye = bakiye - parac;
                            islemmiktari++;
                        }else{
                            System.out.println("Islem gerceklestirilemiyor yeterli bakiyeniz yok");
                        }
                        break;
                    default:
                        System.out.println("Gecersiz menu secimi");





                }
                System.out.println("1. Bakiye görüntüleme");
                System.out.println("2. Para yatırma");
                System.out.println("3. Para çekme");
                System.out.println("4. Çıkış");
                girdi = input.nextInt();







            }
            System.out.println("Islem miktari " + islemmiktari);
            System.out.println("Kalan bakiye " + bakiye);
            System.out.println("Sistemden cikilyor");
        }

    }
}
