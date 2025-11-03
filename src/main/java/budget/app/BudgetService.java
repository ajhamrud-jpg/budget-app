package budget.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BudgetService {

    public ArrayList<Category> categoryList = new ArrayList<>();

    boolean addCategories(List<Category> requestCategories){
        return categoryList.addAll(requestCategories);
    }
}
