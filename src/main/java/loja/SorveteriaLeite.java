/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import sorvete.Sorvete;
import sorvete.SorveteLeite;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class SorveteriaLeite extends Sorveteria {
    @Override
    protected Sorvete criarSorvete() {
        return new SorveteLeite();
    }
}


