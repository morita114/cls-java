interface Payment {
    void pay(int amount);
    String getMethodName();
}

class CreditCard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("クレジットカードで" + amount + "円を支払いました。");
    }

    @Override
    public String getMethodName() { return "クレジットカード"; }
}

class Cash implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("現金で" + amount + "円を支払いました。");
    }

    @Override
    public String getMethodName() { return "現金"; }
}

class PayPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("PayPayで" + amount + "円を支払いました。");
    }

    @Override
    public String getMethodName() { return "PayPay"; }
}

class Checkout {
    private Payment payment;

    Checkout(Payment payment) {
        this.payment = payment;
    }

    void execute(int amount) {
        System.out.println("【支払い方法：" + payment.getMethodName() + "】");
        payment.pay(amount);
    }
}

class Ex2Payment {
    public static void main(String[] args) {
        Checkout[] checkouts = {
            new Checkout(new CreditCard()),
            new Checkout(new Cash()),
            new Checkout(new PayPay())
        };

        for (Checkout c : checkouts) {
            c.execute(1000);
        }
    }
}
