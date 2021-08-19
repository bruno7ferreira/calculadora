package calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {


    //Construtor
    public Calculadora() {

        setSize(232, 322); // definir tamanho da janela
        setLocationRelativeTo(null); // para aplicação abrir centralizada na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Comando para fechar processo, quando a janela for fechada
        setVisible(true); // deixar a janela visivel

        organizarLayount();
    }

    private void organizarLayount() {
        setLayout(new BorderLayout());

        Display display = new Display();
        add(display);

        Teclado teclado = new Teclado();
        add(teclado);


    }

    //Método MAIN
    public static void main(String[] args) {
        new Calculadora();
    }

}
