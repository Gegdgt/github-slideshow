import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Signo signo = new Signo();
    private int opcion = 0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
    }
    
    private void prepare()
    {
        addObject(new Start(), 550, 380);
        addObject(new Exit(), 550, 480);
        addObject(signo, 150, 380);
    }
    public void act(){
        if((Greenfoot.isKeyDown("W")) && opcion!=0){opcion++;}
        if(Greenfoot.isKeyDown("S") && opcion!=1){opcion--;}
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        signo.setLocation(150, 380+(opcion*100));
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new mundo());
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
}
