# Custom-Circular-Double-linked-list

It is a simple turn-based multiplayer game, each player takes a turn rolling three dice. After each roll their score is increased by the result (the score of 3 dice added together) and the next player will have their turn.
Once a player’s roll results in a total of 9, their score is decreased by 9 points
It is important that scores do not go below 0
Once a player rolls a set (3) of 6s, their score is reset to 0
Once the player rolls a set (3) of 1s, they are eliminated from the game.

This will continue until a winner is declared: either someone reaches 200 points or there is only one person left in the game.
1. Design a custom DoubleCircularLinkedList class.
2. Create a Player class that stores the player name and score information. Include any methods required to update the score.
3. Simulation of a game between 4 players. The output should include
the result of each player’s turn, the final winner, and final scores of the remaining players.
Also indicate those players, if any, who were eliminated.

Sample output:
Eric rolled 10, score is now 10
Riya rolled unlucky 9, score is now 0
Fayden rolled 8, score is now 20
Mark rolled a triple 6, score is back to 0
Eric rolled 6, score is now 16
Riya rolled 3, score is now 3
Fayden rolled 4, score is now 12
Mark rolled unlucky 9, score is now 0
Eric rolled has been eliminated
Riya rolled 1,1,1 the snake eye and has been removed out of game.
Fayden has won the game! :)
Final scores are:
Eric: 26, Fayden: 32, Mark: 5
