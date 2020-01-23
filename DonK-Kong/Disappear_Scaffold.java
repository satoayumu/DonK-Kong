import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disappear_Scaffold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disappear_Scaffold extends Scaffold
{
    /**
     * Act - do whatever the Disappear_Scaffold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    private int count2 = 0;
    private int count3 = 0;
    private float interval = 100;
    private float interval2 = 5;
    
    public void act() 
    {
        if(touch){
            count++;
            count2++;
            count3++;
            
            if(count2 >= interval){
                getImage().setTransparency(0);
                interval = (interval*0.8 >= 1) ? interval*(float)0.8 : 1;
                count2 = 0;
                count3 = 0;
            }
            if(count3 >= interval2){
                interval2 *= 0.8;
                getImage().setTransparency(255);
            }
            if(count >= 500){
                getWorld().removeObject(this);
            }
        }
    }
}
