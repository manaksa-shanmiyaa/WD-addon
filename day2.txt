import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();i
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
     System.out.println("enter the value");
     arr[i]= in.nextInt();
        }
    }
}

String
class Main {
    public static void main(String[] args){
    String str = "hello";
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println((str1).equals(str2));
              
    }
}

class Main {
    public static void main(String[] args){
    String str =  new String("appending");
    String str1 = "";
   for(int i=0;i<str.length();i++){
       if(str.charAt(i)!='a')
       if(str.charAt(i)!='e')
       
       {
           
           str1+=str.charAt(i);
       }
       else{
           
       }
      
   }
   
   System.out.println(str1);
              
    }
}
task 
class Main {
    public static void main(String[] args) {
        String str = "I love zoho";
        String str1[] = str.split(" ");s
        System.out.println(str1[2]);
    }
}

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}

task3

class main{
public class static void main(String[]args){
String str ="i love zoho";
character array manualy char[]chars=new chars[str.length];
for(int i=0;i<str.charAt(i);
{
chars[i]=str.charAt(i);
}
for(int i=chars.length-1;i>=0;i--){
System.out.println(chars[i]);
}
}
}
