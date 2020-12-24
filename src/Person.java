
public class Person {
    private String _first;
    private String _last;
    private int _pesel;
    private double _payment;

    public Person(String first, String last, int pesel, double payment) {
        _first = first;
        _last = last;
        _pesel = pesel;
        _payment = payment;
    }

    public String getFirst() {
        return _first;
    }

    public String getLast() {
        return _last;
    }

    public int getPesel() {
        return _pesel;
    }

    public double getPayment() {
        return _payment;
    }

    public String toString() {
        return String.format("%-10s %-10s %8d %10.2f", _first, _last, _pesel, _payment);
    }
}
