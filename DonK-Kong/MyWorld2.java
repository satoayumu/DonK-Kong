
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public static int time = 4000;
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        time = 4000;
        for(int i=0;i<15;i++){
            addObject( new Scaffold(), 100+ (i*73), 750 );
        }
        for(int i=0;i<5;i++){
            addObject( new Scaffold(), 100+ (i*73), 150 );
        }
        
        addObject( new Scaffold(), 400+ (1*73), 200 );
        addObject( new Scaffold(), 400+ (2*73), 200 );
        addObject( new Scaffold(), 555+ (1*73), 250 );
        addObject( new Scaffold(), 555+ (2*73), 250 );
        for(int i=0;i<5;i++){
            addObject( new Scaffold(), 800+ (i*73), 300 );
        }
        for(int i=0;i<5;i++){
            addObject( new Scaffold(), 800+ (i*73), 450 );
        }
        for(int i=0;i<8;i++){
            addObject( new Ladder(), 400+(i*50), 500 );
        }
        for(int i=0;i<3;i++){
            addObject( new Scaffold(), 200+ (i*73), 550 );
        }
        addObject( new Ladder(), 150, 650 );
        addObject( new PlayerFoot(), 150, 740 );
        addObject( new Ladder(), 1100, 400 );
        addObject( new Captive(), 150, 90 );
        addObject( new gorilla(), 250, 70);
        
        addObject(new Oki_Apple(), 450, 350);
        addObject(new Oki_Apple(), 500, 350);
        addObject(new Oki_Apple(), 550, 350);
        addObject(new Oki_Apple(), 600, 350);
        addObject(new Oki_Apple(), 450, 500);
        addObject(new Oki_Apple(), 450, 400);
        addObject(new Oki_Apple(), 500, 400);
        addObject(new Oki_Apple(), 550, 400);
        addObject(new Oki_Apple(), 600, 400);
        addObject(new Oki_Apple(), 550, 450);
        addObject(new Oki_Apple(), 600, 450);
        addObject(new Oki_Apple(), 550, 550);
        addObject(new Oki_Apple(), 600, 550);
        addObject(new Oki_Apple(), 650, 550);
        addObject(new Oki_Apple(), 700, 550);
        addObject(new Oki_Apple(), 700, 450);
        addObject(new Oki_Apple(), 700, 500);
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
