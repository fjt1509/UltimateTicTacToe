/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.move;

/**
 *
 * @author frederik
 */
public class MyMove implements IMove{

    private int x;
    private int y;

    public MyMove(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
}
