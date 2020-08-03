public class helloworld {

    public static void main(String[] args) {
        helloworld h = new helloworld();
        String result = h.sayHi();
        System.out.println(result);
    }

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String yup) {
        return  "Hello " + yup.substring(0, 1).toUpperCase() + yup.substring(1);
    }
}
