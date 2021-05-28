import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class covid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class covid extends Actor
{
    /**
     * Act - do whatever the covid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if(Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(90)-45);
        } 
        if (getX() <= 5 || getX() >= getWorld().getWidth() -5){
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() -5){
            turn(180);
        }
        
        Actor player;
        player = getOneObjectAtOffset(0, 0, player.class);
        if (player != null){
            World mundo;
            mundo = getWorld();
            Greenfoot.setWorld(new BadEnding());
        }
    }    
}
