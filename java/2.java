// import java.util.Scanner;
// public class Main
// {
//     public static void main (String[]args)
//     {
//       Scanner sc = new Scanner (System.in);
//       int a, b, sum;
//         System.out.print ("Enter value of a: ");
//         a = sc.nextInt ();
//         System.out.print ("Enter value of a: ");
//         b = sc.nextInt ();
//         sum = a + b;

//         System.out.print("Sum of a and b is: " + (sum));
//     }

//   }


// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a,b,c;
//         System.out.println("Enter First number: ");
//         a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         b = sc.nextInt();
//         System.out.println("Enter Third number: ");
//         c = sc.nextInt();
//         if(a > b && a > c){
//             System.out.println("a is greater");
//         }else if(b > a && b > c){
//             System.out.println("b is greater");
//         }else{
//             System.out.println("c is greater");
//         }
//     }
// }
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a,b,c;
//         System.out.println("Enter First number: ");
//         a = sc.nextInt();
//         // System.out.println("Enter second number: ");
//         // b = sc.nextInt();
//         // System.out.println("Enter Third number: ");
//         // c = sc.nextInt();
//         if(a%2 == 0){
//             System.out.println("EVEN");
//         }else{
//             System.out.println("ODD");
//         }
//     }
// }

// CALCULATOR

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a,c;String b;
//         System.out.print("@---> ");
//         a = sc.nextInt();
//         System.out.print("");
//         b = sc.next();
//         System.out.println("");
//         c = sc.nextInt();
//         System.out.print("Output -> ");
//         switch(b){
            
//             case "-":
//                 System.out.print(a - c);
//                 break;
//             case "+":
//                 System.out.print(a + c);
//                 break;
//             case "*":
//                 System.out.print(a * c);
//                 break;
//             case "/":
//                 if(a >= c){
//                     System.out.print(a / c); 
//                 }
//                 else{
//                     System.out.print("Invalid values.");
//                 }
//                 break;
//             default:
//               System.out.println("Invalid input.");
//               break;
//         }
//     }
// }
