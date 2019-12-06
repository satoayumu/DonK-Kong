import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Captive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Captive extends Actor
{
    /**
     * Act - do whatever the Captive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Captive()
    {
        GreenfootImage image = getImage();
        image.scale((int)(image.getWidth()/4), (int)(image.getHeight()/4));
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
