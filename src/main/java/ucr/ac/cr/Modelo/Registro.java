package ucr.ac.cr.Modelo;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Registro 
{
    ArrayList<Cancion> listaCanciones;
    
    String mensaje;

    public Registro() 
    {
        this.listaCanciones = new ArrayList<>();
        this.mensaje = "";
    }
   
   //*******************************************************************

 

    public String agregarCancion(Cancion cancion)
    {
       if(cancion!=null)
       {
         if(buscarCancion(cancion.getTitulo())==null)
         {
            this.listaCanciones.add(cancion);
            mensaje="Cancion agregada correctamente";
         }else
         {
          mensaje="Ya se encuentra una cancion agregada con el titulo escrito";
         }
       }else
       { 
         mensaje="Error al guardar";
       }
       
       return mensaje;
    }
   //*******************************************************************
    
    public Cancion buscarCancion(String titulo)
    {
      for(Cancion miCancion:listaCanciones)
      {
        if (miCancion.getTitulo().equalsIgnoreCase(titulo))
        {
          return miCancion;
        }
      }
      return null;
    }
    //*******************************************************************
    public String borrarCancion(Cancion cancion)
    {
        for (int i = 0; i < listaCanciones.size(); i++) 
        {
            if(listaCanciones.get(i).getTitulo().equalsIgnoreCase(cancion.getTitulo()))
            {
              this.listaCanciones.remove(i);
              return"Cancion elimibada";
            }
        }
      return "Error al eliminar la cancion";
    }
    
    
    //*******************************************************************
    
    public String editarCancion(Cancion cancion)
    {
        if(buscarCancion(cancion.getTitulo())!=null)
        {
          borrarCancion(cancion);
          agregarCancion(cancion);
          
          mensaje="Modificado correctamente";
        }else 
        {
        
          mensaje="La cancion a modificar no se encuentra";        
        }
        
        return mensaje;
    }
    
    //*******************************************************************
    
    public String[] getComboTitulo()
    {
      String[] titulos =new String[this.listaCanciones.size()];
        for (int i = 0; i < listaCanciones.size(); i++) 
        {
            titulos[i]=this.listaCanciones.get(i).getTitulo();
        }
      
      return titulos;
    }
    
}
