package tradearea.model;

public class ProductData {

    private String productId;
    private String productName;
    private String productCategory;
    private int productQuantity;
    private String productUnit;

    public ProductData(String productId, String productName, String productCategory, int productQuantity, String productUnit) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.productUnit = productUnit;
    }
    public  String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductUnit() {
        return productUnit;
    }
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }
}
