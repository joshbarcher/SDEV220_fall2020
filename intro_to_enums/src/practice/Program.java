package practice;

public class Program
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to my program");
        System.out.println("*********************");
        System.out.println();

        //store an enum value in a variable
        Hobby userHobby = Hobby.BOXING;
        userHobby = Hobby.PAINTING;
        userHobby = Hobby.FLYING;
        userHobby = Hobby.GAMING;

        //what type of hobby did we choose?
        if (userHobby == Hobby.BOXING)
        {
            System.out.println("Oh cool, I like boxing");
        }
        else if (userHobby == Hobby.FLYING)
        {
            System.out.println("Oh cool, I'm afraid flying");
        }
        else if (userHobby == Hobby.GAMING)
        {
            System.out.println("Oh cool, I love gaming");
        }

        //you can print enums
        System.out.println("You choose: " + userHobby.toString());
        System.out.println();

        //you can loop over enum values
        Hobby[] allSupportedHobbies = Hobby.values();
        for (int i = 0; i < allSupportedHobbies.length; i++)
        {
            System.out.println(allSupportedHobbies[i]);
        }
    }

    private static void theErrorProneWay()
    {
        String hobby = Console.readString("What is your favorite hobby? ");
        switch (hobby)
        {
            case "boxing":
                System.out.println("Awesome!");
                break;
            case "Yoga":
                System.out.println("Cool!");
                break;
            case "gaming":
                System.out.println("Awesome!");
                break;
            case "Rock climbing":
                System.out.println("Cool!");
                break;
            case "Video Editing":
                System.out.println("Awesome!");
                break;
            case "painting":
                System.out.println("Awesome!");
                break;
            default:
                System.out.println("Not sure, but you do you!");
                break;
        }
    }
}
