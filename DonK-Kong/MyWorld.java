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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        for(int i=0;i<15;i++){
            addObject( new Scaffold(), 100+ (i*73), 750 );
        }
        for(int i=0;i<12;i++){
            addObject( new Scaffold(), 100+73*2+ (i*73), 550 );
        }
        for(int i=0;i<4;i++){
            addObject( new Scaffold(), 100+ (i*73), 350 );
        }
        for(int i=0;i<9;i++){
            addObject( new Scaffold(), 100 + 73*6+ (i*73), 350 );
        }
         for(int i=0;i<13;i++){
            addObject( new Scaffold(), 100+ (i*73), 150 );
        }
        addObject( new Player(), 150, 690 );
        addObject( new PlayerFoot(), 150, 740 );
    }
}
