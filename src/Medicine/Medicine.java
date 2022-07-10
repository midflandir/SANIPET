package Medicine;

public class Medicine {

    private String Name;
    private Presentation presentation;
    private Usage usage;
    private Double quantity;
    private Quantitytype quantitytype;
    private Integer stock;

    public Medicine(String name, Presentation presentation, Usage usage, Double quantity, Quantitytype quantitytype, Integer stock) {
        Name = name;
        this.presentation = presentation;
        this.usage = usage;
        this.quantity = quantity;
        this.quantitytype = quantitytype;
        this.stock = stock;
    }

    public Medicine() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Medicine.Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Medicine.Presentation presentation) {
        this.presentation = presentation;
    }

    public Medicine.Usage getUsage() {
        return usage;
    }

    public void setUsage(Medicine.Usage usage) {
        this.usage = usage;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Medicine.Quantitytype getQuantitytype() {
        return quantitytype;
    }

    public void setQuantitytype(Medicine.Quantitytype quantitytype) {
        this.quantitytype = quantitytype;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
