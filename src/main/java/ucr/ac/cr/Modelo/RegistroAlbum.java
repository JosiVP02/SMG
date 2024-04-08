/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class RegistroAlbum 
{
    private ArrayList<Album> albumes;
    String mensaje;

    public RegistroAlbum() 
    {
        this.albumes = new ArrayList<>();
        this.mensaje = "";
    }
    
    
    
    public String agregarAlbum(Album album)
    {
       if(album!=null)
       {
         if(buscarAlbum(album.getTitulo())==null)
         {
            this.albumes.add(album);
            mensaje="Album agregaoa correctamente";
         }else
         {
          mensaje="Ya se encuentra un Album agregado con el titulo escrito";
         }
       }else
       { 
         mensaje="Error al guardar";
       }
       
       return mensaje;
    }
   //*******************************************************************
    
    public Album buscarAlbum(String titulo)
    {
      for(Album miAlbum:albumes)
      {
        if (miAlbum.getTitulo().equalsIgnoreCase(titulo))
        {
          return miAlbum;
        }
      }
      return null;
    }
    
    
   
}
