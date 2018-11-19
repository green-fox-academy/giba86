package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing position = new Thing("Stand up");
        Thing meal = new Thing("Eat lunch");

        position.complete();
        meal.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(position);
        fleet.add(meal);

        System.out.println(fleet);
    }
}