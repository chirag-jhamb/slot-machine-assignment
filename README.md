# slot-machine-assignment


## Features required-
### GUI:
- Three slots appear in the middle of the frame. They will show the outcome of a spin, each slot holding one figure. The slots are initially empty.
- A button that reads “SPIN” invites the user to spin the game. The balance of the user’s wallet is displayed under the spin button.
- A text field invites the user to enter a cheat code, which will alter the odds of certain figures appearing (see section on cheat codes).
- A message area is used to communicate with the user about gains and losses, or to display information (e.g. “Correct Cheat Code Entered”, “Invalid Cheat Code” etc.).
- A button that reads “NEW” allows the user to start a new game, with an initial value at the wallet.
- A button that reads “LOAD” allows the user to load an existing game (see section on data storage).
- A button that reads “SAVE” allows the user to save the game, so that it can be restored at a later stage (see section on data storage).
- A button that reads “HISTORY” pops a new window to display the historic result of the player, including those loaded from the file (if it is not a new game). The historic result should contain the records of each run, including the outcome of 3 slots, the gain or loss amount and the balance after each run. (You can design how to display these information. There is no specific GUI requirement for this window.)
- A button that reads “QUIT” allows the user to terminate the program at any point, giving up the contents of their wallet.

### Cheat codes
- The user can enter only one cheat code per spin is allowed
- Cheat code can be used for a specific number of time, or unlimited use. The counter will only be reset if the user quits the game (by pressing the “Quit” button).
* Cheat codes can have two impacts on the outcome of a spin:
  * Change the odds of specific figures showing up, e.g. Banana has around 50% chance to appear
  * Change the odds of specific types showing up, e.g. Wildcard type figures have around 80% chance to appear
- Cheat code database should be read from a file (see section on data storage).

### Data storage
- Saving a game:
  * The game is saved to a file named savedGame.dat that is stored in the same folder as the program.
 - Loading a game:
  * The game is overwritten from the contents of a file called savedGame.dat that is stored in the same folder as the program.
 - There is no requirement for the format of savedGame.dat. You can design your own! Remember to record all history of the user for every run. (see section on GUI)
- Cheat codes are stored in a text file named cheatCodes.txt in the same folder as the program.
- Each cheat code data is stored as a line of string.
- Cheat code data is of the following format:
  * CODE_STRING,CHEAT_TYPE,NUM_REUSE,FIGURE_OR_TYPE,PERCENT
 
### Winning combinations and gains:
- Identical figures:
  * 3 identical figures: 10 * figure value
  * 2 identical non-wildcard figures + wildcard: 5 * figure value
  * 2 identical figures: 3 * figure value
- Same category:
  * 3 figures from the same category: 2 * category value
- Same colour (apply to Fruit and Vehicle figures only):
  * 3 figures of the same colour: the maximum figure values of the 3 figures
- In case there are more than 1 winning rule, pick the highest one. For example,
  * [Case 1] There are 3 bananas. It belongs to “3 identical figures”, “3 figures from the same category” and “3 figures of the same colour”. In this case, choose the first one as it gives the highest gain (120).
  * [Case 2] There are two Trucks and one Green Apple. It belongs to “2 identical figures” and “Same colour”. In this case, choose “Same colour” as it gives the highest gain (18).
  

## Screenshots:
![1](https://raw.githubusercontent.com/chirag-jhamb/slot-machine-assignment/master/screenshots/Screenshot%20from%202015-10-20%2010%3A24%3A45.png)
![2](https://raw.githubusercontent.com/chirag-jhamb/slot-machine-assignment/master/screenshots/Screenshot%20from%202015-10-20%2010%3A21%3A50.png)
![3](https://raw.githubusercontent.com/chirag-jhamb/slot-machine-assignment/master/screenshots/Screenshot%20from%202015-10-20%2010%3A22%3A55.png)
