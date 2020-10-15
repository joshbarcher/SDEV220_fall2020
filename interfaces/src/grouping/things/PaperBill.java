package grouping.things;

import grouping.shared_types.Burnable;
import grouping.shared_types.Valuable;

import java.time.LocalDate;

public class PaperBill implements Valuable, Burnable
{
    private LocalDate dateIssued;
    private double value;

    public PaperBill(LocalDate dateIssued, double value)
    {
        this.dateIssued = dateIssued;
        this.value = value;
    }

    @Override
    public double calculateValue()
    {
        return value;
    }

    @Override
    public void burn()
    {
        System.out.println("You burned the " + value + " dollar bill");
    }

    @Override
    public String toString()
    {
        return "A " + value + " bill printed on " + dateIssued;
    }
}
