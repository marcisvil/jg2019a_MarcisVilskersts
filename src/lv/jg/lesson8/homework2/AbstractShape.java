package lv.jg.lesson8.homework2;

public abstract class AbstractShape implements Shape{

    protected abstract double getPerimeter();
    protected abstract double getRadius();
    protected abstract double getEdgeCount();

    //toString metodei ir jāatgriež objekta stāvokis tipā String
    //stāvoklis būtu, name, radius utt.
    //metodei būt jāsaucas printMe vai kā līzīgi
    @Override
    public String toString(){
        return "\nShape is called " + getName()
                + "\nand it's area is " + getArea();
    }

}
