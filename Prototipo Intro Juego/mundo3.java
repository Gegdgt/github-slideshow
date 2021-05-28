import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo3 extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class mundo3.
     * 
     */
    public mundo3()
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
