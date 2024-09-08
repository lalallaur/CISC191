// Sorry for the late submissions. I am still stuck on how to make my Constructor  'TaxTableTools(int[], double[])' be used within my code.

import java.util.Scanner;

public class TaxTableTools {

    /**
     * This class searches the 'search' table with a search argument and
     * returns the corresponding value in the 'value' table. Variable
     * 'nEntries' has the number of entries in each table.
     */
    private int[] search; // = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
    // array to store salary ranges
    private double[] value; // = {0.0, 0.10, 0.20, 0.30, 0.40};
    // array tostore corresponding tax rates
    private int nEntries;
    // varaibles to store number of entries in arrays

    // ***********************************************************************

    // default constructor that intializes default salary ranges and tax rates
    public TaxTableTools() {
        this.search = new int [] {0, 20000, 50000, 100000, Integer.MAX_VALUE}; // default salary ranges
        this.value = new double [] {0.0, 0.10, 0.20, 0.30, 0.40}; // default tax rates
        this.nEntries = search.length;  // Set the length of the search table
    }

    // ***********************************************************************

    // overloaded constructor
    public TaxTableTools(int[] customSearch, double[] customValue) {
        this.search = customSearch; // set custom salary ranges
        this.value = customValue; // set custom tac rates
        this.nEntries = customSearch.length; // set number of entries based on custom search
    }

    // ***********************************************************************

    // setter method to update salary ranges and tax rates
    public void setTables(int[] newSearch, double[] newValue) {
        this.search = newSearch; // set new salary ranges
        this.value = newValue; // set new salary ranges
        this.nEntries = newSearch.length; // update number of entries
    }

    // ***********************************************************************

    public double getValue(int searchArgument) { // method to get tax rate based on salary
        double result;
        boolean keepLooking;
        int i;

        result = 0.0;
        keepLooking = true;
        i = 0;

        while ((i < nEntries) && keepLooking) {
            if (searchArgument <= search[i]) {
                result = value[i]; // set result to corresponding tax rate
                keepLooking = false;
            } else {
                ++i;
            }
        }

        return result;
    }
}
