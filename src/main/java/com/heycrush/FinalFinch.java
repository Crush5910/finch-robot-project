package com.heycrush;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

    public FinalFinch(String device){
        super(device);
    }

    public void moveForward(){
        int distance = getDistance();
        setMove("F", distance-5, 60);
    }

    public void moveBackward(int distance){
        setMove("B", distance, 60);
    }

    public void drawSquare(){
        for(int i = 0; i < 4; i++){
            setMove("F", 10, 50);
            setTurn("L", 90, 50);
        }
    }

    public void turnAround(){
        setTurn("L", 180, 100);
    }

    public void drawTriangle(){
        setMove("F", 10, 50);
        setTurn("R", 60, 50);
        setMove("F", 10, 50);
        setTurn("R", 60, 50);
        setMove("F", 10, 50);
    }
}