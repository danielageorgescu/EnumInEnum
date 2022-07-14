package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti ID-ul masinii dorite: ");
        Scanner scanner = new Scanner(System.in);
        int IDDorit = Integer.parseInt(scanner.nextLine());

        tipMasina tipMasina = com.itfactory.tipMasina.findById(IDDorit);
        if(tipMasina != null){
            if(tipMasina.getOption1() == tipMasina.getOption2()){
                System.out.println("Masina este un "+ tipMasina.getDenumire()+" si functioneaza cu "+ tipMasina.getOption1());
            } else{
                System.out.println("Masina este un "+ tipMasina.getDenumire()+" si este hibrida.");
            }
        }
    }
}
