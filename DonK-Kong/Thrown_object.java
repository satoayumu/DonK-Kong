import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thrown_object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Thrown_object extends Actor
{
    Object[] objs;
    ThrownFoot parent;
    int damage = 0;
    /**
     * Act - do whatever the Thrown_object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Thrown_object(ThrownFoot foot)
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/7, image.getHeight()/7);
        setImage(image);
        parent = foot;
        
    }
    public void Remove(){
            getWorld().removeObject(parent);
            getWorld().removeObject(this);
    }
    public int GetDamage(){
        return damage;
    }
}
