import java.util.*;

public class ScaleRecipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        for (int i = 1; i <= cases ; i++) {
            int numIngredients = scanner.nextInt();
            int recipePortions = scanner.nextInt();
            int desiredPortions = scanner.nextInt();

            ArrayList<BakersIngredient> ingredients = new ArrayList<>();

            double scale = (double) desiredPortions / recipePortions;

            double scaledWeight = 0.0;

            for (int j = 0; j < numIngredients; j++) {
                String name = scanner.next();
                double weight = scanner.nextDouble();
                double percentage = scanner.nextDouble();

                ingredients.add(new BakersIngredient(name, weight, percentage));


                if (percentage == 100.0) {
                    //ingredients.add(0, new BakersIngredient(name, weight, percentage));
                    scaledWeight = weight * scale;
                } /*else {
                    ingredients.add(new BakersIngredient(name, weight, percentage));
                }*/
            }

            System.out.println("Recipe # " + i);
            for (BakersIngredient ingredient : ingredients) {
                if (ingredient.percent == 100.0) {
                    System.out.println(ingredient.name + " " + scaledWeight);
                } else {
                    String test = String.format("%.1f", (ingredient.percent * scaledWeight) / 100);
                    System.out.println(ingredient.name + " " + test);
                }
            }

            for (int l = 0; l < 40; l++) {
                System.out.print("-");
                System.out.println();
            }
        }
    }

    static class BakersIngredient {
        String name;
        double weight;
        double percent;

        public BakersIngredient(String name, double weight, double percent) {
            this.name = name;
            this.weight = weight;
            this.percent = percent;
        }
    }
}
