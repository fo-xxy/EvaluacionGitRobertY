package main;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){

        String nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");

        JOptionPane.showMessageDialog(null, nombre);
    }
}
