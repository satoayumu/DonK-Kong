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
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int upVec = 0;
    boolean jumped = true;
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        
        int position[] = {x , y};
        
        upVec++;
        if( Greenfoot.isKeyDown( "up" ) && !jumped){
           upVec = -20;
           jumped = true;
        }
        position[1] += upVec;
        if( Greenfoot.isKeyDown( "left" ) ){
           position[0] -= 3;
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           position[0] += 3;
        }
        if( y > 600){
           upVec = 0;
           position[1] = 600;
           jumped = false;
        }
        
        setLocation(position[0], position[1]);
    }
}
