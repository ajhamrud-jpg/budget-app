package budget.app;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    static void main() {
        System.out.println("Welcome to our budgeting app!");

        BudgetService budgetService = new BudgetService();
        System.out.println("Your categories are: %s.".formatted(budgetService.categoryList));

        List<Category> requestCategories = List.of(
                new Category("fooooooooD", new BigDecimal("100.00")));

        if (budgetService.addCategories(requestCategories)){
            System.out.println("Categories Added");
            System.out.println("Your new categories are: %s.".formatted(budgetService.categoryList));
        }



    }
}
