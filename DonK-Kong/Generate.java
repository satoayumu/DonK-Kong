import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Generate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Generate extends Actor
{
    /**
     * Act - do whatever the Generate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int count = 0;
    public void act()
    {
        count++;
        if(count >= 100){
            getWorld().addObject( new Move_Scaffold(), getX(), getY());
            count = 0;
        }
    }    
}
