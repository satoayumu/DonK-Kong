import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Player_Foot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFoot extends Actor
{
    Actor obj;
    int upVec = 0;
    boolean jumped = true;
    int last_ground_pos[] = {0 , 0};
    public void act() 
    {
        if(obj == null){
            Random rand = new Random();
            int n = rand.nextInt(2);
            obj = new Player();
            getWorld().addObject( obj, getX(), getY() - 45 );
        }
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
                last_ground_pos = new int[]{x, y};
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
        if(position[1] >= 790){
            position = last_ground_pos;
        }
        setLocation(position[0], position[1]);
        obj.setLocation(position[0], position[1]-45);
    }    
}
