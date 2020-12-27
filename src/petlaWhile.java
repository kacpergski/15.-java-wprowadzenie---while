import javax.swing.plaf.SeparatorUI;

public class petlaWhile {

    public static void main(String[] args) {

        //Feature-1
int n = 6;

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

// ------------Feature-3----
        n=6; i=0;
        System.out.println("------------Feature-3----");
        System.out.println("");
                while (i<n){
                    int j = 0;
                    while (j<i){
                        System.out.print("*");
                      j++;
                    }
                    System.out.println("*");
                    i++;
                }




    }
}
