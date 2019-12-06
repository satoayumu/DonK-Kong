import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thrown_object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Thrown_object extends Actor
{
    /**
     * Act - do whatever the Thrown_object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public Thrown_object()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/7, image.getHeight()/7);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
