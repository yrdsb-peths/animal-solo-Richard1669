import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,468,91);
        elephant.setLocation(492,101);
        elephant.setLocation(431,113);
        elephant.setLocation(459,112);
        elephant.setLocation(488,98);
        elephant.setLocation(515,195);
        elephant.setLocation(495,190);
        elephant.setLocation(291,302);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,289,76);
        label.setLocation(300,83);
        label.setLocation(302,95);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,316,139);
        label2.setLocation(299,136);
        label.setLocation(284,48);
        label.setLocation(312,55);
        label.setLocation(292,50);
        label2.setLocation(326,103);
        label2.setLocation(262,104);
        label2.setLocation(294,97);
        label2.setLocation(421,107);
        label2.setLocation(303,115);
        label.setLocation(300,65);
    }
}
