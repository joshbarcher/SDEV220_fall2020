package storytelling;

public class StoryBook
{
    public void tellStory()
    {
        //instantiate character classes and use them to tell a story...
        Wolf wolf = new Wolf();
        RedRidingHood rrhood = new RedRidingHood();
        Narrator narrator = new Narrator();

        wolf.say("Come to my hut");
        rrhood.say("No thanks, byeeeee");
        narrator.say("Red riding hood lived happily ever after");
    }

    public static class Wolf
    {
        public void say(String message)
        {
            System.out.println("Wolf rasps: " + message);
        }
    }

    public static class RedRidingHood
    {
        public void say(String message)
        {
            System.out.println("Red riding hood says: " + message);
        }
    }

    public static class Narrator
    {
        public void say(String message)
        {
            System.out.println(message);
        }
    }
}
