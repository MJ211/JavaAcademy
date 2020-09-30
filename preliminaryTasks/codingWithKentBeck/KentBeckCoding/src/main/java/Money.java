public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
    public String currency() {
        return currency;
    }
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(money.currency);
    }
}

