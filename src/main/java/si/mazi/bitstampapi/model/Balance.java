package si.mazi.bitstampapi.model;

/**
 * @author Matija Mazi <br/>
 * @created 4/20/12 7:30 PM
 */
public class Balance {
    private double usd_balance;
    private double btc_balance;
    private double usd_reserved;
    private double btc_reserved;
    private double usd_available;
    private double btc_available;
    private double fee;

    public double getUsd_balance() {
        return usd_balance;
    }

    public void setUsd_balance(double usd_balance) {
        this.usd_balance = usd_balance;
    }

    public double getBtc_balance() {
        return btc_balance;
    }

    public void setBtc_balance(double btc_balance) {
        this.btc_balance = btc_balance;
    }

    public double getUsd_reserved() {
        return usd_reserved;
    }

    public void setUsd_reserved(double usd_reserved) {
        this.usd_reserved = usd_reserved;
    }

    public double getBtc_reserved() {
        return btc_reserved;
    }

    public void setBtc_reserved(double btc_reserved) {
        this.btc_reserved = btc_reserved;
    }

    public double getUsd_available() {
        return usd_available;
    }

    public void setUsd_available(double usd_available) {
        this.usd_available = usd_available;
    }

    public double getBtc_available() {
        return btc_available;
    }

    public void setBtc_available(double btc_available) {
        this.btc_available = btc_available;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Balance{usd_balance=%s, btc_balance=%s, usd_reserved=%s, btc_reserved=%s, usd_available=%s, btc_available=%s, fee=%s}", usd_balance, btc_balance, usd_reserved, btc_reserved, usd_available, btc_available, fee);
    }
}
