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
public class RegistroArtista 
{
    

        ArrayList<Artista> listaArtistas;

        String mensaje;

        public RegistroArtista() 
        {
            this.listaArtistas = new ArrayList<>();
            this.mensaje = "";
        }
        
        
    public int[] getId ()
    {
      int[] ids =new int[this.listaArtistas.size()];
        for (int i = 0; i < listaArtistas.size(); i++) 
        {
            ids[i]=this.listaArtistas.get(i).getId();
        }
      
      return ids;
    }
        
        


}