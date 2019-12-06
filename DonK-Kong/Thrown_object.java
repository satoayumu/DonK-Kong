import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thrown_object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Thrown_object extends Actor
{
    /**
     * Act - do whatever the Thrown_object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public Thrown_object()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/7, image.getHeight()/7);
        setImage(image);
    }
    
    int upVec = 0;
    int moveVec = 1;
    int angle = 0;
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        Actor scaffold = getOneObjectAtOffset( 0, 0, Scaffold.class );
        Actor ladder = getOneObjectAtOffset( 0, 0, Ladder.class );
        
        int position[] = {x , y};
        
        if(x <= 50 || x >= 1150)
            moveVec *= -1;
        if(scaffold != null){
            int yPos = scaffold.getY();
            upVec = 0;
            position[1] = yPos - 10;
        }
        
        upVec++;
        angle = (angle + 10 * moveVec >= 360) ? 0 : angle + 10 * moveVec ;
        position[0] += 3 * moveVec;
        position[1] += upVec;
        setRotation(angle);
        
        setLocation(position[0], position[1]);
    }    
}
