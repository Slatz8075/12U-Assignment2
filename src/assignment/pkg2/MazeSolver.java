/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author slatz8075
 */
public class MazeSolver {

    
    public void printMaze(char[][] maze){
        //loop through all rows
        for(int i = 0; i < maze.length; i++){
            //go through each row
            for(int j = 0; j < maze[i].length; j++){
                //printing the curent location
                System.out.println(maze[i][j]);
            }
            //move to next line
            System.out.println("");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char[][] maze = new char[10][10];
        char[][] maze = {{'w','w','w','w','.', '.'},
                         {'s','.','w','.','w', '.'},
                         {'w','.','w','.','w', '.'},
                         {'w','.','.','.','.', '.'},
                         {'w','w','w','e','w', 'w'}};
    }
}
