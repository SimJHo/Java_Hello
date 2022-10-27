
public class ForInForPrac {
    public static void main(String[] args) {       
        //구구단 짝수단만
        for(int i = 2; i <= 9; i++) {
            if(i % 2 == 1)
                continue;
            
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        
        // 구구단 3의 배수인 단만
        for(int i = 2; i <= 9; i++) {
            if(i % 3 != 0)
                continue;
            
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        
        //별찍기
        for(int i = 1; i <= 5; i++) {            
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}