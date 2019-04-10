package ie.tudublin;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
	}
	
	public void loadColours() {
        Table table = loadTable("colours.csv", "header");

        

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            Colour.add(colour);
        }
	}
	
	public void printColours() {
        for (Colour colour : Colour) {
            System.out.println(colour);
        }
	}
	
	public Color findColour(int value) {

		return colour;
	}

	public void loadResistors() {
        Table table = loadTable("resistors.csv", "header");

        

        for (TableRow row : table.rows()) {
            Resistor resistors = new Resistor(row);
            Resistor.add(resistors);
        }
	}

	public void printResistors() {
        for (Resistor resistors : Resistor) {
            System.out.println(resistors);
		}
	}
	
	public void draw()
	{	
		line(width / 2 - (height / 13)*2, height / 13 * 2, width / 2 + (height / 13)*2, height / 13 * 2 );
		line(width / 2 - (height / 13)*2, height / 13 * 5, width / 2 + (height / 13)*2, height / 13 * 5 );
		line(width / 2 - (height / 13)*2, height / 13 * 8, width / 2 + (height / 13)*2, height / 13 * 8 );
		line(width / 2 - (height / 13)*2, height / 13 * 11, width / 2 + (height / 13)*2, height / 13 * 11 );
		
		rect((width / 2 - height / 13),height / 13, (height / 13) * 2, (height / 13) * 2);
		rect((width / 2 - height / 13),(height / 13) * 4, (height / 13) * 2, (height / 13) * 2);
		rect((width / 2 - height / 13),(height / 13) * 7, (height / 13) * 2, (height / 13) * 2);
		rect((width / 2 - height / 13),(height / 13) * 10, (height / 13) * 2, (height / 13) * 2);

	
		   //text(Resistor, width - height / 13,  height / 13 * 2 );
		
		   
		   
		
	}

	private ArrayList<Colour> Colour = new ArrayList<Colour>();

	private ArrayList<Resistor> Resistor = new ArrayList<Resistor>();
}
