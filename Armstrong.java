 public class Armstrong {
    public static boolean isArmstrong(int number){
        int sum=0;
        int originalnumber=number;
        int numdigits=String.valueOf(number).length();
        while(number>0){
            int digit = number%10;
            sum += Math.pow(digit,numdigits);
            number /= 10;
        }
        return sum == originalnumber;
    }
    public static void printArmstronginrange(int start,int end){
        System.out.println(" Armstrong numbers between " + start+"and"+end+ ":");
        for(int i=start;i<=end;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int start =100;
        int end=999;
        printArmstronginrange(start,end);
    }
}
    
            
        
    
    
        
    

