/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Vista.FRM_Menu;

/**
 *
 * @author Usuario
 */
public class Manejador_Menu implements ActionListener
{
    FRM_Menu frmMenu;
    
    public Manejador_Menu()
    {
    
    this.frmMenu=new FRM_Menu();
    this.frmMenu.escucharMenu(this);
    this.frmMenu.setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand().toString())
        {
            case "Registro Canciones":
                
                new Manejador_Canciones();
                break;
                
            case "Registro Artistas":
                
                
                break;
                
            case "Salir":
                
              System.exit(0);
                break;
                    
        
        }
    }
    
    
    
    
    
}
