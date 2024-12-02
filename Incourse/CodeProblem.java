public interface A{
    public void printA();
}

//class Simple extends A is wrong
abstract class Simple implements A{
    //static context error both variable and method must be static
    static int x = 10;
    static void access(){
        System.out.println("x = " + x);
    }
    //abstract void simplePrint() is wrong we cannot declare an abstract method in a non-abstract class
    //So Sipmle class must be an abstruct class
    abstract void simplePrint();
}

public class CodeProblem{
    //public void main(String [] args){ main method must be static
        public static void main(String[] args) {
            //Simple x = new Simple() is wrong because we cannot instantiate an abstract class
            //we must create an instance of a subclass
            //we cannot remove abstract keyword as it implements an interface
            Simple s = new SimpleSubclass();
            s.simplePrint();
        }
}

//new subclass of abstract class Simple
class SimpleSubclass extends Simple{
    void simplePrint(){
        System.out.println("Simple print");
    }
}

//Filename: CodeProblem.java