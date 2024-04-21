

class StackOverflowException extends Exception{
    public String toString(){
        return ("StackOverflowException: Stack has been overflowed");
    }
}
class StackUnderflowException extends Exception{
    public String toString(){
        return ("StackUnderflowException: Stack has been Underflowed");
    }
}

class Stack{
    int []arr = new int[7];
    int top = -1;
    int end = arr.length;
    public void push(int value) throws StackOverflowException{
        if(top < end - 1){
            top++;
            arr[top] = value;
        }
        else{

            throw new StackOverflowException();
        }
    }
    public void pop() throws StackUnderflowException{
        if(top == -1){
            throw new StackUnderflowException();
        }
        else{
            arr[top] = 0;
            top--;
        }
    }
    public void print(){
        for(Integer i: arr){
            System.out.print(i +" ");
        }
    }
}


public class Task {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try{
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            stack.push(12);
            // stack.push(122);
            // stack.push(123);
            // stack.push(123);
            // stack.push(123);
            stack.pop();
            stack.pop();
        }
        catch(StackOverflowException e){
            System.out.println(e);
        }
        catch(StackUnderflowException e){
            System.out.println(e);
        }
      

        stack.print();
    }
}
