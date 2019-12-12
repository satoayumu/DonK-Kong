import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
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
    int count = 0;
    int prob = 0;
    public void act() 
    {
        Random rand = new Random();
        count++;
        if(count >= 50){
            if(rand.nextInt(7) <= prob){
                getWorld().addObject( new ThrownFoot(), getX(), getY());
                prob = -1;
            }
            else
                prob++;
            count = 0;
        }
    }    
}
