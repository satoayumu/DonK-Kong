import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int time = 4000;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        time = 4000;
        for(int i=0;i<15;i++){
            addObject( new Scaffold(), 100+ (i*73), 750 );
        }
        for(int i=0;i<12;i++){
            addObject( new Scaffold(), 100+73*2+ (i*73), 550 );
        }
        for(int i=0;i<5;i++){
            addObject( new Scaffold(), 100+ (i*73), 350 );
        }
        for(int i=0;i<9;i++){
            addObject( new Scaffold(), 100 + 73*6+ (i*73), 350 );
        }
        for(int i=0;i<13;i++){
            addObject( new Scaffold(), 100+ (i*73), 150 );
        }
        addObject( new PlayerFoot(), 150, 740 );
        addObject( new Ladder(), 950, 640 );
        addObject( new Ladder(), 250, 440 );
        addObject( new Ladder(), 900, 240 );
        addObject( new Captive(), 150, 90 );
        addObject( new gorilla(), 250, 70);
        showText( "time: " + String.valueOf(time), 1100, 50 );
        
    }
    public void act() 
    {
       if(time>0) time--;
       else if(time == 0){
            World game = new WorldGameOver();
            Greenfoot.setWorld( game );
        
        }
       showText( "time: " + String.valueOf(time), 1100, 50 );// Add your action code here.
    } 
}
