import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 

        prepare();
    }
    
    public Counter getCounter(){
        return counter;
    }
    
    private void prepare()
    {
        addObject(counter, 865, 54);
        player player = new player();
        addObject(player,62,34);
        covid covid = new covid();
        addObject(covid,946,134);
        covid covid2 = new covid();
        addObject(covid2,775,337);
        covid covid3 = new covid();
        addObject(covid3,235,463);
        covid covid4 = new covid();
        addObject(covid4,83,637);
        covid covid5 = new covid();
        addObject(covid5,348,205);
        covid covid6 = new covid();
        addObject(covid6,569,597);
        covid covid7 = new covid();
        addObject(covid7,981,365);
        casa casa = new casa();
        addObject(casa,990,645);
        item item = new item();
        addObject(item,814,210);
        item item2 = new item();
        addObject(item2,565,358);
        item item3 = new item();
        addObject(item3,278,619);
        item item4 = new item();
        addObject(item4,112,334);
        item item5 = new item();
        addObject(item5,912,653);
        item5.setLocation(649,565);
        item item6 = new item();
        addObject(item6,636,53);
    }
}
