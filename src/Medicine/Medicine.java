package Medicine;

public class Medicine {

    private String Name;
    private String presentation;
    private String usage;
    private Double quantity;
    private String quantitytype;
    private Integer stock;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getQuantitytype() {
        return quantitytype;
    }

    public void setQuantitytype(String quantitytype) {
        this.quantitytype = quantitytype;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
