public class nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nqueen(char board[][],int row){
        //base
        if(row==board.length){
            count++;
            //printboard(board);
            return true;
        }
        //calumn loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
               if(nqueen(board,row+1)){
                return true;
               }//function call
                board[row][j]='X';//backtracking step
            }
        }
        return false;
    }
    public static void printboard(char board[][]){
        System.out.println("-------chess board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
      static int count=0;
    public static void main(String args[]){
        int n=6;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X'; 
            }
        }
        if(nqueen(board,0)){
           //System.out.print(count);
           System.out.print("Solution possible");
           printboard(board);
        }
        else{
              System.out.print("Solution not possible");
        }
    }
}
