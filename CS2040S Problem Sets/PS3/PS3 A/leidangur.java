import java.util.*;
public class leidangur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        sc.close();
        int money = 0, gold = 0, jewels = 0;
        Stack<Character> order = new Stack<>();
        int len = in.length();
        boolean complete = true;
        for(int i = 0; i < len; i++){
            char curr = in.charAt(i);
            if(Character.isLowerCase(curr)){
                order.push(curr);
            } else if(Character.isUpperCase(curr)){
                Character c = Character.toLowerCase(curr);
                if(order.contains(c)){
                    while(!order.isEmpty() && order.peek() != c){
                        order.pop();
                    }
                    if(!order.isEmpty() && order.peek() == c){
                        order.pop();
                    }
                }else {
                    complete = false;
                }
            }
        }

        if(complete){
            while(!order.isEmpty()){
                char top = order.peek();
                if(top == 'p'){
                    money++;
                } else if(top == 'g'){
                    gold++;
                } else if(top == 'o'){
                    jewels++;
                }
            }
            System.out.println(money);
            System.out.println(gold);
            System.out.println(jewels);
        } else{
            System.out.println("Neibb");
        }
    }

}
