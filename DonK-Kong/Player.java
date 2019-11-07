import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Player()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);
        setImage(image);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-3,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+3,y );
        }
    }
}
