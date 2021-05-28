import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class casa extends Actor
{
    /**
     * Act - do whatever the casa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor player;
        player = getOneObjectAtOffset(0,0, player.class);
        if (player != null){
            World myWorld = getWorld();
            mundo mundo = (mundo)myWorld;
            Counter counter = mundo.getCounter();
            counter.resetScore();
            Greenfoot.setWorld(new mundo2());
        }
    }    
}
