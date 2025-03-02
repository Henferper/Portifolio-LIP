import java.awt.*;

public class Rectangle extends Shape {

    //Atributes
    private int width;
    private int height;

    //Constructors
    public Rectangle() {
        this.width = super.r.nextInt(91)+10;
        this.height = super.r.nextInt(91)+10;
    }
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, int x, int y, int speedX, int speedY,int width, int height){
        super(color,x,y,speedX,speedY);
        this.height=height;
        this.width=width;
    }
    //Methods
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillRect(super.getX(),super.getY(),this.width,this.height);
    }

    @Override
    public void move(int screenWidth,int screenHeight){
        super.move(screenWidth,screenHeight);
        //Collision Treatment
        if(super.getX()<0 || super.getX()+this.width>screenWidth)
            super.setSpeedX(super.getSpeedX()*-1);

        if(super.getY()<0 || super.getY()+this.height>screenHeight)
            super.setSpeedY(super.getSpeedY()*-1);
    }

    //Getters & Setters


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //toString();
                     @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+
                super.toString();
    }
}
