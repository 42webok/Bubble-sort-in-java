
import java.util.*;
class sort{
    public void ascending_order(int n , ArrayList<Integer> numbers){
        for (int j=0; j < n-1; j++){
            System.out.println("for pass " + j);
            for (int k=0; k< n-1-j ; k++){
                if(numbers.get(k) > numbers.get(k+1)){

                    int swaper = numbers.get(k);
                    System.out.println("Swap values are " + swaper  + " And " + numbers.get(k+1));
                    numbers.set(k , numbers.get(k+1));
                    numbers.set(k+1 , swaper);
                    System.out.println(numbers);
                }
                else{
                    System.out.println("No swap exist for this iteration");
                }
            }
        }
        System.out.println("Sorted numbers in ascending order: " + numbers);
    }

    public void descending_order(int n , ArrayList<Integer> numbers){
        for (int j=0; j < n-1; j++){
            System.out.println("for pass " + j);
            for (int k=0; k< n-1-j ; k++){
                if(numbers.get(k) < numbers.get(k+1)){

                    int swaper = numbers.get(k);
                    System.out.println("Swap values are " + swaper  + " And " + numbers.get(k+1));
                    numbers.set(k , numbers.get(k+1));
                    numbers.set(k+1 , swaper);
                    System.out.println(numbers);
                }
                else{
                    System.out.println("No swap exist for this iteration");
                }
            }
        }
        System.out.println("Sorted numbers: " + numbers);
    }
}

public class bubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sort sort = new sort();
        ArrayList<Integer> numbers= new ArrayList<>();

        System.out.println("Enter the length of your numbers");
        int n = input.nextInt();
        int data;
        for(int i=1; i<=n; i++){
            System.out.println("Enter " + i + " Number");
            data = input.nextInt();
            numbers.add(data);
        }
        System.out.println("The numbers entered by users are : " + numbers);
        System.out.println("For ascending type A or descending type D");
        String choice = input.next();
        if (choice.equals("A")) {
            sort.ascending_order(n, numbers);
        } else if (choice.equals("D")) {
            sort.descending_order(n, numbers);
        } else {
            System.out.println("Invalid choice. Please enter A for ascending or D for descending.");
        }
    }
}
