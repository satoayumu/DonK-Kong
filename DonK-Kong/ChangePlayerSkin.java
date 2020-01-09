import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChangePlayerSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangePlayerSkin extends Actor
{
    /**
     * Act - do whatever the ChangePlayerSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ChangePlayerSkin()
    {
        setImage(WorldTitle.PlayerSkin);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            if(WorldTitle.PlayerSkin.equals("images/sybermario(male).png"))
                WorldTitle.PlayerSkin = "images/sybermario(female).png";
            else if(WorldTitle.PlayerSkin.equals("images/sybermario(female).png"))
                WorldTitle.PlayerSkin = "images/sybermario(male).png";
                
            setImage(WorldTitle.PlayerSkin);
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/2, image.getHeight()/2);
            setImage(image);
        }
    }    
}
