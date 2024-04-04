/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Modelo;

/**
 *
 * @author Usuario
 */
public class Cancion 
{
    private String titulo;
    private int duracion;
    private String genero;
    private int ano;
    
    public static final String[] TITULOS_CANCION={"TITULO","DURACION","GENERO","AÑO LANZAMIENTO"};

    public Cancion(String titulo, int duracion, String genero, int ano) 
    {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.ano =ano;
    }
    
    public Cancion() 
    {
        this.titulo = "";
        this.duracion = 0;
        this.genero = "";
        this.ano = 0;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    { 
        this.titulo = titulo;
    }

    public int getDuracion() 
    {
        return duracion;
    }

    public void setDuracion(int duracion) 
    {
        this.duracion = duracion;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public int getAno() 
    {
        return ano;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Cancion" + "titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", año=" + ano ;
    }
    
    
    
    
}
