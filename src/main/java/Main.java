public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Finally block cant be null bug");
            //change from 4th
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }
    
     public int myMethod(int i){
        return i;
    }

}
