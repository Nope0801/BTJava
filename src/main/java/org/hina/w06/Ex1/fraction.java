package org.hina.w06.Ex1;

public class fraction implements Comparable<fraction> {

    private int ts;
    private int ms;

    public fraction() {
        this.ts = 0;
        this.ms = 1;
    }

    public fraction(int ts, int ms) {
        if (ms == 0) {
            System.out.println("Mau so khong hop le");
        } else {
            this.ms = ms;
            this.ts = ts;
            smpfy();
        }
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
        smpfy();
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
        smpfy();
    }

    public void smpfy() {
        int gcd = gcd(Math.abs(ts), Math.abs(ms));
        ts /= gcd;
        ms /= gcd;

        if (ms < 0) {
            ts = -ts;
            ms = -ms;
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        if (ms == 1) {
            return ts + "";
        }
        return ts + "/" + ms;
    }

    @Override
    public int compareTo(fraction o) {
        if (o == null) {
            return -1;
        }
        int a1 = ts * o.ms;
        int a2 = ms * o.ts;
        return a1 - a2;
    }

    public fraction plus(fraction frac) {
        return new fraction(
                ts * frac.ms + ms * frac.ts,
                ms * frac.ms
        );
    }

    public boolean isN() {
        return ms == 1;
    }
}
