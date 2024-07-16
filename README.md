# Minesweeper_Game

Overview
This is a simple Minesweeper game implemented in Java. The objective is to clear a grid of hidden mines without detonating any of them. The game gives clues about the number of neighboring mines in each tile, which helps in identifying safe tiles.

Game Rules
The game board consists of a 5x5 grid with a total of 25 tiles.
Out of the 25 tiles, 4 tiles contain mines (bombs), and 21 tiles are safe.
The player must open all 21 safe tiles to win the game.
Each tile gives a clue about the number of adjacent tiles containing mines. The check is performed horizontally, vertically, and diagonally.
If a tile with a mine is opened, the player loses the game.

Features
Clue System: Each tile provides information about the adjacent tiles, helping the player avoid mines.
Winning Condition: Open all safe tiles to win.
Losing Condition: Opening a tile with a mine results in a loss.
How to Play
Launch the game.
Click on a tile to open it.
If the tile is safe, it will display a number indicating how many of the adjacent tiles contain mines.
Use the clues provided to avoid opening tiles with mines.
Continue opening tiles until all safe tiles are revealed to win the game.
If a mine is revealed, the game is over, and you lose.

Setup and Installation
Ensure you have Java Development Kit (JDK) installed on your machine.
Clone the repository or download the source code.
Compile the Java source files.
Run the game.
