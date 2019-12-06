import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gorilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gorilla extends Actor
{
    /**
     * Act - do whatever the gorilla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gorilla()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
