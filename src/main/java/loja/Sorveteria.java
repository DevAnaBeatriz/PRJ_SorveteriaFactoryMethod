/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;
import sorvete.Sorvete;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class Sorveteria {

    public void fazerPedido() {
        Sorvete sorvete = criarSorvete(); 
        sorvete.servir();
    }

    protected Sorvete criarSorvete() {
        throw new UnsupportedOperationException("Esse método DEVE sobrescrito pela subclasse.");
    }
}

