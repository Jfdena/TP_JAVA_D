package tp8.chenille;


import tp8.geometrie.Direction;

public class Tete extends Anneau{

    private Direction cap;

    public Tete(int x, int y, Direction cap){
        super(x, y);
        this.cap = cap.EST;
    }

    public Direction getCap(){
        return cap;
    }
    @Override
    public String toString(){
        return "t";
    }

    public void deplacer(int xMax, int yMax){

    }


}
