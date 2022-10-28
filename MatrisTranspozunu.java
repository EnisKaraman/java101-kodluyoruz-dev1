package Listeler;
public class MatrisTranspozunu {
    public static void main(String[] args) {
        int[][] matris = new int[2][3]; 
        int [][] transpoze = new int[3][2];
        matris[0][0] = 2;matris[0][1] = 3;matris[0][2] = 4;
        matris[1][0] = 5;matris[1][1] = 6;matris[1][2] = 4;
             
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transpoze[i][j]=matris[j][i];
            }
        }       
        for (int[] row : transpoze){
            for (int col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
