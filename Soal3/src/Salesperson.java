public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + "\t" + totalSales;
    }

    @Override
    public boolean equals (Object other) {
        if (!(other instanceof Salesperson)) {
            return false; // Periksa tipe objek
        }
        
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        // Pastikan objek yang dibandingkan adalah Salesperson
        if (!(other instanceof Salesperson)) {
            throw new ClassCastException("Invalid object type for comparison");
        }
    
        Salesperson otherSalesperson = (Salesperson) other;
    
        // Bandingkan totalSales secara menurun
        if (totalSales != otherSalesperson.getSales()) {
            return otherSalesperson.getSales() - totalSales; // Pembalikan urutan
        }
    
        // Jika total sales sama, bandingkan lastName secara menaik (abjad)
        int lastNameComparison = lastName.compareTo(otherSalesperson.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison; 
        }
    
        // Jika lastName juga sama, bandingkan firstName secara menaik (abjad)
        return firstName.compareTo(otherSalesperson.getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
