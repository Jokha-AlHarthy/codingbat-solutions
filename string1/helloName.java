public class helloName {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //helloName("Bob") → "Hello Bob!"
    //helloName("Alice") → "Hello Alice!"
    //helloName("X") → "Hello X!"
    public static void main(String[]args){
        helloName name = new helloName();
        System.out.println(name.helloName("Bob"));
        System.out.println(name.helloName("Alice"));
        System.out.println(name.helloName("X"));
    }
}
