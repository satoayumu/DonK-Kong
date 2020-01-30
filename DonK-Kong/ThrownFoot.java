import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class ThrownFoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThrownFoot extends Actor
{
    Actor obj;
    int upVec = 0;
    int moveVec = 0;
    int angle = 0;
    int isGround = 0;
    int pre_posY = 0;
        
    public void act() 
    {
        if(obj == null){
            Random rand = new Random();
            if(rand.nextInt(5) == 0)
                obj = new Apple(this);
            else
                obj = new Poison_apple(this);
            getWorld().addObject( obj, getX(), getY() - 20 );
        }
        int x = getX();
        int y = getY();
        
        int pre_isGround = isGround;
        
        Actor scaffold = getOneObjectAtOffset( 0, 0, Scaffold.class );
        Actor ladder = getOneObjectAtOffset( 0, 0, Ladder.class );
        
        int position[] = {x , y};
        
        if(scaffold != null){
            int yPos = scaffold.getY();
            upVec = 0;
            position[1] = yPos - 10;
            isGround = 1;
            if(moveVec == 0)
                moveVec = -1;
            if(pre_isGround != isGround && yPos - pre_posY > 100){
                moveVec *= -1;
            }
            pre_posY = yPos;
        }
        else{
            isGround = 0;
        }
           
        if(position[1] >= 790){
            getWorld().removeObject(obj);
            getWorld().removeObject(this);
        }
        
        upVec++;
        angle = (angle + 10 * moveVec >= 360) ? 0 : angle + 10 * moveVec ;
        position[0] += 3 * moveVec;
        position[1] += upVec;
        
        setLocation(position[0], position[1]);
        obj.setLocation(position[0], position[1]-20);
        obj.setRotation(angle);
    }     
}
