package grouping;

import java.time.LocalDate;

public class PaperBill
{
    private LocalDate dateIssued;
    private double value;

    public PaperBill(LocalDate dateIssued, double value)
    {
        this.dateIssued = dateIssued;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "A " + value + " bill printed on " + dateIssued;
    }
}
