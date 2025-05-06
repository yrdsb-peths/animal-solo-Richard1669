import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Snake, main
 * 
 * @author Chen
 * @version April 2025
 */
public class Snake extends Actor
{
    GreenfootSound snakeSound = new GreenfootSound("snakehissing.mp3");
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        
        // Remove apple if snake eats it
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            snakeSound.play();
        }
    }
}
