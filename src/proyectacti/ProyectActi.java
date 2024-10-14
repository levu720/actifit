/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectacti;

import principal.frmlogin;

/**
 *
 * @author crist
 */
public class ProyectActi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario;
        String contraseña;
        // Crear la instancia del formulario de login
        frmlogin login = new frmlogin(null, true);  // null, true para que sea modal
        
        // Mostrar el formulario de login
        login.setVisible(true);
        
        
       
    }

    public ProyectActi() {
    }
    
}