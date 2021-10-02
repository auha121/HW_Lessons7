import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();
            System.out.println("Введите 1 для получения погоды на сегодня; Введите 5 для прогноза на 5 дней; Для выхода введите 0: ");
            String command = scanner.nextLine();
            if (command.equals("0")) {
                System.out.println("Завершение программы...");
                break;
            }
            else if ((command.equals("1") == true) || (command.equals("5") == true)) {
                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Вы ввели некоректное значение выбора");
            }
            /*String cityKey;
            if (cityKey == "") {
                System.out.println("Некорректное название города. Такой город не найден");
            }
            else {
                System.out.println("Введите 1 для получения погоды на сегодня; Введите 5 для прогноза на 5 дней; Для выхода введите 0: ");
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    System.out.println("Завершение программы...");
                    break;
                }
                else if ((command.equals("1") == true) || (command.equals("5") == true)) {
                    try {
                        controller.getWeather(command, city);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Вы ввели некоректное значение выбора");
                }
            }*/
        }
    }
}