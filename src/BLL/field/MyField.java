/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.field;

import BLL.move.IMove;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author frederik
 */
public class MyField implements IField{
    
    
    private String[][] macroboard;
    private String[][] microboard;
    
    public MyField()
    {
        macroboard = new String[3][3];
        microboard = new String[9][9];
        
        clearBoard();
      
    }
    

    @Override
    public void clearBoard() 
    {
        for (int x = 0; x < 3; x++) 
        {
            for (int y = 0; y < 3; y++) 
            {
                macroboard[x][y] = AVAILABLE_FIELD;                
            }         
        }
        
        
        for (int x = 0; x < 9; x++) 
        {
            for (int y = 0; y < 9; y++) 
            {
                microboard[x][y] = EMPTY_FIELD;                
            }         
        }          
    }

    @Override
    public List<IMove> getAvailableMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPlayerId(int column, int row) 
    {
        return microboard[column][row];
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull() 
    {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       
    }

    @Override
    public Boolean isInActiveMicroboard(int x, int y) 
    {
        int macroX = x/3;
        int macroY = y/3; 
        
        return macroboard[macroX][macroY].equals(AVAILABLE_FIELD);     
    }
    


    @Override
    public String[][] getBoard() 
    {
        return microboard;
    }

    @Override
    public String[][] getMacroboard()
    {     
        return macroboard;
    }

    @Override
    public void setBoard(String[][] board) 
    {
        this.microboard = board;
    }

    @Override
    public void setMacroboard(String[][] macroboard) 
    {
        this.macroboard = macroboard;
    }
    
}
