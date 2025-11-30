package Principal;

import View.MainTela;
import javax.swing.*;
import java.awt.*;

public class Principal {

    public static void main(String[] args) {

        // =========================
        //      ESTILO DO SWING
        // =========================

        UIManager.put("MenuBar.background", new Color(245,245,245));
        UIManager.put("Menu.background", new Color(245,245,245));
        UIManager.put("MenuItem.background", new Color(245,245,245));
        UIManager.put("MenuItem.selectionBackground", new Color(51,105,232)); // azul
        UIManager.put("MenuItem.selectionForeground", Color.WHITE);

        UIManager.put("Button.background", new Color(51,105,232));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));

        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));

        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("TextField.border", BorderFactory.createLineBorder(new Color(200,200,200)));

        UIManager.put("Panel.background", Color.WHITE);


        // =========================
        //  ABRIR A TELA PRINCIPAL
        // =========================

        TelaPrincipal objetotela = new TelaPrincipal();
        objetotela.setVisible(true);
    }
}