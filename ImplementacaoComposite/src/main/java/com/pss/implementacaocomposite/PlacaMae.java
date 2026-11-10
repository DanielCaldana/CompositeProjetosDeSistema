/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.implementacaocomposite;

/**
 *
 * @author Daniel
 */
public class PlacaMae implements Componente {
    private String placaNome;
    private double precoCusto;
    private double precoLucroMinimo;
    private double precoLucroMaximo;

    public PlacaMae(String nome, double custo, double minimo, double maximo) {
        this.placaNome = nome;
        this.precoCusto = custo;
        this.precoLucroMinimo = minimo;
        this.precoLucroMaximo = maximo;
    }

    public String getPlacaNome() {
        return placaNome;
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