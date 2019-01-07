package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        while (true) {
        System.out.println("DIGITRON");
        System.out.print("Unesite zeljenu operaciju: 1 = sabiranje, 2 - oduzimanje, 3 - mnozenje, 4 - deljenje, 5 - izlaz:");
        
        
        
        Scanner s = new Scanner (System.in);
        Scanner sb = new Scanner(System.in);
        int operacija = s.nextInt();
        
        if (operacija != 1 && operacija != 2 && operacija != 3 && operacija != 4 && operacija != 5)  {
                System.err.println("Nepoznata operacija! Pokusajte ponovo!");
                continue;
            }  
        
        switch (operacija) {
            case 1 :
                System.out.print("Unesite prvi broj:");
                double br1 = sb.nextDouble();
                System.out.print("Unesite drugi broj");
                double br2 = sb.nextDouble();
                System.out.println("Rezultat je: " + (br1+br2));
                break;
            case 2 :
                System.out.print("Unesite prvi broj: ");
                double br1o = sb.nextDouble();
                System.out.print("Unesite drugi broj: ");
                double br2o = sb.nextDouble();
                System.out.println("Rezultat je: " + (br1o-br2o));
                break;
            case 3 :
                System.out.print("Unesite prvi broj: ");
                double br1m = sb.nextDouble();
                System.out.print("Unesite drugi brojL ");
                double br2m = sb.nextDouble();
                System.out.println("Rezultat je: " + (br1m*br2m)); 
                break;
            case 4 :
                System.out.print("Unesite prvi broj: ");
                double br1d = sb.nextDouble();
                System.out.print("Unesite drugi broj: ");
                double br2d = sb.nextDouble();
                if (br2d == 0) {
                    System.err.println("Deljenje nulom!");
                    break;
                } else {
                    System.out.println("Rezultat je: " + (br1d/br2d));
                }  
                break;
            case 5 :
                System.out.println("Dovidjenja!");
                return;
                
            
                
        }
        
    
}
    }
