package practice3;
import java.util.Scanner;
import java.util.ArrayList;
public class question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int conj1[] = new int[N];
        int conj2[] = new int[N];
        if(N>0){

            for(int i = 0; i < conj1.length; i++){
                conj1[i] = input.nextInt();               
            }
            for(int j = 0; j < conj2.length; j++){
                conj2[j] = input.nextInt();   
            }
        }
        input.close();
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int element : conj1){
            for(int element2 : conj2){
                if (element == element2 && !intersection.contains(element)){
                    intersection.add(element);         
                }   
            }
        }  
        System.out.print("intersection:\n");
        for(int value : intersection){
        System.out.println(value); 
        }
    }
}
