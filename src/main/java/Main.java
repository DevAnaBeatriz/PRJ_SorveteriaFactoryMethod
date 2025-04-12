/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 * 
 *  * a classe concreta Sorveteria define
 * um método fazerPedido(), que encapsula 
 * a lógica comum de servir um sorvete, mas 
 * delega a criação do objeto específico ao
 * método criarSorvete(). Esse método fábrica
 * é sobrescrito pelas subclasses (SorveteriaVegano com sorvete vegano né 
 * e SorveteriaLeite com sorvete a base de leite), que decidem qual tipo
 * concreto de sorvete será criado (SorveteVegano ou SorveteLeite). 
 * Com isso, o cliente (Main) utiliza a interface comum Sorveteria 
 * para fazer pedidos, sem saber ou se preocupar com o tipo específico
 * de sorvete sendo instanciado. Essa abordagem promove desacoplamento,
 * reutilização de código e facilidade de extensão, que são exatamente 
 * os objetivos do padrão Factory Method.
 */

import loja.Sorveteria;
import loja.SorveteriaVegano;
import loja.SorveteriaLeite;

public class Main {
    public static void main(String[] args) {
        Sorveteria sorveteria;

        String tipo = "vegano"; 

        if (tipo.equalsIgnoreCase("vegano")) {
            sorveteria = new SorveteriaVegano();
        } else {
            sorveteria = new SorveteriaLeite();
        }

        sorveteria.fazerPedido(); // cliente não sabe qual sorvete concreto É servido
    }
}
