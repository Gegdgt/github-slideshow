import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("A")){
            move(-3);
        }
        if (Greenfoot.isKeyDown("D")){
            move(3);
        }
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+2);
        }
        Actor item;
        item = getOneObjectAtOffset(0,0, item.class);
        if (item != null){
            World myWorld = getWorld();
            mundo mundo = (mundo)myWorld;
            Counter counter = mundo.getCounter();
            counter.addScore();
            myWorld.removeObject(item);
        }
    }    
}
