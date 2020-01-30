import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Player here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Player extends Actor
{
    public static int stage_count = 0;
    public static int HP = 3;
    public static int clear_HP1 = 0;
    public Player()
    {
        setImage(WorldTitle.PlayerSkin);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
        HP = 3;        

    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
            if(stage_count == 0){
                stage_count++;
                clear_HP1 = HP;
                World game = new MyWorld2();
                Greenfoot.setWorld( game );
            }else if(stage_count ==1){
                World game = new WorldGameClear();
                Greenfoot.setWorld( game );
            }
        }
        if(HP <= 0){
            World game = new WorldGameOver();
            Greenfoot.setWorld( game );
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
