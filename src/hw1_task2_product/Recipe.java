package hw1_task2_product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private final Map<Product, Integer> recipeProducts;
    private double recipeProductsPrice;
    private final String recipeName;

    public Recipe(String recipeName) {
        this.recipeProducts = new HashMap<>();
        this.recipeProductsPrice = 0;
        if (StringUtils.isValid(recipeName)) {
            recipeName = "название рецепта не указано";
        }
        this.recipeName = recipeName;
    }

    public void add(Product product, int amount) {
        if (recipeProducts.containsKey(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке");
        }
        recipeProducts.put(product, amount);
        recipeProductsPrice += product.getPrice() * amount;
    }
    public void add(Product product) {
        add(product, 1);
    }

    public Map<Product, Integer> getRecipeProducts() {
        return recipeProducts;
    }

    public double getRecipeProductsPrice() {
        return recipeProductsPrice;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return recipeName;
    }
}
