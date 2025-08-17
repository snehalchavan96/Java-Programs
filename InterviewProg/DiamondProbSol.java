interface I1 {
    void m1();
}

interface I2 {
    void m1();
}

public class DiamondProbSol implements I1, I2 {
    // Only one implementation is needed (resolves diamond problem)
    public void m1() {
        System.out.println("from m1() of class DiamondProbSol");
    }

    public static void main(String[] args) {
        DiamondProbSol p1 = new DiamondProbSol();
        p1.m1(); // calls the single implementation
    }
}
