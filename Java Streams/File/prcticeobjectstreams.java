import java.io.*;
class Customer implements Serializable{
    String Cust_id;
    String name;
    String phone_no;
    static int count = 1;
    Customer(){};
    Customer(String name, String phone_no){
        Cust_id = "C"+count;
        count++;
        this.name = name;
        this.phone_no = phone_no;
    }
    public String toString(){
        return "\nCustomer Details\n"
         + "\nCust_id: " + Cust_id
          + "\nName: " + name
           + "\nPhone_no: " + phone_no +  " \n";
    }
}
public class prcticeobjectstreams {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("./practiceobject.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Customer list[] = {new Customer("Kunal","9027323"), new Customer("kunal","892732"), new Customer("Kunal3"," 485s934")};


        oos.writeInt(list.length);

        for(Customer x: list){
            oos.writeObject(x);
            System.out.println("--------------------------------");
            System.out.println(x.toString());
            
        }
        oos.close();
        fos.close();
        

        FileInputStream fis = new FileInputStream("./practiceobject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int len  = ois.readInt();
        System.out.println("Reading strating/########.");
        for(int i = 0; i < len; i++){
            Customer customer = (Customer) ois.readObject(); // Read the object and cast it to Customer
            System.out.println(customer); // Print the customer object
        }
        System.out.println("Reading Ending/########.");
        ois.close();
        fis.close();

        
    }
}
