public class Spiral {

    public static int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    int sr=0, er=A.length-1, sc=0, ec=A[0].length-1;
	   while(sc<ec && sr<er){
	       for(int i=sc; i<ec; i++){
	        //    System.out.print(A[sr][i]+" ");
			   if(k==0) return A[sr][i];
			   k--;
	       }
	       for(int i=sr; i<er; i++){
	        //    System.out.print(A[i][ec]+" ");
			   if(k==0) return A[i][ec];
			   k--;
	       }
	       for(int i=ec; i>sc; i--){
	        //    System.out.print(A[er][i]+" ");
			   if(k==0) return A[er][i];
			   k--;
	       }
	       for(int i=er; i>sr; i--){
	        //    System.out.print(A[i][sr]+" ");
			   if(k==0) return A[i][sr];
			   k--;
	       }
	       sr++;
	       er--;
	       sc++;
	       ec--;
	   }
	   return -1;
    }
    public static void main(String[] args) {
        int A[][] = {{1 , 2,  3, 4},
        {5,  6,  7,  8},
        {9,  10, 11, 12},
        {13, 14, 15, 16}};

        // for(int i=0; i<A.length; i++){
        //     for(int j=0; j<A[0].length; j++){
        //         System.out.print(A[i][j]+" ");
        //     }
        //     System.out.println();
			
        // }
        System.out.println(findK(A, 0, 0, 6));
    }
}
