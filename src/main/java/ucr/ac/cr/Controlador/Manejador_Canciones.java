/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ucr.ac.cr.Modelo.Cancion;
import ucr.ac.cr.Modelo.Registro;
import ucr.ac.cr.Vista.FRM_Canciones;
import ucr.ac.cr.Vista.FRM_Reporte;
import ucr.ac.cr.Vista.PanelBotones;
import ucr.ac.cr.Vista.PanelDatosCancion;

/**
 *
 * @author Usuario
 */
public class Manejador_Canciones implements ActionListener, MouseListener
{
    private PanelBotones panelBotones;
    private Registro registro;
    private FRM_Canciones frmCanciones;
    private PanelDatosCancion panelDatos;
    private Cancion cancion;
    private FRM_Reporte reporte;
    
    
    public Manejador_Canciones()
    {
      
        this.frmCanciones=new FRM_Canciones();
        this.frmCanciones.setEscuchadores(this);
        
        this.registro= new Registro();
        this.panelDatos=this.frmCanciones.getPanelDatos();
        this.panelDatos.cargarCombo(this.registro.getComboTitulo());
        this.panelBotones=this.frmCanciones.getPanelBotones();
        
        this.frmCanciones.setVisible(true);
        this.reporte= new FRM_Reporte();
        
        this.reporte.escucharMouse(this);
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
                
                
                case "Reporte":
                    
                    reporte.setDataTable(registro.getMatrizCanciones(), Cancion.TITULOS_CANCION);
                    reporte.setVisible(true);
                    break;
                
           
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
       this.panelDatos.setCancion(new Cancion(this.reporte.getDataRow()[0],
       Integer.parseInt(this.reporte.getDataRow()[1]),
               this.reporte.getDataRow()[2],
                       Integer.parseInt(this.reporte.getDataRow()[3])));
       
       this.reporte.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
    }
    
    
    
    
}//fin
