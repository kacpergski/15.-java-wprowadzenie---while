import java.sql.SQLOutput;

public class petlaWhile {

    public static void main(String[] args) {

        //Feature-1
int n = 10;

    int[][] multi = new int [n][n];

        // przypisanie wartości

        int i = 0;
        while (i < multi.length){
    int j =0;
    while (j < multi[i].length){
        multi[i][j] = (i+1)*(j+1);
        j++;
    }
            System.out.println();
           i++;
        }

        //wypełnienie tabliczki

        i = 0;
        while (i <multi.length){
            int j =0;
            while (j < multi[i].length){
                System.out.print(multi[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }



        

        //Feature-2

        //427 do 529
        System.out.println("");
        System.out.println("------------Feature2----------------");
        System.out.println("");
        int k = 427;
        while (k < 530){
            if ((k%3==0) && (k%5==0)) {
                System.out.println("TikTak");
            }

            else if (k%3==0) {
                System.out.println("Tik");
            }
            else if(k%5==0) {
                System.out.println("Tak");
            }


            k++;
        }
// ------------Feature-3----
        n=6; i=0;
        System.out.println("------------Feature-3----");
        System.out.println("");
        while (i<n){
            int j = 0;
            while (j<i+1){
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
// ------------Feature-4----
         n=7;  i=0; int l=0; int m; int j;
        System.out.println("------------Feature-4----");
        System.out.println("");

        while (n>0)
        { i=n;
                while (i>2){
                 System.out.print(" "); // wyświetlanie przerw początkowych
                 i=i-2;
                 }
            m=0;
               while (m<=l)
                {
                System.out.print("*"); // wyświetlanie gwiazdek w kolejnej linii
                m++;
                }

            System.out.println();  // przejscie do kolejnej linii
        n=n-2;
        l=l+2;
        }


//            j=0;
//             while (j<i){
//                 System.out.print("*");
//                 //System.out.print("*");
//                 j++;
//             }
//             System.out.print(" ");
//             System.out.println();
//             i++;

// ------------Feature-5----
       // System.out.println();
        System.out.println("------------Feature-5----");

        n=3;
        //int sudoku[][]= new int [n][n];
        int [][]sudoku = {{1,0,3},{0,1,2},{2,3,0}};
        // print sudoku

        System.out.println("Sudoku with zero in empty places");
        i = 0;
        while (i < sudoku.length){
            j =0;
            while (j < sudoku.length){
                System.out.print(sudoku[i][j]);
            j++;
            }
            System.out.println();
            i++;
        }
        // prepare sudoku
        i = 0;
        while (i < sudoku.length){
            j =0;
            while (j < sudoku.length){
                if (sudoku[i][j] == 0)
                {
                    sudoku[i][j] = 6-(sudoku[i][0]+sudoku[i][1]+sudoku[i][2]);
                }

               // else
              //  {sudoku[i][j] = sudoku[i][j];
             //   }

                j++;
            }
            System.out.println();
            i++;
        }
        // print sudoku
        System.out.println("Sudoku completed");
        i = 0;
        while (i < sudoku.length){
            j =0;
            while (j < sudoku.length){
                System.out.print(sudoku[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
        // ------------Feature-6----
        System.out.println("------------Feature-6----");
        System.out.println();


// System.out.println();
        System.out.println("------------Feature-5----");

        n=3;
        //int sudoku[][]= new int [n][n];
        int [][]sudoku1 = {{2,0,0},{0,1,2},{1,2,0}};
        // print sudoku

        System.out.println("Sudoku with zero in empty places");
        i = 0;
        while (i < sudoku1.length){
            j =0;
            while (j < sudoku1.length){
                System.out.print(sudoku1[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
        // prepare sudoku
        i = 0;
        while (i < sudoku1.length){
            j =0; k=0; int a, b;
            while (j < sudoku1.length){
                if (sudoku1[i][j] == 0)
                {   a = 6-(sudoku1[i][0]+sudoku1[i][1]+sudoku1[i][2]);
                    b = 6-(sudoku1[0][j]+sudoku1[1][j]+sudoku1[2][j]);
                    if (a<=3){
                    sudoku1[i][j] = a;}
                    else{
                        sudoku1[i][j] = b;}
                   // sudoku1[i][j] = 6-(sudoku1[i][0]+sudoku1[i][1]+sudoku1[i][2]);

                }

                // else
                //  {sudoku1[i][j] = sudoku1[i][j];
                //   }

                j++;
            }
            System.out.println();
            i++;
        }
        // print sudoku
        System.out.println("Sudoku completed");
        i = 0;
        while (i < sudoku1.length){
            j =0;
            while (j < sudoku1.length){
                System.out.print(sudoku1[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }



        



    }
}
