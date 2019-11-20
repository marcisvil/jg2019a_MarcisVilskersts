package lv.jg.lesson8.homework3;

public class MathOperationsTest {

    public static void main(String[] args) {

        AddingOperation addingOperation = new AddingOperation();
        SubtractionOperation subtractionOperation = new SubtractionOperation();

        MathOperation[] myMathOperations = {addingOperation, subtractionOperation};

        MathOperations.executeAll(myMathOperations,12,56);
    }
}
