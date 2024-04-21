//code 1 ) Anonumus class without a=ny object
// abstract class App{
//     abstract public void display();
// }
// // 
// public class Anonymus {
//     public static void main(String[] args) {
//         App obj = new App() {
//             public void display(){
//                 System.out.println("Jatt nal Yarri");
//             }
//         };
//         obj.display();
//     }
// }
interface App{
    void display();
}
// 
public class Anonymus {
    public static void main(String[] args) {
      new App() {
            public void display(){
                System.out.println("Jatt nal Yarri");
            }
        }.display();
       
    }
}
