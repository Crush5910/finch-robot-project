package com.heycrush;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

    public FinalFinch(String device){
        super(device);
    }

    public void moveForward(){
        int distance = getDistance();
        setMove("F", 10, 60);
    }

    public void moveBackward(){
        setMove("B", 10, 60);
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
        setTurn("R", 120, 50);
        setMove("F", 10, 50);
        setTurn("R", 120, 50);
        setMove("F", 10, 50);
    }

    public void moveFourTimes(String direction){
        for(int i = 0; i < 3; i++){
            setMove(direction, 2, 100);
        }
    }

    public void dance(){
       setTurn("R", 90, 100);
       moveFourTimes("F");
       setTurn("L", 180, 100);
       moveFourTimes("F");
       setTurn("R", 90, 100);
       for(int i = 0; i < 3; i++){
        setMove("F", 2, 100);
        setMove("B", 2, 100);
       }
       setTurn("L", 450, 100);

    }
}