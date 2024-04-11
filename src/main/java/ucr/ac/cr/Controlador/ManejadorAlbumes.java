/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Modelo.Album;
import ucr.ac.cr.Modelo.Artista;
import ucr.ac.cr.Modelo.Cancion;
import ucr.ac.cr.Modelo.Registro;
import ucr.ac.cr.Modelo.RegistroAlbum;
import ucr.ac.cr.Modelo.RegistroArtista;
import ucr.ac.cr.Vista.FRM_ALBUMES;

/**
 *
 * @author Usuario
 */
public class ManejadorAlbumes implements ActionListener
{
    private Registro registro;
    private RegistroArtista registroAr;
    private RegistroAlbum registroAl;
    
    private FRM_ALBUMES frmAlbum;
    private Artista artista;
    private Cancion cancion;
   

    public ManejadorAlbumes(Registro registro, RegistroArtista registroAr, RegistroAlbum registroAl) 
    {
        this.registro = registro;
        this.registroAr = registroAr;
        this.registroAl = registroAl;
        
        this.frmAlbum=new FRM_ALBUMES();
        frmAlbum.cargarComboArtistas(registroAr.getId());
        frmAlbum.cargarComboTitulo(registro.getComboTitulo());
        this.frmAlbum.escuchador(this);
    }
    
    
    

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch (e.getActionCommand().toString()) 
        {
            
            case "comboBoxCanciones":
                
                this.cancion= this.registro.buscarCancion(frmAlbum.devolverComboCanciones());
                
                
                
                break;
                
                
            case "comboBoxArtistas":
                
                this.artista= this.registroAr.buscarArtista(frmAlbum.devolverComboArtistas());
                this.frmAlbum.setTxTNombre(artista.getNombre());
                
                break;
                
                
            case "Agregar a tabla":
                
                registroAl.agregarArtista(artista);
                registroAl.agregarCancion(cancion);
                
                frmAlbum.setDatosTabla(registroAl.getMatrizTabla(), Album.TITULO_TABLA);
                
                frmAlbum.getMensaje("Agregado a la tabla correctamente");


                
                break;
                
                
                case "Guardar Album":
                
                    
                    frmAlbum.getMensaje(registroAl.agregarAlbum(new Album(frmAlbum.getTxTTitulo(),
                            Integer.parseInt(frmAlbum.getTxTAno()), registroAl.getCanciones(), 
                            registroAl.getArtistas())));
                    
                break;
           
        }
        
    }
    
    
    
    
}
