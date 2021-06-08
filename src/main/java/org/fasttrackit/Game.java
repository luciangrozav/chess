package org.fasttrackit;

import java.util.Scanner;

public class Game {

   Scanner scanner = new Scanner(System.in);
   private Player[] players = new Player[3];

   private void initialisePlayers()
   {
       Player player1 = new Player();
       player1.setName("Garry Kasparov");
       player1.setAge(36);
       player1.setElorating(2879);
       player1.setNationality("Russian");

       player1.setAggressive(10);
       player1.setPositional(8);
       player1.setDynamic(10);
       player1.setDefensive(8);

       players[0]=player1;

       Player player2 = new Player();
       player2.setName("Jose Raul Capablanca");
       player2.setAge(33);
       player2.setElorating(2725);
       player2.setNationality("Cuban");

       player2.setAggressive(8);
       player2.setDefensive(9);
       player2.setPositional(10);
       player2.setDynamic(9);

       players[1]=player2;

       Player player3 = new Player();
       player3.setName("Bobby Fischer");
       player3.setAge(29);
       player3.setElorating(2881);
       player3.setNationality("American");

       player3.setAggressive(9);
       player3.setPositional(10);
       player3.setDynamic(9);
       player3.setDefensive(9);

       players[2]= player3;
   }

   public void start()
   {
       initialisePlayers();
       choosePlayer();

   }

   private void choosePlayer()
   {

       int i;
       int j;
       System.out.println("1)" + players[0].getName());
       System.out.println("2)" + players[1].getName());
       System.out.println("3)" + players[2].getName());
       System.out.println(" ");

       System.out.println("Please choose Player1:");
       i= scanner.nextInt();

       System.out.println("Please choose Player2:");
       j=scanner.nextInt();

       System.out.println("The match will consist of 6 classical chess games!");
       System.out.println(" ");
       System.out.println("The games you can play are:");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");

       System.out.println(players[i-1].getName() + " vs " + players[j-1].getName() );

       match(i-1, j-1);

   }

   private void match(int i, int j)
   {
    char n;
    int p1=0;
    int p2=0;
    // game1
       System.out.println(" ");
       System.out.println("Game 1:");
       System.out.println(players[i].getName() + " with the white pieces.");
       System.out.println(players[j].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[i].getDynamic() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getPositional())
               System.out.println("Game 1 is a draw");

           if (players[i].getDynamic() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }

       }
       if (n == 'b')
       {
           if(players[i].getDynamic() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getDynamic())
               System.out.println("Game 1 is a draw");

           if (players[i].getDynamic() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }
       }
       if(n == 'c')
       {
           if(players[i].getPositional() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDefensive())
               System.out.println("Game 1 is a draw");

           if (players[i].getPositional() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }
       }
       if(n == 'd')
       {
           if(players[i].getPositional() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDynamic())
               System.out.println("Game 1 is a draw");

           if (players[i].getPositional() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }
       }
       if (n == 'e')
       {
           if(players[i].getAggressive() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getAggressive() == players[j].getDefensive())
               System.out.println("Game 1 is a draw");

           if (players[i].getAggressive() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }
       }
       if( n == 'f')
       {
           if(players[i].getPositional() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 1 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getPositional())
               System.out.println("Game 1 is a draw");

           if (players[i].getPositional() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 1 is won by: " + players[i].getName());
           }
       }
       // game2
       System.out.println(" ");
       System.out.println("Game 2:");
       System.out.println(players[j].getName() + " with the white pieces.");
       System.out.println(players[i].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[j].getDynamic() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getPositional())
               System.out.println("Game 2 is a draw");

