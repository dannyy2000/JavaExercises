package chapter10_exercices.PayrollSystem;

import chapter10_exercices.PayrollSystem.Employee;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String ssn, double wage, int pieces) {
        super(firstName, lastName, ssn);
        validateWage(wage);
        validateNumberOfPieces(pieces);
        this.wage = wage;
        this.pieces = pieces;
    }

    private void validateNumberOfPieces(int pieces) {
        if(pieces < 0.0) throw new IllegalArgumentException("Number of pieces must be >= 0.0");
    }

    private void validateWage(double wage) {
        if(wage < 0.0) throw new IllegalArgumentException("wage must be >= 0.0");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        validateWage(wage);
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        validateNumberOfPieces(pieces);
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f%n%s: %d%n%s :$%.2f","Piece worker",
                super.toString(),"Wage per piece",getWage(),"Number of pieces",getPieces(),
                "The total earnings",earnings());
    }
}
