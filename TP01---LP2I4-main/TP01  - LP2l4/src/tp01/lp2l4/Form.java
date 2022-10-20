/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.lp2l4;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class Form extends Frame implements ActionListener {
    private final Label lTitulo = new Label("Titulo: ");
    private final Label lAutor = new Label("Autor: ");
    private final Label lEditora = new Label("Editora: ");
    private final Label lAnoEdicao = new Label("Ano Edicao: ");
    private final Label lLocalizacao = new Label("Localizacao: ");
    private final Label lStatus = new Label("Status: ");
    private final TextField iTitulo = new TextField();
    private final TextField iAutor = new TextField();
    private final TextField iEditora = new TextField();
    private final TextField iAnoEdicao = new TextField();
    private final TextField iLocalizacao = new TextField();
    private final TextField iStatus = new TextField();
    private final Button bOk = new Button("Ok");
    private final Button bEmprestar = new Button("Emprestar");
    private final Button bDevolver = new Button("Devolver");
    private final Button bMostrar = new Button("Mostrar");
    private final Button bSair = new Button("Sair");
    private final ArrayList<Livro> lista;

Form(String titulo, int largura, int altura) {
        super(titulo);
        this.lista = new ArrayList<>();
        setSize(largura,altura);
        setLocation(550, 300);
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);
        addWindowListener(new FechaJanela());
        
        Panel p1 = new Panel();
        GridLayout layoutP1 = new GridLayout(6,1);
        p1.setLayout(layoutP1);
        p1.add(lTitulo);
        p1.add(iTitulo);
        p1.add(lAutor);
        p1.add(iAutor);
        p1.add(lEditora);
        p1.add(iEditora);
        p1.add(lAnoEdicao);
        p1.add(iAnoEdicao);
        p1.add(lLocalizacao);
        p1.add(iLocalizacao);
        p1.add(lStatus);
        p1.add(iStatus);
        
        add(p1, BorderLayout.CENTER);
        
        Panel p2 = new Panel();
        GridLayout layoutP2 = new GridLayout();
        p2.setLayout(layoutP2);
        p2.add(bOk);
        p2.add(bEmprestar);
        p2.add(bDevolver);
        p2.add(bMostrar);
        p2.add(bSair);
        
        add(p2, BorderLayout.SOUTH);
        
        

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== bSair)
        {
            System.exit(0);
        } else if (e.getSource()== bOk){
            
        } else if (e.getSource()== bEmprestar){
        
        } else if (e.getSource()== bDevolver){
        
        } else if (e.getSource()== bMostrar){
            
        }
    
     
    }
}
