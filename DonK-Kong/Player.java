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
        
        Actor throuwn = getOneObjectAtOffset( 0, 0, Thrown_object.class );
        Actor scaffold = getOneObjectAtOffset( 0, 0, Scaffold.class );
        
        int position[] = {x , y};
        
        if(throuwn != null){
            String name = throuwn.getClass().getName();
            getWorld().showText( name, 100, 50 );
            if(name == "Apple"){
            }
            if(name == "Poison_Apple"){
            }
        }
        if(scaffold != null){
            String name = scaffold.getClass().getName();
            int yPos = scaffold.getY();
            getWorld().showText( name, 100, 50 );
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
        if( y > 600){
           upVec = 0;
           position[1] = 600;
           jumped = false;
        }
        
        setLocation(position[0], position[1]);
    }
}
