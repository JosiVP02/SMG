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
    
    private ArrayList<Artista> artistas;
    private ArrayList <Cancion> canciones;

    public RegistroAlbum() 
    {
        this.albumes = new ArrayList<>();
        this.mensaje = "";
        this.albumes=new ArrayList<>();
        this.artistas=new ArrayList<>();
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
    
    
    public String agregarCancion(Cancion cancion)
    {
       if(cancion!=null)
       {
         canciones.add(cancion);
            mensaje="Cancion agregada correctamente";
        
       
       }else
       { 
         mensaje="Error al guardar";
       }
       
       return mensaje;
    }
    
    
    public String agregarArtista(Artista artista)
    {
       if(artista!=null)
       {
         artistas.add(artista);
            mensaje="Cancion agregada correctamente";
        
       
       }else
       { 
         mensaje="Error al guardar";
       }
       
       return mensaje;
    }
    
   //************************************************************************

    public ArrayList<Album> getAlbumes() 
    {
        return albumes;
    }
   //************************************************************************
    public ArrayList<Artista> getArtistas() 
    {
        return artistas;
    }
   //************************************************************************
    public ArrayList<Cancion> getCanciones() 
    {
        return canciones;
    }
    
    //************************************************************************
    
    
    public String [][] getMatrizTabla()
    {
    String [][] matrizTabla=new String [canciones.size()][Album.TITULO_TABLA.length];
    
        for (int f = 0; f< matrizTabla.length; f++) 
        {
            matrizTabla[f][0]=canciones.get(f).getTitulo();
            matrizTabla[f][1]=artistas.get(f).getNombre();
            
        }
    
       return matrizTabla;
    }
    
    
    
   
}
