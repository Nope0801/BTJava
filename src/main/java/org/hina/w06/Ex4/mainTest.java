package org.hina.w06.Ex4;


public class mainTest {
    public static void main(String[] args) {
        Cmpl c1 = new Cmpl(3, 4);
        Cmpl c2 = new Cmpl(1, -2);
        Cmpl c3 = new Cmpl(-5, 6);
        Cmpl c4 = new Cmpl(7, 0);
        Cmpl c5 = new Cmpl(0, -3);

        System.out.print("Addition Test:");
        System.out.println(c1 + " + " + c2 + "c2 = " + c1.addCmpl(c2));

        System.out.println("Modulus Test:");
        System.out.println("|{c1}| = " + c1.modCmpl());
        System.out.println("|{c3}| = " + c3.modCmpl());


        sCmpl listCmpl = new sCmpl();
        listCmpl.addCmpl(c1);
        listCmpl.addCmpl(c2);
        listCmpl.addCmpl(c3);
        listCmpl.addCmpl(c4);
        listCmpl.addCmpl(c5);

        System.out.println("\nComplex Number Collection:");
        listCmpl.printCmpls();

        System.out.println("\nAverage Complex Number:");
        System.out.println(listCmpl.avgAll());

        System.out.println("\nComplex Number with Max Modulus:");
        System.out.println(listCmpl.maxMod());

        System.out.println("\nCount of Non-Complex (Real) Numbers:");
        System.out.println(listCmpl.countNonCmpl());

        Cmpl a = new Cmpl(-1, 3);
        Cmpl b = new Cmpl(2, -5);
        Cmpl c = new Cmpl(-3, -7);
        System.out.println(b.mulCmpl(c).addCmpl(a));
    }
}
