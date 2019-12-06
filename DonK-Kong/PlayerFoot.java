import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Foot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFoot extends Actor
{
    /**
     * Act - do whatever the Player_Foot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int upVec = 0;
    boolean jumped = true;
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        Actor scaffold = getOneObjectAtOffset( 0, 0, Scaffold.class );
        
        int position[] = {x , y};
        
        if(scaffold != null){
            int yPos = scaffold.getY();
            upVec = 0;
            position[1] = yPos;
            jumped = false;
        }
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
        
        setLocation(position[0], position[1]);
    }    
}
