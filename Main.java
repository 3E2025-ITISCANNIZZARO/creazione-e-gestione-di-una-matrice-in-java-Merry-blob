import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; 
        for(int i = 0; i < matrix[0].length; i++){
            for(int o = 0; o < matrix[i].length; o++){
                matrix[i][o] = (int)(Math.random()*100+1);
            }
        }
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2])); 


        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++){
            for(int o = 0; o < matrix[i].length; i++){
                sum += matrix[i][o];
            }
        }
        System.out.println("Somma degli elementi: " + sum);

        int max = -1;
        for(int i = 0; i < matrix[0].length; i++){
            for(int o = 0; o < matrix[i].length; i++){
                if(matrix[i][o] > max){
                    max = matrix[i][o];
                }
            }
        }
        System.out.println("Valore massimo: " + max);
    }
}
