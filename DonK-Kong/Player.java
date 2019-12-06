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
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Actor foot;
    int upVec = 0;
    boolean jumped = true;
    public void act() 
    {
        if(foot == null){
            foot = getObjectsInRange(1000,PlayerFoot.class).get(0);
        }
        
        int posX = foot.getX();
        int posY = foot.getY();
        
        Actor throuwn = getOneObjectAtOffset( 0, 0, Thrown_object.class );
        
        if(throuwn != null){
            String name = throuwn.getClass().getName();
            getWorld().showText( name, 100, 50 );
            if(name == "Apple"){
            }
            if(name == "Poison_Apple"){
            }
        }
        
        setLocation(posX, posY - 45);
    }
}
