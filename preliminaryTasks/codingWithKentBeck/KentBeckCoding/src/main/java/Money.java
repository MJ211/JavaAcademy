public abstract class Money {
    protected int amount;
    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return this.amount == dollar.amount && this.getClass().equals(object.getClass());
    }
    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
