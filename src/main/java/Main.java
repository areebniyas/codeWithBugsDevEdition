public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }

}