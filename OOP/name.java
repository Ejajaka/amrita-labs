import java.util.Scanner; 

class Name {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter the name and age: ");
        String name = s.nextLine();  
        int age = s.nextInt();          
        System.out.println("The name of the person is " + name + ", age of the person is " + age);  
    }
}
