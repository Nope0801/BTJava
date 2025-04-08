package org.hina.w06.Ex4;

public class Cmpl implements Comparable<Cmpl>{
    private double inte;
    private double comp;

    public Cmpl () {
        this.inte = 1.0;
        this.comp = - 1.0;
    }

    public Cmpl (double inte, double comp) {
        this.inte = inte;
        this.comp = comp;
    }

    public Cmpl(Cmpl cmpl) {
        this.inte = cmpl.inte;
        this.comp = cmpl.comp;
    }

    public double getInte() {
        return inte;
    }

    public void setInte(double inte) {
        this.inte = inte;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public Cmpl addCmpl(Cmpl other) {
        double nInte = this.inte + other.inte;
        double nComp = this.comp + other.comp;
        return new Cmpl(nInte, nComp);
    }

    public Cmpl subCmpl(Cmpl other) {
        double nInte = this.inte - other.inte;
        double nComp = this.comp - other.comp;
        return new Cmpl(nInte, nComp);
    }

    public Cmpl mulCmpl(Cmpl other) {
        double nInte = this.inte * other.inte - this.comp * other.comp;
        double nComp = this.inte * other.comp + this.comp * other.inte;
        return new Cmpl(nInte, nComp);
    }

    public Cmpl divCmpl(Cmpl other) {
        double denominator = other.inte * other.inte + other.comp * other.comp;
        double nInte = (this.inte * other.inte + this.comp * other.comp) / denominator;
        double nComp = (this.comp * other.inte - this.inte * other.comp) / denominator;
        return new Cmpl(nInte, nComp);
    }

    public double modCmpl() {
        return Math.sqrt(inte * inte + comp * comp);
    }

    @Override
    public String toString() {
        return inte + " + " + comp + "i";
    }

    @Override
    public int compareTo(Cmpl other) {
        double left = modCmpl();
        double right = other.modCmpl();
        return Double.compare(left, right);
    }
}
