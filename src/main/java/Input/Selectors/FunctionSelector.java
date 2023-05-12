package Input.Selectors;

import Functions.AbstractFunction;
import Functions.FunctionsStorage;
import Input.InputMenu;

public class FunctionSelector extends AbstractSelector implements InputMenu {

    @Override
    public void getUserInput() {
        boolean check;
        do {
            printer.print("Функции на выбор:");
            printChoices();
            printer.print("Выберите функцию (введите '1', '2' или '3'):");
            check = inputChecker(scanner.nextLine().trim());
            if (!check) {
                printer.print("Введено неверное значение");
            }
        }
        while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        switch (input) {
            case "1":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[0]);
                return true;
            case "2":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[1]);
                return true;
            case "3":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[2]);
                return true;
            case "test":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[3]);
                return true;
            default:
                return false;
        }
    }

    @Override
    public void printChoices() {
        AbstractFunction[] functions = FunctionsStorage.getFUNCTIONS();
        for (int i = 0; i < functions.length; i++) {
            printer.print((i+1) + " - " + functions[i].getStringRepresentation());
        }
    }
}
