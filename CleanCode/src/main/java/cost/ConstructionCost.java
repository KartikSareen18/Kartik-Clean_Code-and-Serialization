package cost;

public class ConstructionCost {

    private static final int standardMaterial = 1000;
    private static final int mediumStandardMaterial = 1500;
    private static final int highStandardMaterial = 2000;
    private static final int highMaterialCostWithAutomation = 2500;

    private static String[] materialsList = new String[]{"Standard Material", "Medium Standard Material", "High Standard Material"};

    public static double calculateConstructionCost(String selectedMaterial, double area, boolean requireAutomation )
    {
        if (area == 0) {
            throw new RuntimeException();
        }
        
        else if(selectedMaterial.equalsIgnoreCase(materialsList[0])) {
            double ans = area * standardMaterial;
            return ans;
        }

        else if(selectedMaterial.equalsIgnoreCase(materialsList[1])) {
            double ans = area * mediumStandardMaterial;
            return ans;
        }

        else if (selectedMaterial.equalsIgnoreCase(materialsList[2]))
        {
            double ans;
            if (requireAutomation) {
                ans = area * highMaterialCostWithAutomation;
                return ans;
            }
            ans = area*highStandardMaterial;
            return ans;
        }
        else
            throw new RuntimeException();

    }

    public static String[] getMaterialsList() {
        return materialsList;
    }

}

