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
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
  private boolean emprestado;
  private String localizacao;

  public LivroDeBiblioteca(String titulo, String autor, String editora, short ano, String local){
    super(titulo, autor, editora, ano);
    this.emprestado = false;
    this.localizacao = local;
  }

  public void Empresta(){
    this.emprestado = true;
  }

  public void Devolve(){
    this.emprestado = false;
  }

  public boolean getEmprestado(){
    return this.emprestado;
  }
  
  public String getLocalizacao(){
    return this.localizacao;
  }
  

  public String getDados(){
     String ret;

    ret = "Titulo = " + getTitulo() 
      + "\nAutor = " + getAutor() 
      + "\nEditora = " + getEditora() 
      + "\nAno = " + getAnoEdicao() 
      + "\nLocalização = " + getLocalizacao();
    
    return ret;
  }
  
}
