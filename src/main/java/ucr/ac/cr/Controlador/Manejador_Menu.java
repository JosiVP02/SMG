/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Modelo.Registro;
import ucr.ac.cr.Modelo.RegistroAlbum;
import ucr.ac.cr.Modelo.RegistroArtista;
import ucr.ac.cr.Vista.FRM_Menu;

/**
 *
 * @author Usuario
 */
public class Manejador_Menu implements ActionListener
{
    private FRM_Menu frmMenu;
    private Registro registro;
    private RegistroAlbum registroAlbum;
    private RegistroArtista registroAr;
    
    
    public Manejador_Menu()
    {
    this.registro= new Registro();
    this.frmMenu=new FRM_Menu();
    this.frmMenu.escucharMenu(this);
    this.frmMenu.setVisible (true);
    this.registroAlbum=new RegistroAlbum();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand().toString())
        {
            case "Registro Canciones":
                
                new Manejador_Canciones(registro);
                break;
                
            case "Registro Artistas":
                
                
                break;
                
            case "Salir":
                
              System.exit(0);
                break;
                
                
            case "Registro Albumes":
                
                new ManejadorAlbumes(registro,registroAr, registroAlbum);
                
                break;
                    
        
        }
    }
    
    
    
    
    
}
