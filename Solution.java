/* Name: Kuruppu Arachchige Sriyan Nayanapriya Premarathna
 * Email: masriyan@hotmail.com
 * Github Profile Link: https://github.com/sriyan1971/solution
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;


/* Name: Kuruppu Arachchige Sriyan Nayanapriya Premarathna
 * Email: masriyan@hotmail.com
 * Github Profile Link: https://github.com/sriyan1971/solution
 * @author Kuruppu Arachchige Sriyan Nayanapriya Premarathna
 * G0948215L
 * 
 * - Restrictions:
 * + Only `while` loops are allowed.
 * + No using of in-built array functions for primitive arrays except for `.length`.
 * + Only `get`, `set` and `add` methods allowed for objects of `Array` type if used.
 * 
 * Expected output sample
 * This board has 4 chains - result should be 4
 * Row 1 has 1 horizontal chain: 3,3,3
 * Row 2 has 1 horizontal chain: 0,0,0
 * Column 1 has 1 vertical chain: 0,0,0,0
 * Column 4 has 1 vertical chain: 2,2,2
  
 **/
public class Solution {

    public static void main(String[] args) {
    
    int[][] board = new int[][] {
      {0,3,3,3},
      {0,0,0,2},
      {0,1,4,2},
      {0,9,8,2}
       };
  
     try{
      int result = Solution.countChains(board);
      System.out.printf("%nThis board has " + result + " chains %n");
      System.in.read();  
        }
     catch( Exception e){
      System.out.printf(e.toString());
     }
     
     }
    
     public static int countChains(int[][] board) {
         
         int noOfChains = 0;
         int hMatched = 1; 
         int i = 0;
         
         // Checking each row 
         while ( i < board.length) 
         {
               int j = 0;
               hMatched=1;
               while ( j < board.length-1) {
                 
                   if ( board[i][j]== board[i][j+1])
                    {
                    hMatched = hMatched+1;
                    }
                   else
                    {
                      if(hMatched>2)
                        break;
                      else
                        hMatched = 1;
                    }
                    j++;
                }
               
               if(hMatched>2)
               {
                      noOfChains++;
                      System.out.printf("%nRow "+ (i+1) + " has 1 horizontal chain:");
                      while( hMatched > 0)
                      {
                        System.out.printf( board[i][j]+ ""); 
                        hMatched--;
                        if(hMatched>0)
                            System.out.printf(","); 
                      }
                }
               
            
        i++;
        } 
        
        
        // // Checking each Column 
         int vMatched = 0; 
         int k = 0;
         while ( k < board.length) 
         {
            int j = 0;
            vMatched=1;
            while ( j < board.length-1) 
            {
                 
                if ( board[j][k]== board[j+1][k])
                {
                    vMatched++;
                }
                else 
                {
                    if(vMatched>2)
                      break;
                    else
                      vMatched = 1;
                }
  
            j++;
            }
               
            if(vMatched>2)
            {
                noOfChains++;
                System.out.printf("%nColumn "+ (k+1) + " has 1 vertical chain:");
                while( vMatched > 0)
                    {
                      System.out.printf( board[j][k]+ ""); 
                      vMatched--;
                      if(vMatched>0)
                         System.out.printf(","); 
                    }
            }
             
        k++;
        }
             
    return noOfChains;
    };
  
    
}
