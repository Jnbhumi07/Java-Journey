

public class LogicalOperatorsPractice {
    public static void main (String[]args){

         int age = 20;
        System.out.println("Eligible for College: " + (age >= 18));
         System.out.println("Eligible for Scholarship: " + (age >= 18 && age <= 25));
        System.out.println("Eligible for Senior Citizen Benefits: " + (age >= 60));
    }
    
}
