/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import sorvete.Sorvete;
import sorvete.SorveteVegano;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class SorveteriaVegano extends Sorveteria {
    
    @Override
    protected Sorvete criarSorvete() {
        return new SorveteVegano();
    }
    
}
