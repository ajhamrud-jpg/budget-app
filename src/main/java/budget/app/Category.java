package budget.app;

import java.math.BigDecimal;

public class Category{
    public String name;
    public BigDecimal budget;
    public BigDecimal spending;
    public boolean isOverBudget;

    public Category(
            String name,
            BigDecimal budget
    ){
        this.name = name;
        this.budget = budget;
        this.spending = BigDecimal.ZERO;
        this.isOverBudget = false;
    }

    public String toString(){
        return "Name: %s, Budget: %s, Spending: %s".formatted(name, budget, spending);
    }
}
