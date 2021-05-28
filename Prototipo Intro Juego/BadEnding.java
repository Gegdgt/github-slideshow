import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadEnding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadEnding extends World
{
    Signo signo = new Signo();
    private int opcion = 0;
    /**
     * Constructor for objects of class BadEnding.
     * 
     */
    public BadEnding()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
    }
    
    private void prepare()
    {
        
    }
    public void act(){
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
