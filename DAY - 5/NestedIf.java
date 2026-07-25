public class NestedIf{
     public static void main(String[]args){

     
    int age = 20;
boolean hasAadhaar = false;

if (age >= 18) {

    if (hasAadhaar) {
        System.out.println("Admission Allowed");
    } else {
        System.out.println("Bring Aadhaar Card");
    }

} else {
    System.out.println("Not Eligible");
}
     }
    }