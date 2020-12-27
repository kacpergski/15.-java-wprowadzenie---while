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
        while (i < multi.length){
            int j = 0;
            while (j < multi[i].length){
                System.out.print(multi[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
                //Feature-1

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


    }
}
