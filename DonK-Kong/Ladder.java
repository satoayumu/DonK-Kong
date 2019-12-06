import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladder extends Actor
{
    public Ladder(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, (int)(image.getHeight()/1.8));
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
