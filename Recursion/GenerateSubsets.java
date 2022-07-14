public class GenerateSubsets {
    public static void printSubsets(String str, String curr, int index){
        if(index == str.length()){
            System.out.println(curr+" ");
            return;
        }
        printSubsets(str, curr, index + 1);
        printSubsets(str, curr+str.charAt(index), index + 1);
    }
    public static void main(String[] args) {
        String name = "ABC";
        printSubsets(name, "", 0);
        
    }
}