           if (players[j].getDynamic() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }

       }
       if (n == 'b')
       {
           if(players[j].getDynamic() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getDynamic())
               System.out.println("Game 2 is a draw");

           if (players[j].getDynamic() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }
       }
       if(n == 'c')
       {
           if(players[j].getPositional() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDefensive())
               System.out.println("Game 2 is a draw");

           if (players[j].getPositional() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }
       }
       if(n == 'd')
       {
           if(players[j].getPositional() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDynamic())
               System.out.println("Game 2 is a draw");

           if (players[j].getPositional() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }
       }
       if (n == 'e')
       {
           if(players[j].getAggressive() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getAggressive() == players[i].getDefensive())
               System.out.println("Game 2 is a draw");

           if (players[j].getAggressive() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }
       }
       if( n == 'f')
       {
           if(players[j].getPositional() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 2 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getPositional())
               System.out.println("Game 2 is a draw");

           if (players[j].getPositional() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 2 is won by: " + players[j].getName());
           }
       }
       // game3
       System.out.println(" ");
       System.out.println("Game 3:");
       System.out.println(players[i].getName() + " with the white pieces.");
       System.out.println(players[j].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[i].getDynamic() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getPositional())
               System.out.println("Game 3 is a draw");

           if (players[i].getDynamic() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }

       }
       if (n == 'b')
       {
           if(players[i].getDynamic() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getDynamic())
               System.out.println("Game 3 is a draw");

           if (players[i].getDynamic() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }
       }
       if(n == 'c')
       {
           if(players[i].getPositional() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDefensive())
               System.out.println("Game 3 is a draw");

           if (players[i].getPositional() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }
       }
       if(n == 'd')
       {
           if(players[i].getPositional() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDynamic())
               System.out.println("Game 3 is a draw");

           if (players[i].getPositional() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }
       }
       if (n == 'e')
       {
           if(players[i].getAggressive() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getAggressive() == players[j].getDefensive())
               System.out.println("Game 3 is a draw");

           if (players[i].getAggressive() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }
       }
       if( n == 'f')
       {
           if(players[i].getPositional() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 3 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getPositional())
               System.out.println("Game 3 is a draw");

           if (players[i].getPositional() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 3 is won by: " + players[i].getName());
           }
       }
       // game4
       System.out.println(" ");
       System.out.println("Game 4:");
       System.out.println(players[j].getName() + " with the white pieces.");
       System.out.println(players[i].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[j].getDynamic() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getPositional())
               System.out.println("Game 4 is a draw");

           if (players[j].getDynamic() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }

       }
       if (n == 'b')
       {
           if(players[j].getDynamic() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getDynamic())
               System.out.println("Game 4 is a draw");

           if (players[j].getDynamic() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }
       }
       if(n == 'c')
       {
           if(players[j].getPositional() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDefensive())
               System.out.println("Game 4 is a draw");

           if (players[j].getPositional() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }
       }
       if(n == 'd')
       {
           if(players[j].getPositional() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDynamic())
               System.out.println("Game 4 is a draw");

           if (players[j].getPositional() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }
       }
       if (n == 'e')
       {
           if(players[j].getAggressive() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getAggressive() == players[i].getDefensive())
               System.out.println("Game 4 is a draw");

           if (players[j].getAggressive() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }
       }
       if( n == 'f')
       {
           if(players[j].getPositional() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 4 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getPositional())
               System.out.println("Game 4 is a draw");

           if (players[j].getPositional() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 4 is won by: " + players[j].getName());
           }
       }
       //game 5
       System.out.println(" ");
       System.out.println("Game 5:");
       System.out.println(players[i].getName() + " with the white pieces.");
       System.out.println(players[j].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[i].getDynamic() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getPositional())
               System.out.println("Game 5 is a draw");

           if (players[i].getDynamic() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }

       }
       if (n == 'b')
       {
           if(players[i].getDynamic() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getDynamic() == players[j].getDynamic())
               System.out.println("Game 5 is a draw");

           if (players[i].getDynamic() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }
       }
       if(n == 'c')
       {
           if(players[i].getPositional() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDefensive())
               System.out.println("Game 5 is a draw");

           if (players[i].getPositional() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }
       }
       if(n == 'd')
       {
           if(players[i].getPositional() < players[j].getDynamic())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getDynamic())
               System.out.println("Game 5 is a draw");

           if (players[i].getPositional() > players[j].getDynamic())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }
       }
       if (n == 'e')
       {
           if(players[i].getAggressive() < players[j].getDefensive())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getAggressive() == players[j].getDefensive())
               System.out.println("Game 5 is a draw");

           if (players[i].getAggressive() > players[j].getDefensive())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }
       }
       if( n == 'f')
       {
           if(players[i].getPositional() < players[j].getPositional())
           {
               p2++;
               System.out.println("Game 5 is won by: " + players[j].getName());
           }
           if (players[i].getPositional() == players[j].getPositional())
               System.out.println("Game 5 is a draw");

           if (players[i].getPositional() > players[j].getPositional())
           {
               p1++;
               System.out.println("Game 5 is won by: " + players[i].getName());
           }
       }
       // game 6
       System.out.println(" ");
       System.out.println("Game 6:");
       System.out.println(players[j].getName() + " with the white pieces.");
       System.out.println(players[i].getName() + " with the black pieces.");
       System.out.println(" ");
       System.out.println("a) Ruy Lopez");
       System.out.println("b) The Sicilian Defence");
       System.out.println("c) The French Defence");
       System.out.println("d) The Queen's gambit");
       System.out.println("e) The Danish gambit");
       System.out.println("f) Caro-Kann Defence");
       System.out.println(" ");
       System.out.println("Choose the game:");
       n=scanner.next().charAt(0);
       System.out.println(" ");

       if(n == 'a')
       {
           if(players[j].getDynamic() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getPositional())
               System.out.println("Game 6 is a draw");

           if (players[j].getDynamic() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }

       }
       if (n == 'b')
       {
           if(players[j].getDynamic() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getDynamic() == players[i].getDynamic())
               System.out.println("Game 6 is a draw");

           if (players[j].getDynamic() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }
       }
       if(n == 'c')
       {
           if(players[j].getPositional() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDefensive())
               System.out.println("Game 6 is a draw");

           if (players[j].getPositional() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }
       }
       if(n == 'd')
       {
           if(players[j].getPositional() < players[i].getDynamic())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getDynamic())
               System.out.println("Game 6 is a draw");

           if (players[j].getPositional() > players[i].getDynamic())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }
       }
       if (n == 'e')
       {
           if(players[j].getAggressive() < players[i].getDefensive())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getAggressive() == players[i].getDefensive())
               System.out.println("Game 6 is a draw");

           if (players[j].getAggressive() > players[i].getDefensive())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }
       }
       if( n == 'f')
       {
           if(players[j].getPositional() < players[i].getPositional())
           {
               p1++;
               System.out.println("Game 6 is won by: " + players[i].getName());
           }
           if (players[j].getPositional() == players[i].getPositional())
               System.out.println("Game 6 is a draw");

           if (players[j].getPositional() > players[i].getPositional())
           {
               p2++;
               System.out.println("Game 6 is won by: " + players[j].getName());
           }
       }

       System.out.println("");
       System.out.println("The chess games are over!");
       System.out.println(" ");
       if(p1 > p2)
           System.out.println("The winner of the match is:  " + players[i].getNationality() + " GM " + players[i].getName());
       if (p1==p2)
           System.out.println("The match between" + players[i].getName() + " and " + players[j].getName() +  " it's a draw!");
       if (p1<p2)
           System.out.println("The winner of the match is:  " + players[j].getNationality() + " GM " + players[j].getName());
   }


}
