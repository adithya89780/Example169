package Tic_tac_toe;

public class TicTacToeGame {
        char tictoc[][]=new char[3][3];
        //Display Fuction
        public static void display(char tictoc[][]) {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(tictoc[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

