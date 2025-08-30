public class Main {
    public static void main(String[] args) {
        // Create walls
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Create ceiling
        Ceiling ceiling = new Ceiling(10, 5); // height 10, paintedColor 5

        // Create bed
        Bed bed = new Bed("Modern", 2, 5, 1, 1);

        // Create lamp
        Lamp lamp = new Lamp("Classic", true, 60);

        // Create bedroom
        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        // Print bedroom details
        System.out.println("Bedroom Name: My Bedroom");

        System.out.println("Walls:");
        System.out.println(" - " + wall1.getDirection());
        System.out.println(" - " + wall2.getDirection());
        System.out.println(" - " + wall3.getDirection());
        System.out.println(" - " + wall4.getDirection());

        System.out.println("Ceiling Height: " + ceiling.getHeight());
        System.out.println("Ceiling Painted Color: " + ceiling.getPaintedColor());

        System.out.println("Bed Style: " + bed.getStyle());
        System.out.println("Bed Pillows: " + bed.getPillows());
        System.out.println("Bed Height: " + bed.getHeight());
        System.out.println("Bed Sheets: " + bed.getSheets());
        System.out.println("Bed Quilt: " + bed.getQuilt());

        System.out.println("Lamp Style: " + lamp.getStyle());
        System.out.println("Lamp Battery Powered: " + lamp.isBattery());
        System.out.println("Lamp Glob Rating: " + lamp.getGlobRating());

        // Test methods
        bedroom.makeBed();
        System.out.println(); // line break
        bedroom.getLamp().turnOn();
    }
}

/*
 * This program demonstrates a simple bedroom model using object-oriented programming.
 * It includes classes for Bedroom, Wall, Ceiling, Bed, and Lamp.
 * In the main method, we create a bedroom with all its components, display their details,
 * make the bed, and turn on the lamp. This shows how objects can be composed and interact.
 */

