public class BasicOperation {
    public static void main(String[] args){
        try{
            int result = Calculate("/", 1, 2);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static int Calculate(String op, int v1, int v2){
        return op.equals("+") ? v1 + v2 : op.equals("-") ? v1 - v2 : op.equals("*") ? v1 * v2 : op.equals("/") ? v1 / v2 : 0;
    }
}
