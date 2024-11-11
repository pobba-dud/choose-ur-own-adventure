import java.util.Scanner; // NORTH path is superior btw

class Main {
  public static void main(String[] args) {
    System.out.println("All commands are in UPPERCASE");
    System.out.println("You are lost on a rainforest island");
    System.out.println("Try to make it out before it comes");
    System.out.println("You might want to start by looking around");
    Scanner scan = new Scanner(System.in);
    System.out.println("look around? (Y/N)");
    String answer = scan.nextLine();
    if (answer.equals("Y"))
    {
      System.out.println("You see trees, lots of trees, and  something blue to the SOUTH, also something gray to the NORTH");
      System.out.println("Where would you like to explore?(NORTH/SOUTH)");
       answer = scan.nextLine();
     if (answer.equals("NORTH"))
          {
         System.out.println("You walk towards the gray structure to the north, along the way you find a bag and pick it up.");
            System.out.println("Would you like to continue North? (YES/NO)");
            answer = scan.nextLine();
            if(answer.equals("YES"))
            {
             System.out.println("You arrive at the grey structure realizing it looks like some kind of ruins you enter through the door there is a staircase leading directly down from ground level. Do you wanna go down the staircase or do you want to turn back? (STAIRS/BACK)"); 
              answer = scan.nextLine();
            if(answer.equals("STAIRS"))          
            {
              System.out.println("You head down the staircase The air gets thinner and the lights go dimmer you reach a wooden door but its locked do you wnat to try and force it open or try to find the key. (BREAK/KEY)");
            answer = scan.nextLine();
            if(answer.equals("BREAK"))
            {
              System.out.println("You attempt to break the door open The start ramming yourself into  the door as you slam for the last time The door breaks open you fall on the ground you look and realize your in a old dungeon of some    kind it dusty and old in here and it reeks of a horrible smell you here some yelling in the distance what do you do? Run twoards the yelling or Search the room you are in? (RUN/SEARCH) ");
            answer = scan.nextLine();
              if(answer.equals("RUN"))
            {
              System.out.println("You start sprinting twoards the yelling and you encount a younb boy getting chased by some kind of old man. Hes holding a blunt object you cant quite make out but you can either help the boy or get out of there. (HELP/LEAVE) ");
            answer = scan.nextLine();
              if(answer.equals("HELP"))
            {
              System.out.println("You help the child only to get stabbed in the back when your gaurd is down");
            System.out.println("GAME OVER");//skill issue
               System.out.println("Press run to play again!");
            }
            if(answer.equals("LEAVE"))
            {
              System.out.println("You mercilessly leave the boy on his own but as you're walking away back to the jungle you see out of the corner of you eye, a shipwreck (INVESTIGATE/IGNORE)");
              answer = scan.nextLine();
            if(answer.equals("INVESTIGATE"))
            {
              System.out.println("Inside the shipwreck you find a box of supplies including flares, flasks of waters, and enough food for you to last another 2 days. You use the flares and after waiting about a day a helicopter arrives an picks you up");
               System.out.println("WINNER!");
            }
            if(answer.equals("IGNORE"))
            {
              System.out.println("You ignore the shipwreck and with that being your last source for hope you begin to slowly die from exaustion and lack of sustanance");
            System.out.println("GAME OVER");//skill issue
               System.out.println("Press run to play again!");
            }
            }
            }
              else if(answer.equals("SEARCH"))
            {
              System.out.println("You ignore the painful shouts of a person like the cold hearted monster you are and search the room. There are dressers and drwars everywhere this could take you awhile. You start you search find greaceful amounts of food and luxurys but nothing that could help you wander down this path. You can nw either keep searching or continue down the path. (CONTINUE/LOOK)");
              answer = scan.nextLine();
              if (answer.equals("CONTINUE"))
              {
                System.out.println("You continue down this path passing the old man and you feel as if your being watch out of no where you feel a tapping on your shoulder. Ypu swiftly turn arund to be meet with a man in an army suit he asks 'Are you lost sir? Why are you down here?' You excalim and tell him your story he states that this is army territory and if you need to get home he can help you with that. You go with the army and they get you back home.");
                  System.out.println("WINNER!");
              }  
              answer = scan.nextLine();
              if (answer.equals("LOOK"))
              {
                System.out.println("You are so stubborn you continue to search for something that isnt there till you die");
                System.out.println("GAME OVER");//skill issue 
                 System.out.println("Press run to play again!");
              }
            }
            }
              if(answer.equals("KEY"))
              {
                System.out.println("You are at the bottom of the stairwell look around for some kind of key for the door. You start thinking outside the box and pull on the light on the ceiling it feel like it pulls and click like a lever the ground below opens and you fall into a pit of spikes");
              System.out.println("GAME OVER");//skill issue
                 System.out.println("Press run to play again!");
              }
            }
            if(answer.equals("BACK"))
            {
              System.out.println("You head away from the stair case but this ony makes you even more lost than before. You feel like yur in a maze. You here a loud helicopter like noise. You look up and around and there it is a chance for escape! What do you do? Do you attempt to light stuff on fire for a signal or do you try to catch there attention in any other way? (FIRE/OTHER)");  
           answer = scan.nextLine();
            if(answer.equals("FIRE"))
            {
              System.out.println("You look in that bag you found earlier and you shoot a flare into the sky praying that the helicopter can see your signal. With luck on your side the helicopter turns around and staqrts looking for a place too land. You find the helicopter and ride away too saftey.");
              System.out.println("WINNER");
            }
            if (answer.equals("OTHER"))
            {  
              System.out.println("You miss the helicopter");
              System.out.println("GAME OVER");//skill issue
               System.out.println("Press run to play again!");
            }
            }
              
            }
            }  
           if (answer.equals("NO"))//do not want to continue north for some reason(IDIOT)
            {
              System.out.println("You turn back and like a fool hit your head on a tree falling over and blacking out never to wake up again.");
              System.out.println("GAME OVER");//skill issue
               System.out.println("Press run to play again!");
            }
            }
      if(answer.equals("SOUTH"))//SOUTH CRINGE 
      {
        System.out.println("You walk to the south and find a tattered bag with holes in it. You  pick it up would you like to continue south towards the blue (Y/N)");
        answer = scan.nextLine();
        if(answer.equals("Y"))
      {
        System.out.println("You reach the blue, it's a lake with some sort of structure in the   middle.");
        System.out.println("Would you like to swim to the structure, go East or go West?      (SWIM/EAST/WEST)");
        answer = scan.nextLine();
        if(answer.equals("SWIM"))
        {
          System.out.println("You start swimming towards the structure. You realize it's a lot further than you anticipated, but it's too late to turn back now. You run out of stamina 3/4 of the way to the structure and drown.");
          System.out.println("GAME OVER.");// skill issue
           System.out.println("Press run to play again!");
        }
        else if (answer.equals("EAST"))
        {
          System.out.println("You start to walk East. About a mile in you see a small bunker like structure. Continue toward this structure? (Y/N)");
          answer = scan.nextLine();
          if(answer.equals("Y"))
          {
            System.out.println("You keep walking and reach the structure. You realize it's a bunker to possibly hide from the terrors of the night. With that thought you realize it's becoming night. Enter the bunker or brave the night (ENTER/BRAVE)");
            answer = scan.nextLine();
            if(answer.equals("ENTER"))
            {
              System.out.println("You enter the bunker and see your usual bunker materials, canned food, bottled water, and... a lever? Would you like to wait out the night or pull the lever? (WAIT/LEVER)"); 
              answer = scan.nextLine();
              if(answer.equals("WAIT"))
              {
                System.out.println("You wait out in the bunker, refusing to pull the lever. Eventually a strong gust of wind blows the bunker shut and you slowly but surely run oput of materials and starve.");
                System.out.println("GAME OVER"); //skill issue
                 System.out.println("Press run to play again!");
              }
              else if(answer.equals("LEVER"))
              {
                System.out.println("You pull the lever and hear big gears turning. The gears eventually open up one of the walls to a control center and a rocket. You see that everything has already been prepped for you and all you need to do is set the timer for lift off, press the button, and get on the rocket. Do you press the button or leave? (PRESS/LEAVE)");
                answer = scan.nextLine();
                if(answer.equals("LEAVE"))
                {
                  System.out.println("You try to leave but forgot the 'watch your step' warning on the ground and trip over the small step. You hit your head and die.");
                  System.out.println("GAME OVER"); //skill issue
                  System.out.println("Press run to play again!");
                }
                else if(answer.equals("PRESS"))
                {
                  System.out.println("You set the timer to 20 minutes, press the red button, get everything ready, and enter the rocket. You get strapped in and just as you do you feel the thrusters kick on. The rocket takes off into space.");
                  System.out.println("YOU WIN");
                  System.out.println("........ Or do you.... You see you're approaching orbit of another small planet, this one seem like it's mostly water");
                   System.out.println("Press run to play again!");
                }
              }
            }
            else if (answer.equals("BRAVE"))
            {
              System.out.println("You foolishly try to stay out during the night. Without even seeing what it was, it gets you.");
              System.out.println("GAME OVER");//skill issue
               System.out.println("Press run to play again!");
            }
          }
          else if(answer.equals("N"))
          {
            System.out.println("Foolishly you turn back. You trip on a rock, hit your head and die.");
            System.out.println("GAME OVER"); //skill issue
             System.out.println("Press run to play again!");
          }
        }
        else if(answer.equals("WEST"))
        {
          System.out.println("You start walking West, and see some waterproof duct tape and put it in your tattered bag. You also see some kind of dock on the other side of the lake. Walk to the dock? (Y/N)");
          answer = scan.nextLine();
          if(answer.equals("Y"))
          {
            System.out.println("You walk around to the dock and notice a boat with several holes in it that could easily be patched up with the waterproof duct tape you found earlier. Do you use the tape or turn back? (USE/BACK)");
            answer = scan.nextLine();
            if(answer.equals("USE"))
            {
              System.out.println("You use the duct tape and find an oar to go with the boat you have now. You push the boat into the water with the intent to go to the structure in the lake, but right as you're about to leave you notice a key at the bottom of the lake that you could get by diving. Get the key or keep going? (KEY/IGNORE)");
              answer = scan.nextLine();
              if(answer.equals("KEY"))
              {
                System.out.println("You duck down, pick up the key and get back in the boat just as a fish larger than your arm swims past. Row to the structure in the middle of the lake. (ROW/BACK)");
              }
                 answer = scan.nextLine();
              if(answer.equals("ROW"))
              {
                System.out.println("You row to the structure in the middle of the lake. When you get there you realize that the opening, a small manhole, is slightly ajar. Would you like to go in or try to return (IN/BACK)");
                 answer = scan.nextLine();
                if(answer.equals("IN"))
                {
                  System.out.println("You move the manhole and enter the base. It's mostly empty except for a single radio with only a few hours of battery life left, and a flare gun with one flare. Do you take the materials and leave or look around some more? (LEAVE/LOOK)");
                   answer = scan.nextLine();
                  if(answer.equals("LEAVE"))
                  {
                    System.out.println("You take the materials and leave the base the way you came in. closing the manhole behind you. You soon realize this is a bad idea seeing as your boat has been tattered by the waves. You become stranded on the island and starve to death.");
                    System.out.println("GAME OVER"); //skill issue
                     System.out.println("Press run to play again!");
                  }
                  else if(answer.equals("LOOK"))
                  {
                    System.out.println("You take the materials and take one more look around. You find a hidden button under a table and decide to press it. It opens an underground hangar for a helicopter. It seems to have been  there for years, but you check the fuel gage and it's full. You get in the helicopter and fly away peacefully.");
                    System.out.println("WINNER"); //WIN
                     System.out.println("Press run to play again!");
                  }
                }
                else if(answer.equals("BACK"))
                {
                  System.out.println("You try to get back in your tattered boat, as soon as you get in it sinks. having no other way off you look back to the manhole to see it has closed completely. You starve on the island as you have no way off.");
                  System.out.println("GAME OVER"); //skill issue
                   System.out.println("Press run to play again!");
                }
              }
              else if(answer.equals("IGNORE"))
              {
                System.out.println("Having ignored the key you get in your boat and it just so happens that a huge wage was coming that you would've missed if you had picked up the key. The wave hits your boat, and you drown.");
                System.out.println("GAME OVER");//skill issue
                 System.out.println("Press run to play again!");
              }
            }
            else if(answer.equals("BACK"))
            {
              System.out.println("You try to turn back but trip over a loose board from the dock. You hit your head and die.");
              System.out.println("GAME OVER"); //skill issue
               System.out.println("Press run to play again!");
            }
          }
          else if(answer.equals("N"))
          {
            System.out.println("Instead of walking to the dock you wander into the forest. It soon turns to night and it gets you.");
            System.out.println("GAME OVER"); //skill issue
             System.out.println("Press run to play again!");
          }
        }
      }
      else if(answer.equals("N"))
      {
        System.out.println("You turn around deciding you have had enough of south on your way    back from the south path you encounter a large parrot. would you like to try to speak to it, or try to pass peacefully. (SPEAK/PASS)");
         answer = scan.nextLine();
        if(answer.equals("SPEAK"))
        {
          System.out.println("You try to speak to the parrot, but soon realize that not all parrots can speak to people. Having woken it from its slumber you have no doubt angered it. It gets made and bites your head off.");
          System.out.println("GAME OVER"); //Skill issue
           System.out.println("Press run to play again!");
        }
        else if(answer.equals("PASS"))
        {
          System.out.println("You try to pass peacefully but accidentally step on a stick and wake it. It bites your head off.");
          System.out.println("GAME OVER"); //skill issue
           System.out.println("Press run to play again!");
        }
      }
      }
      else if(answer.equals("N"))
    { 
      System.out.println("You continue to walk ingnoring your surroundings, Due to that fact   you Trip on a rock, hit your head,   and you die.");
      System.out.println("Game Over!"); //skill issue
       System.out.println("Press run to play again!");
     }
   
}
}
