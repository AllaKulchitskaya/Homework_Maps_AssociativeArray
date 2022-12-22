package hw1_task2_product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product chicken = new Product("курица", 289.5, 2);
        Product potatoes = new Product("картофель", 64.9, 3);
        Product carrot = new Product("морковь", 25.9, 1);
        Product tomatoes = new Product("помидоры", 86.3, 1);
        Product rice = new Product("рис", 68.9, 1);
        Product onion = new Product("лук", 21.8, 1);

        Set <Product> products = new HashSet<>();
        ProductList productList = new ProductList(products);

        productList.addFood(rice);
        productList.addFood(chicken);
        productList.addFood(potatoes);
        productList.addFood(carrot);
        productList.addFood(onion);

        System.out.println(Arrays.toString(productList.getProductList().toArray()));

        Recipe pilaf = new Recipe("плов");
        pilaf.add(rice, 2);
        pilaf.add(chicken, 1);
        pilaf.add(carrot, 1);
        pilaf.add(onion, 1);

        Recipe pureeAndChicken = new Recipe("пюре с курицей");
        pureeAndChicken.add(potatoes, 1);
        pureeAndChicken.add(chicken, 1);

        Set<Recipe> recipeSet = new HashSet<>();
        RecipeList recipeList = new RecipeList(recipeSet);
        recipeList.addRecipe(pilaf);
        recipeList.addRecipe(pureeAndChicken);

        System.out.println(Arrays.toString(recipeList.getRecipeList().toArray()));
        System.out.println("Цена продуктов на блюдо " + pilaf.getRecipeName() + " - " +
                pilaf.getRecipeProductsPrice() + " руб.");
        System.out.println("Цена продуктов на блюдо " + pureeAndChicken.getRecipeName() + " - " +
                pureeAndChicken.getRecipeProductsPrice() + " руб.");

    }
}
