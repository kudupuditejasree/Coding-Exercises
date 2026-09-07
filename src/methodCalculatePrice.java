public class methodCalculatePrice {
    static  double calculatePrice(int quantity,double price,boolean isMember){
        double totalPrice=quantity*price;
        if(isMember){
            totalPrice-=totalPrice*0.15;
        }
        return  totalPrice;
    }

    public static void main(String[] args) {
       double result= calculatePrice(3,250,true);
        double result1= calculatePrice(2,100,false);

        System.out.println(result);
        System.out.println(result1);

    }
}
