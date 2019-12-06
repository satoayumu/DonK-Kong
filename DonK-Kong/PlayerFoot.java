import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Foot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFoot extends Actor
{
    int upVec = 0;
    boolean jumped = true;
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        Actor scaffold = getOneObjectAtOffset( 0, 0, Scaffold.class );
        Actor ladder = getOneObjectAtOffset( 0, 0, Ladder.class );
        
        int position[] = {x , y};
        
        if(ladder != null){
            if( Greenfoot.isKeyDown( "up" )){
                position[1] -= 3;
            }
            if( Greenfoot.isKeyDown( "down" )){
                position[1] += 3;
            }
        }
        else{
            if(scaffold != null){
                int yPos = scaffold.getY();
                upVec = 0;
                position[1] = yPos - 10;
                jumped = false;
            }
            upVec++;
            if( Greenfoot.isKeyDown( "up" ) && !jumped){
               upVec = -13;
               jumped = true;
            }
            position[1] += upVec;
        }
        if( Greenfoot.isKeyDown( "left" ) ){
           position[0] -= 3;
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           position[0] += 3;
        }
        
        setLocation(position[0], position[1]);
    }    
}
