import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * Christian Novalski
 * 09/06/2023
 * Snake Game
 */

public class GameFrame extends JFrame{
    /**
     * The default constructor for the GameFrame.
     */
    public GameFrame(){
        this.add(new GamePanel());
        this.setTitle("SnakeGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
