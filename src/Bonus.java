public class Bonus {
    public static void main(String[] args) {

        int rub;
            rub = 100;


        long amount = 1001;
        long bonus = amount / rub;
        long limit = 1000;


        if (amount > limit) {
            bonus = amount / rub;
        }else{
            bonus = 0;
        }


        System.out.println(bonus);
    }
}