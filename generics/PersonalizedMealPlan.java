package com.bridgelabz.generics;



import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealType();
    String getMeals();
}

class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public String getMeals() {
        return "Grilled Veggies, Paneer Curry, Lentil Soup";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public String getMeals() {
        return "Tofu Stir-fry, Avocado Salad, Quinoa Bowl";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public String getMeals() {
        return "Grilled Chicken, Egg Salad, Avocado Smoothie";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public String getMeals() {
        return "Steak, Chickpea Salad, Protein Shake";
    }
}

class Meal<T extends MealPlan> {
    private List<T> mealPlans = new ArrayList<>();

    public void addMeal(T meal) {
        mealPlans.add(meal);
    }

    public void showMeals() {
        for (T meal : mealPlans) {
            System.out.println(meal.getMealType() + " Plan: " + meal.getMeals());
        }
    }
}

class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated Meal Plan: " + meal.getMealType() + " - " + meal.getMeals());
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        Meal<VeganMeal> veganPlan = new Meal<>();
        Meal<KetoMeal> ketoPlan = new Meal<>();
        Meal<HighProteinMeal> highProteinPlan = new Meal<>();

        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal proteinMeal = new HighProteinMeal();

        vegetarianPlan.addMeal(vegMeal);
        veganPlan.addMeal(veganMeal);
        ketoPlan.addMeal(ketoMeal);
        highProteinPlan.addMeal(proteinMeal);

        System.out.println("Meal Plans:");
        vegetarianPlan.showMeals();
        veganPlan.showMeals();
        ketoPlan.showMeals();
        highProteinPlan.showMeals();

        System.out.println("\nGenerating Personalized Meal Plans:");
        MealPlanGenerator.generateMealPlan(vegMeal);
        MealPlanGenerator.generateMealPlan(veganMeal);
        MealPlanGenerator.generateMealPlan(ketoMeal);
        MealPlanGenerator.generateMealPlan(proteinMeal);
    }
}
