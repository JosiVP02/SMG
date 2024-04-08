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
public class Album 
{
    private String titulo;
    private int ano;
    private ArrayList<Artista> artistas;
    private ArrayList <Cancion> canciones;
    
    public static final String[] TITULO_TABLA={"CANCION", "ARTISTA"};
    
    

    public Album(String titulo, int ano, ArrayList<Artista> artistas, ArrayList<Cancion> canciones) {
        this.titulo = titulo;
        this.ano = ano;
        this.artistas = artistas;
        this.canciones = canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCancion(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "titulo=" + titulo + ", ano=" + ano + ", artistas=" + artistas + ", canciones=" + canciones + '}';
    }

   
    
    
    
    
}