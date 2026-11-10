/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.implementacaocomposite;

/**
 *
 * @author Daniel
 */
public class Memoria implements Componente {
    private double precoCusto;
    private double precoLucroMinimo;
    private double precoLucroMaximo;

    public Memoria(double custo, double minimo, double maximo) {
        this.precoCusto = custo;
        this.precoLucroMinimo = minimo;
        this.precoLucroMaximo = maximo;
    }

    @Override
    public double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return precoLucroMinimo;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return precoLucroMaximo;
    }
}