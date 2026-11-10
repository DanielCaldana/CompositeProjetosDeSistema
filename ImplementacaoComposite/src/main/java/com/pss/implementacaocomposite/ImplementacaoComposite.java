/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pss.implementacaocomposite;

/**
 *
 * @author Daniel
 */
public class ImplementacaoComposite {

    public static void main(String[] args) {

        Computador computador = new Computador();

        CPU cpu = new CPU(500, 600, 700);
        Memoria memoria = new Memoria(200, 250, 300);
        PlacaMae placaMae = new PlacaMae("ASUS", 400, 450, 500);
        PlacaVideo placaVideo = new PlacaVideo(1500, 1700, 1900);
        HardDisk hd = new HardDisk(300, 350, 400);

        computador.adicionar(cpu);
        computador.adicionar(memoria);
        computador.adicionar(placaMae);
        computador.adicionar(placaVideo);
        computador.adicionar(hd);

        System.out.println("Custo: " + computador.getPrecoCusto());
        System.out.println("Lucro mínimo: " + computador.getPrecoLucroMinimo());
        System.out.println("Lucro máximo: " + computador.getPrecoLucroMaximo());
    }
}
