import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGameOver extends World
{

    /**
     * Constructor for objects of class WorldGameOver.
     * 
     */
    public WorldGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);  
    }
    public void act(){
        GreenfootImage gg = new GreenfootImage("Game Over", 200, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(gg, (getWidth()-gg.getWidth())/2, 200);
        
        GreenfootImage msg = new GreenfootImage("spaceでスタート画面へ", 50, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(msg, (getWidth()-msg.getWidth())/2, 450);

        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new WorldTitle();
            Greenfoot.setWorld( game );
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
            }    
        }
    }
}
