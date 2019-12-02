package lv.jg.lesson8.homework3;

//Ok
public class MathOperations {

    public static void executeAll(MathOperation[] mathOperations, double numberOne, double numberTwo) {

        for (MathOperation operation: mathOperations){
            System.out.println(operation.execute(numberOne, numberTwo));;
        }
    }
}
