package budget.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BudgetService {

    public ArrayList<Category> categoryList = new ArrayList<>();

    boolean addCategories(List<Category> requestCategories){
        return categoryList.addAll(requestCategories);
    }

    boolean spend(Category category, BigDecimal moneyToSpend){
        category.spending = category.spending.add(moneyToSpend);
        if (category.spending.add(moneyToSpend).compareTo(category.budget) > 0){
            category.isOverBudget = true;
        }
        else {
            category.isOverBudget = false;
        }
        return category.isOverBudget;
    }
}
