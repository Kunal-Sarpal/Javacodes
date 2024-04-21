class InnerClass {
    public static int ageLimit = 50;

    class InnerPract {
        public int age;

        InnerPract(int age) {
            this.age = age;
        }

        public void display(){
            System.out.println("Hi my name is Kunal My age is " + age);
            if(age < ageLimit){
                System.out.println("You can Work");
            }
            else{
                System.out.println("You can't Work");

            }
        }
    }
}

class LocalInnerClass {
    void display(){
        class InnerLocal{

            public void show(){
                System.out.println("Hey Hello I am Kunal");
            }
        }

        InnerLocal obj = new InnerLocal();
        obj.show();
    }
}

interface App{
    void display();
}
interface App1{
    void display();
}
class AnonumusInnerClass {
    
    public void show(){
        App obj = new App(){
            public void display(){
                System.out.println("Hey Hey App2");
            }
        };
        obj.display();
    }
    public void show2(){
        new App1(){
            public void display(){
                System.out.println("Hey Hey App2");
            }
        }.display();
    }
    
}

class StaticInnerClass {
   static class Innerclass{
        public void show(){
            System.out.println("Static class");
        }
        
   }
}

public class practice {
    public static void main(String[] args) {
        InnerClass.InnerPract obj = new InnerClass().new InnerPract(23);
        obj.display();
        
        LocalInnerClass obj1 = new LocalInnerClass();
        obj1.display();

        AnonumusInnerClass obj2 = new AnonumusInnerClass();
        obj2.show();
        obj2.show2();
        StaticInnerClass.Innerclass obj4 = new StaticInnerClass.Innerclass();
        obj4.show();
    }
}
