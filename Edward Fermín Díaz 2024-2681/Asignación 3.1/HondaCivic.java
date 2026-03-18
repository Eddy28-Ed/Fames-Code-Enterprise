/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author EDWARD
 */
public class HondaCivic extends AutoMovil {
    
    // Constructor
    public HondaCivic() {
        super(); // Llama al constructor del padre
        System.out.println("Constructor de HondaCivic");
    }

    // Sobrescritura de métodos
    @Override
    public void encender() {
        System.out.println("El Honda Civic esta encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rapidamente...");
    }
}

