class Rectangle {
  private int width;
  private int height;
  public Rectangle(int w, int h) {
    this.width = w;
    this.height = h;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int h) {
    height = h;
  }
  public void setWidth(int newWidth) {
    width = newWidth;
  }
  public void setSize(int w, int h) {
    setWidth(w);
    setHeight(h);
  }
  public int calcArea() {
    return width*height;
  }
}

Rectangle rectangle = new Rectangle(3,6);
System.out.println("���� : " + rectangle.calcArea());
rectangle.setSize(5,8);
System.out.println("���� : " + rectangle.calcArea());