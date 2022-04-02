package guide.example.chapter2;

public class LogicalOpTable {
    public static void main(String[] args) {

        boolean p, q;
        //displays 1's and 0's, rather than true and false
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;
        while(true){
            System.out.print(1);
        }

        //Book's version
        /*
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;q=true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        p = true;q=false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        p = false;q=true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        p = false;q=false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        */

        //My version
        /*
        System.out.println("P" + "\t" + "Q" + "\t" + "AND" + "\t" + "OR" + "\t" + "XOR" + "\t" + "NOT");
        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        */


    }
}
