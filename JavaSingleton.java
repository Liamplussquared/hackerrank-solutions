//https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
public class Singleton{
    public String str;
    
    private Singleton() {
        this.str = "Hello world!";
    }
    
    public static Singleton getSingleInstance() {
        Singleton singleton = new Singleton();
        return singleton;
    }
}