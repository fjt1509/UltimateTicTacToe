/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.game;

import BLL.field.IField;
import BLL.field.MyField;

/**
 *
 * @author frederik
 */
public class MyGameState implements IGameState
{
    
    private IField field;

    public MyGameState() 
    {
        this.field = new MyField();
    }
    
    

    @Override
    public IField getField() 
    {
        return field;
    }

    @Override
    public int getMoveNumber() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMoveNumber(int moveNumber) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRoundNumber() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRoundNumber(int roundNumber) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
