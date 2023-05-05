import java.io.PrintStream;

class java
{
    public static void main(String args[])
    {
            int a=10,b=20;
            int c=a+b;
            if (System.out.getClass() == PrintStream.class) {
                System.out.writeln(String.valueOf(c));
            } else {
                synchronized (System.out) {
                    System.out.print(c);
                    System.out.newLine();
                }
            }
    }
}