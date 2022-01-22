package Lombok;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cat implements Serializable {
    private String name;
    private int age;
    private float weight;

    public void eat(){
        System.out.println("munch munch");
    }

    public Cat() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Cat)) return false;
        final Cat other = (Cat) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        if (Float.compare(this.getWeight(), other.getWeight()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Cat;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        result = result * PRIME + Float.floatToIntBits(this.getWeight());
        return result;
    }

    public String toString() {
        return "Cat(name=" + this.getName() + ", age=" + this.getAge() + ", weight=" + this.getWeight() + ")";
    }
}
