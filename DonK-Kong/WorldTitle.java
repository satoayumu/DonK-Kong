import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class WorldTitle extends World
{

    static public String PlayerSkin = "images/sybermario(male).png";
    static public String CaptiveSkin = "images/yumekawagirl.png";
    /**
     * Constructor for objects of class WorldTitle.
     * 
     */
    public WorldTitle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        addObject( new ChangePlayerSkin(), 400, 600 );
        addObject( new ChangeCaptiveSkin(), 800, 600 );
    }
    public void act(){
        GreenfootImage title = new GreenfootImage("DonK-Kong", 200, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(title, (getWidth()-title.getWidth())/2, 200);

        GreenfootImage description = new GreenfootImage("spaceでゲームスタート!", 50, Color.WHITE, new Color(0, 0, 0, 0));
        getBackground().drawImage(description, (getWidth()-description.getWidth())/2, 450);

        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new MyWorld();
            Greenfoot.setWorld( game );
        }
    }
}

