public class Warranty {
    private String warrantyCode;
    private String description;
    private String solution;
    private double cost;

    public Warranty(String warrantyCode, String description, String solution, double cost) {
        this.warrantyCode = warrantyCode;
        this.description = description;
        this.solution = solution;
        this.cost = cost;
    }

    public String getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(String warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return
                "Warranty Code = " + warrantyCode + '\n' +
                "Description = " + description + '\n' +
                "Solution = " + solution + '\n' +
                "Cost = " + cost + '\n'
                ;
    }
}
