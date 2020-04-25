public class RunClient {

    public static void main(String[] args){

        // The PlainWings object is sent to the sauce constructor upon instantiation

        Wings buffaloWings = new Buffalo(new PlainWings());
        System.out.println("Menu Item: " + buffaloWings.getName());
        System.out.println("Description: " + buffaloWings.getDescription());
        System.out.println("Total Price: $" + buffaloWings.getCost());
        System.out.println();

        Wings barbecueWings = new Barbecue(new PlainWings());
        System.out.println("Menu Item: " + barbecueWings.getName());
        System.out.println("Description: " + barbecueWings.getDescription());
        System.out.println("Total Price: $" + barbecueWings.getCost());
        System.out.println();

        Wings teriyakiWings = new Teriyaki(new PlainWings());
        System.out.println("Menu Item: " + teriyakiWings.getName());
        System.out.println("Description: " + teriyakiWings.getDescription());
        System.out.println("Total Price: $" + teriyakiWings.getCost());
        System.out.println();
    }

}