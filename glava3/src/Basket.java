 class Basket {
    void pay(double money){
        System.out.println("оплачено наличными" + " " + money);
    }
    void  pay (String cardNum){
        System.out.println("оплачено кредитной картой#"  + cardNum);
    }
    void  pay(String accountNum, String bankCode){
        System.out.println("Переведено на счёт #" + accountNum +" " + "в банке" + " " + bankCode);
    }
}
class BasketDemo{
    public static void main(String[] args) {
        Basket b1=new Basket();
        Basket b2=new Basket();
        Basket b3=new Basket();
        System.out.println("b1:");
        b1.pay(1200.0); //Nali4ka
        System.out.println("b2");
        b2.pay("123456789"); //Kreditka
        System.out.println("b3");
        b3.pay("987654321","5500");//Perevod kuda-to

    }
}