package products;

public abstract class Product {

  static int localID = 0;
  int productID;
  private float price;

  //region GET/SET
  public int getLocalID() {
    return localID;
  }

  public int getProductID() {
    return productID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public static void setLocalID(int localID) { Product.localID = localID;


  }

  //endregion

  public void newID(){
    this.productID = localID;
    localID += 1;
  }
}
