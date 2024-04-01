/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Modelo.Cancion;
import ucr.ac.cr.Modelo.Registro;
import ucr.ac.cr.Vista.FRM_Canciones;
import ucr.ac.cr.Vista.PanelBotones;
import ucr.ac.cr.Vista.PanelDatosCancion;

/**
 *
 * @author Usuario
 */
public class Manejador_Canciones implements ActionListener
{
    private PanelBotones panelBotones;
    private Registro registro;
    private FRM_Canciones frmCanciones;
    private PanelDatosCancion panelDatos;
    private Cancion cancion;
    
    
    
    public Manejador_Canciones()
    {
      
        this.frmCanciones=new FRM_Canciones();
        this.frmCanciones.setEscuchadores(this);
        
        this.registro= new Registro();
        this.panelDatos=this.frmCanciones.getPanelDatos();
        this.panelDatos.cargarCombo(this.registro.getComboTitulo());
        this.panelBotones=this.frmCanciones.getPanelBotones();
        
        this.frmCanciones.setVisible(true);
        
    }//fin constructor

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        switch (e.getActionCommand().toString()) 
        {
            case "Agregar":
                
                if(panelDatos.verificar()==true)
                {
                  this.frmCanciones.mensaje("Porfavor ingrese todos los valores");
                }else
                {
                
                
                this.cancion=panelDatos.getCancion();
                
                this.frmCanciones.mensaje(registro.agregarCancion(cancion));
                  
                this.panelDatos.cargarCombo(this.registro.getComboTitulo());
                
                this.panelDatos.limpiar();
                
                }
                this.panelBotones.activarBotones(false);
                break;
                
                case "Editar":
                
                if(panelDatos.verificar()==true)
                {
                  this.frmCanciones.mensaje("Porfavor ingrese todos los valores");
                }else
                {
                     
                 this.cancion=panelDatos.getCancion();
                
                 this.frmCanciones.mensaje(registro.editarCancion(cancion));
                 this.panelDatos.cargarCombo(this.registro.getComboTitulo());
                 this.panelDatos.limpiar();
                }
                
                this.panelBotones.activarBotones(false);
                break;
                
                
                case "Eliminar":
                    
                 this.cancion=panelDatos.getCancion();
                
                 this.frmCanciones.mensaje(registro.borrarCancion(cancion));
                 this.panelDatos.cargarCombo(this.registro.getComboTitulo());
                 this.panelDatos.limpiar();
                 
                this.panelBotones.activarBotones(false);
                break;
                
                case "Salir":
                    
                    frmCanciones.dispose();
                
                break;
                
                case "comboBoxChanged":
                
                  this.cancion=this.registro.buscarCancion(this.panelDatos.devolverCombo());
                  this.panelDatos.setCancion(cancion);
                  
                  this.panelBotones.activarBotones(true);
                break;
                
           
        }
        
    }
    
    
    
    
}//fin
