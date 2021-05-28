import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo2 extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class mundo2.
     * 
     */
    public mundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
    }
    
    public Counter getCounter(){
        return counter;
    }
    
    private void prepare()
    {
        addObject(counter, 865, 54);
    }
}
