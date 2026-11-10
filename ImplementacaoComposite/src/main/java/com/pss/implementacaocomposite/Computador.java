/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.implementacaocomposite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class Computador implements Componente {
    private List<Componente> pecas;
    
    public Computador() {
        pecas = new ArrayList<>();
    }

    public void adicionar(Componente c) {
        pecas.add(c);
    }

    public void remover(Componente c) {
        pecas.remove(c);
    }

    @Override
    public double getPrecoCusto() {
        double total = 0;
        for (Componente c : pecas) {
            total = total + c.getPrecoCusto();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMinimo() {
        double total = 0;
        for (Componente c : pecas) {
            total = total + c.getPrecoLucroMinimo();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMaximo() {
        double total = 0;
        for (Componente c : pecas) {
            total = total + c.getPrecoLucroMaximo();
        }
        return total;
    }
}
