package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class TicTacToe extends JFrame implements ActionListener{

    Random random = new Random(System.currentTimeMillis());

    JFrame frame = new JFrame("Tic-Tac-Toe");
    int weidth = 600;
    int heigth = 650;

    JLabel headLabel = new JLabel();
    JPanel headPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel controPanel = new JPanel();
    JButton exiButton = new JButton("Exit");
    JButton newGame = new JButton("New Game");
    JButton[] buttons= new JButton[9];
    boolean playerXl;
    String playerX = "X";
    String playerO = "O";
  
    public TicTacToe()
    {
        //===========Frame==============

        frame.setVisible(true);
        frame.setSize(heigth, weidth);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        //=============Panel====================

        headPanel = new JPanel();
        headPanel.setLayout(new BorderLayout());
        frame.add(headPanel, BorderLayout.NORTH);

       



       // ============== Label ================

        headLabel = new JLabel();
        headLabel.setText("TIC-TAC-TOE");
        headLabel.setForeground(Color.cyan);
        headLabel.setBackground(Color.DARK_GRAY);
        headLabel.setHorizontalAlignment(JLabel.CENTER);
        headLabel.setFont(new Font("Arial", Font.BOLD, 50));
        headLabel.setOpaque(true);
        headPanel.add(headLabel);


        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.GRAY);
        frame.add(boardPanel);

        for(int i = 0; i< buttons.length; i++){
            buttons[i] = new JButton();
            boardPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 120));
            buttons[i].setBackground(Color.GRAY);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this); 
        }
        //======================== control panel=====================
        controPanel.setBackground(Color.CYAN);
        controPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));

        newGame.setFocusable(false);
        newGame.setFont(new Font("Arial", Font.BOLD, 30));
        newGame.addActionListener(this);
        controPanel.add(newGame);

        exiButton.setFocusable(false);
        exiButton.setFont(new Font("Arial", Font.BOLD, 30));
        exiButton.addActionListener(this);
        controPanel.add(exiButton);

        frame.add(controPanel, BorderLayout.SOUTH);
        controPanel.setVisible(false);


        firstTurn();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==newGame)
        {
            resetBoard();
            return;
        }
        if(e.getSource()== exiButton)
        {
            System.exit(0);
        }

        for(int i = 0; i<buttons.length ; i++)
        {
            if(e.getSource()== buttons[i])
            {
                if(playerXl)
                {
                    if(buttons[i].getText()== "")
                    {
                        buttons[i].setForeground(Color.cyan);
                        buttons[i].setText(playerX);
                        playerXl = false;
                        headLabel.setText("O turn");
                        check();
                        if(!check() && boardFull())
                        {
                             drawCheck();
                        }
                    }
                }
                else
                {
                    if(buttons[i].getText()== "")
                    {
                        buttons[i].setForeground(Color.DARK_GRAY);
                        buttons[i].setText(playerO);
                        playerXl = true;
                        headLabel.setText("X turn");
                        check();
                        if(!check() && boardFull())
                        {
                            drawCheck();
                        }
                    }
                }
            }




        }

    }
    public void firstTurn()
    {
        if(random.nextInt(2)== 0)
        {
            playerXl = true;
            headLabel.setText("Player X");
        }
        else
        {
            playerXl = false;
            headLabel.setText("Player O");
        }

    }
    public boolean  check()
    {
        boolean won = false;
        if(
            (buttons[0].getText() == playerX) &&
            (buttons[1].getText() == playerX) &&
            (buttons[2].getText() == playerX)
        ){
            xWin(0,1,2);
            won = true;
        }

        if(
            (buttons[3].getText() == playerX) &&
            (buttons[4].getText() == playerX) &&
            (buttons[5].getText() == playerX)
        ){
            xWin(3,4,5);
             won = true;
        }

        if(
            (buttons[6].getText() == playerX) &&
            (buttons[7].getText() == playerX) &&
            (buttons[8].getText() == playerX)
        ){
            xWin(6,7,8);
             won = true;
        }

        if(
            (buttons[0].getText() == playerX) &&
            (buttons[4].getText() == playerX) &&
            (buttons[8].getText() == playerX)
        ){
            xWin(0,4,8);
             won = true;
        }

        if(
            (buttons[2].getText() == playerX) &&
            (buttons[4].getText() == playerX) &&
            (buttons[6].getText() == playerX)
        ){
            xWin(2,4,6);
             won = true;
        }

        if(
            (buttons[0].getText() == playerX) &&
            (buttons[3].getText() == playerX) &&
            (buttons[6].getText() == playerX)
        ){
            xWin(0,3,6);
             won = true;
        }

        if(
            (buttons[1].getText() == playerX) &&
            (buttons[4].getText() == playerX) &&
            (buttons[7].getText() == playerX)
        ){
            xWin(1,4,7);
             won = true;
        }

        if(
            (buttons[2].getText() == playerX) &&
            (buttons[5].getText() == playerX) &&
            (buttons[8].getText() == playerX)
        ){
            xWin(2,5,8);
             won = true;
        }

        //=================== Check for O=================

        if(
            (buttons[0].getText() == playerO) &&
            (buttons[1].getText() == playerO) &&
            (buttons[2].getText() == playerO)
        ){
            oWin(0,1,2);
             won = true;
        }

        if(
            (buttons[3].getText() == playerO) &&
            (buttons[4].getText() == playerO) &&
            (buttons[5].getText() == playerO)
        ){
            oWin(3,4,5);
             won = true;
        }

        if(
            (buttons[6].getText() == playerO) &&
            (buttons[7].getText() == playerO) &&
            (buttons[8].getText() == playerO)
        ){
            oWin(6,7,8);
             won = true;
        }

        if(
            (buttons[0].getText() == playerO) &&
            (buttons[4].getText() == playerO) &&
            (buttons[8].getText() == playerO)
        ){
            oWin(0,4,8);
             won = true;
        }

        if(
            (buttons[2].getText() == playerO) &&
            (buttons[4].getText() == playerO) &&
            (buttons[6].getText() == playerO)
        ){
            oWin(2,4,6);
             won = true;
        }

        if(
            (buttons[0].getText() == playerO) &&
            (buttons[3].getText() == playerO) &&
            (buttons[6].getText() == playerO)
        ){
            oWin(0,3,6);
             won = true;
        }

        if(
            (buttons[1].getText() == playerO) &&
            (buttons[4].getText() == playerO) &&
            (buttons[7].getText() == playerO)
        ){
            oWin(1,4,7);
             won = true;
        }

        if(
            (buttons[2].getText() == playerO) &&
            (buttons[5].getText() == playerO) &&
            (buttons[8].getText() == playerO)
        ){
            oWin(2,5,8);
             won = true;
        }
        return won;
    }

    public void xWin(int a, int b, int c)
    {
        buttons[a].setBackground(Color.yellow);
        buttons[b].setBackground(Color.yellow);
        buttons[c].setBackground(Color.yellow);

        for(int i = 0; i< buttons.length; i++)
        {
            buttons[i].setEnabled(false);
        }
        headLabel.setText("Player X wins");
        controPanel.setVisible(true);
    }
    public void oWin(int a, int b, int c)
    {
         buttons[a].setBackground(Color.RED);
        buttons[b].setBackground(Color.RED);
        buttons[c].setBackground(Color.RED);

        for(int i = 0; i< buttons.length; i++)
        {
            buttons[i].setEnabled(false);
        }
        headLabel.setText("Player O wins");
        controPanel.setVisible(true);
    }

     public void drawCheck()
    {
        for(int i=0; i<buttons.length;i++)
        {
            headLabel.setText("Draw!!!!");
           buttons[i].setBackground(Color.DARK_GRAY);
           buttons[i].setEnabled(false);
        }
        controPanel.setVisible(true);
    }


    public boolean boardFull()
    {
        for(int i=0; i<buttons.length;i++)
        {
            if(buttons[i].getText()== "")
            {
                return false;
            }
        }
        return true;
    }

    public void resetBoard()
    {
        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
            buttons[i].setBackground(Color.GRAY);
        }
        controPanel.setVisible(false);
        firstTurn();
    }

  
}
