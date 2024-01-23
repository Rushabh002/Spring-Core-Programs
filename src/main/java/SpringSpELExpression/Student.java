package SpringSpELExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("#{730}")
    private int x;
    @Value("#{20}")
    private int y;
@Value("#{ new java.lang.String('Rushabh')}")
    private String name;

@Value("#{ 8-4 > 3}")
private boolean isActive;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
