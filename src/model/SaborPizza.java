/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guill
 */
public class SaborPizza {
    
    private String sabores[] 
            = {
                    "Calabresa", "Frango", "Milho",
                    "Bacon", "Queijo", "Portuguesa"
            };

    public String[] getSabores() {
        return sabores;
    }

    public void setSabores(String[] sabores) {
        this.sabores = sabores;
    }
    
}
