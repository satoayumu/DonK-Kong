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
        setImage(WorldTitle.CaptiveSkin);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void act() 
    {
        if( Greenfoot.isKeyDown( "g" ) ){
            setImage("images/yumekawaboy.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/4, image.getHeight()/4);
            setImage(image);
        }
        if( Greenfoot.isKeyDown( "l" ) ){
            setImage("images/yumekawagirl.png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/4, image.getHeight()/4);
            setImage(image);
        }
    }    
}
