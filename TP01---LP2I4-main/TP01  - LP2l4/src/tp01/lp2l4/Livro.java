/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.lp2l4;

/**
 *
 * @author Guilherme
 */
public abstract class Livro {
  protected String titulo;
  protected String autor;
  protected String editora;
  protected short anoedicao;

  public Livro (String Titulo, String Autor, String Editora, short Anoedicao){
    this.titulo = Titulo;
    this.autor = Autor;
    this.editora = Editora;
    this.anoedicao = Anoedicao;
  }

  public void setTitulo(String x){
    this.titulo = x;
  }

  public void setAutor(String x){
    this.autor = x;
  }

  public void setEditora(String x){
    this.editora = x;
  }

  public void setAnoEdicao(short x){
    this.anoedicao = x;
  }
  
  public String getTitulo(){
    return this.titulo;
  }

  public String getAutor(){
    return this.autor;
  }

  public String getEditora(){
    return this.editora;
  }

  public short getAnoEdicao(){
    return this.anoedicao;
  }

  public String getDados(){
    String ret;

    ret = "Titulo = " + getTitulo() 
      + "\nAutor = " + getAutor() 
      + "\nEditora = " + getEditora() 
      + "\nAno = " + getAnoEdicao();
    
    return ret;
  }
  
}