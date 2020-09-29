public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return this.amount == dollar.amount;
    }
}
