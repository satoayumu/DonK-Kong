import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChangeCaptiveSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangeCaptiveSkin extends Actor
{
    /**
     * Act - do whatever the ChangeCaptiveSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ChangeCaptiveSkin()
    {
        setImage(WorldTitle.CaptiveSkin);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            if(WorldTitle.CaptiveSkin.equals("images/yumekawagirl.png"))
                WorldTitle.CaptiveSkin = "images/yumekawaboy.png";
            else if(WorldTitle.CaptiveSkin.equals("images/yumekawaboy.png"))
                WorldTitle.CaptiveSkin = "images/yumekawagirl.png";
            
            setImage(WorldTitle.CaptiveSkin);
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/2, image.getHeight()/2);
            setImage(image);
        }
    }      
}
