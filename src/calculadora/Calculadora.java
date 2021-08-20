package calculadora;

import calculadora.visao.Display;
import calculadora.visao.Teclado;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Calculadora extends JFrame {


    //Construtor
    public Calculadora() {

        setSize(232, 322); // definir tamanho da janela
        //setUndecorated(true); // sumir com barra da janela
        setLocationRelativeTo(null); // para aplicação abrir centralizada na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Comando para fechar processo, quando a janela for fechada
        setVisible(true); // deixar a janela visivel

        organizarLayount();
    }

    private void organizarLayount() {
        setLayout(new BorderLayout());

        Display display = new Display();
        add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(233, 60));

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);


    }

    //Método MAIN
    public static void main(String[] args) {
        new Calculadora();
    }

}
