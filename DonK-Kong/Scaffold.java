import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scaffold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scaffold extends Actor
{   
    protected boolean touch = false;
    public Scaffold()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    /**
     * Act - do whatever the Scaffold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Touch(){
        touch = true;
    }
}
