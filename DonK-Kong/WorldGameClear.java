import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGameClear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGameClear extends World
{

    /**
     * Constructor for objects of class WorldGameClear.
     * 
     */
    public WorldGameClear()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);  
    }
    public void act(){
        int clear_time = MyWorld.time;
        int life = Player.HP;
        int anser = clear_time + life * 1000;
        Player.stage_count = 0;
        GreenfootImage gg = new GreenfootImage("Game Clear", 200, Color.BLACK, new Color(0, 0, 0, 0));
        getBackground().drawImage(gg, (getWidth()-gg.getWidth())/2, 200);
        
        GreenfootImage score = new GreenfootImage("score : " + String.valueOf(anser), 50, Color.BLACK, new Color(0, 0, 0, 0));
        getBackground().drawImage(score, (getWidth()-score.getWidth())/2, 450);
        
        GreenfootImage msg = new GreenfootImage("spaceでスタート画面へ", 50, Color.BLACK, new Color(0, 0, 0, 0));
        getBackground().drawImage(msg, (getWidth()-msg.getWidth())/2, 550);

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
