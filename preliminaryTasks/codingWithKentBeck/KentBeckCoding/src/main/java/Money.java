public abstract class Money {
    protected int amount;
    protected String currency;
    public abstract Money times(int multiplier);

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return this.amount == dollar.amount && this.getClass().equals(object.getClass());
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
}
