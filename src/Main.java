import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привіт, відважний герою!");
        System.out.println("Тебе чекає цікава подорож");
        System.out.println("На старті маєш: здоров'я 100 та удачі 50");
        System.out.println("Почнемо");
        System.out.println("Ти йшов чарівною стежкою, і натрапив на роздоріжжя: 1 - піти наліво, 2 - піти направо");
        System.out.println("Введи будь-яку цифру ");

        int health = 100;
        int luck = 50;
        int choice1 = scanner.nextInt();
        if (choice1 == 1) {
            System.out.println("Ти обрав піти наліво");
            health = health - 20;
            System.out.println("Ти втратив 20 очків здоров'я");
            System.out.println("Залишок здоров'я " + health);
        } else if (choice1 == 2) {
            System.out.println("Ти обрав піти направо");
            luck = luck + 30;
            System.out.println("Ти знайшов скарб і отримав 30 очків удачі");
            System.out.println("Залишок удачі " + luck);
        } else {
            System.out.println("Ти заплутався");
            health = health - 10;
            System.out.println("Втрачаєш 10 очків здоров'я");
            System.out.println("Залишок здоров'я " + health);
        }

        System.out.println("Ти натрапив на загадковий колодязь");
        System.out.println("Введи цифру від 1 до 3-х");
        health = health;
        luck = luck;
        int choice2 = scanner.nextInt();
        if (choice2 == 1) {
            System.out.println("Ти п'єш магічну воду і отримуєш 50 очків здоров'я");
            health = health + 50;
            System.out.println("Залишок здоров'я " + health);
        } else if (choice2 == 2) {
            System.out.println("Ти втомився і втрачаєш 10 очків удачі");
            luck = luck - 10;
            System.out.println("Залишок удачі " + luck);
        } else {
            System.out.println("Вибір не вплинув на баланс очків");
            System.out.println("Залишок здоров'я " + health + " та удачі " + luck);
        }

        System.out.println("Ти зустрів магічну істоту");
        System.out.println("Введи цифру від 1 до 3-х");
        health = health;
        luck = luck;
        int choice3 = scanner.nextInt();
        if (choice3 == 1) {
            System.out.println("Істота ділиться їжею. Ти отримуєш 20 очків здоров'я");
            health = health + 20;
            System.out.println("Залишок здоров'я " + health);
        } else if (choice3 == 2) {
            System.out.println("Істота атакує і ти втрачаєш 10 очків здоров'я ");
            health = health - 10;
            System.out.println("Залишок здоров'я " + health);
        } else {
            System.out.println("Істота байдужа, баланс очків не змінився ");
            System.out.println("Залишок здоров'я " + health + " та удачі " + luck);
        }
        System.out.println("Поточний стан гравця");
        System.out.println("Здоров'я " + health);
        System.out.println("Удача " + luck);
        health = health;
        luck = luck;
        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти в ліс. Спробуйте ще раз ");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти в чарівний ліс ");
        }

    }
}







