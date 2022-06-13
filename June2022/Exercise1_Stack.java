package June2022;



public class Exercise1_Stack {
    public static void main(String[] args){
    String str="()(";
    char[] stack=str.toCharArray();
    boolean a=true;
    int i=0;
    while(a){
        System.out.println(stack);
        if(stack.length==1){
            a=false;
            break;
        }
        if(stack[i]==')'){
            if(i==0){
                a=false;
                break;
            }
            if(stack.length==2){
                break;
            }else {
                stack = remove(stack, i);
                stack = remove(stack, i - 1);
                i -= 2;
            }
            }
        i++;
    }
    System.out.println(a);
    }
    public static char[] remove (char[] original,int index)
    {
        char[] result = new char[original.length-1];
        int last_insert = 0;
        for (int i = 0; i < original.length; i++){
            if (i == index){i++;}
            if(i==original.length){
                return result;
            }
            result[last_insert] = original[i];
            last_insert++;
        }
        return result;
    }
}