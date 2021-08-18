package calculadora;

import javax.swing.*;

public class Calculadora extends JFrame {


    //Construtor
    public Calculadora() {

        setSize(232, 322); // definir tamanho da janela
        setLocationRelativeTo(null); // para aplicação abrir centralizada na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Comando para fechar processo, quando a janela for fechada
        setVisible(true); // deixar a janela visivel

    }


    //Método MAIN
    public static void main(String[] args) {
        new Calculadora();
    }

}
