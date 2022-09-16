public enum ExchangeRate {
    PLN_EUR(0.21),
    PLN_USD(0.22),
    EUR_PLN(4.69),
    EUR_USD(1.03),
    USD_PLN(4.53),
    USD_EUR(0.97);

    private final double ratio;

    ExchangeRate(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}

