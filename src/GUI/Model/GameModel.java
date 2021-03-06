/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.game.GameManager;
import BLL.game.MyGameState;
import BLL.move.IMove;

/**
 *
 * @author frederik
 */
public class GameModel {
    
    private GameManager gameManager;
    
    public GameModel()
    {
        gameManager = new GameManager(new MyGameState());
    }

    public boolean makeMove(IMove move) 
    {
        return gameManager.UpdateGame(move);
    }

    public int retrieveCurrentPlayer() 
    {
        return gameManager.retrieveCurrentPlayer();
    }

 

    public boolean getActiveField(int x, int y) 
    {
        return gameManager.getActiveField(x, y);
    }


    
}
