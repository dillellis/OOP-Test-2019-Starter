package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{
    public int values;
    public int ones;
    public int tens;
    public int hundreds;
    
    public Resistor(TableRow row)
    {
        values = row.getInt("values");
        this.values = values;
        this.ones = ones;
        this.tens = tens; 
        this.hundreds = hundreds;
    }

    /**
     * @return the values
     */
    public int getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(int values) {
        this.values = values;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }
}