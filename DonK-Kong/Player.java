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
        setImage(WorldTitle.PlayerSkin);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int HP = 3;
    public void act() 
    {
        Thrown_object thrown = (Thrown_object)getOneObjectAtOffset( 0, 0, Thrown_object.class );
        Actor gorilla = getOneObjectAtOffset( 0, 0, gorilla.class );
        
        if(thrown != null){
            HP -= thrown.GetDamage();
            thrown.Remove();
        }
        if(gorilla != null){
            //ゲームクリアの処理
        }
        if(HP <= 0){
            //ゲームオーバーの処理
        }
        if( Greenfoot.isKeyDown( "m" ) ){
            setImage("images/sybermario(male).png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/4, image.getHeight()/4);
            setImage(image);
        }
        if( Greenfoot.isKeyDown( "f" ) ){
            setImage("images/sybermario(female).png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth()/4, image.getHeight()/4);
            setImage(image);
        }
        
        getWorld().showText( "HP:" + HP, 100, 50 );
    }
}
