package view;

import presenter.Presenter;

import javax.swing.text.View;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean check;

    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        check = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Приветствие");
        while (check) {
            printMenu();
            check = choice();
        }
    }

    private boolean choice() {
        String choiceStr = scanner.nextLine();
        int choice = Integer.parseInt(choiceStr);

        if (choice > 0 && choice < menu.size() + 1) {
            menu.execute(choice);
        }

        if (choice == menu.size()) {
            return false;
        } else {
            return true;
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void addHuman() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите пол (Male/Female): ");
        String genderStr = scanner.nextLine();
        System.out.println("Введите год рождения:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите месяц рождения:");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите день рождения:");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println("В дереве присутствуют родители данного человека? 1-Да, 2-Нет");
        int flag = Integer.parseInt(scanner.nextLine());
        if (flag == 1) {
            System.out.println("Введите id отца");
            int id_1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите id матери");
            int id_2 = Integer.parseInt(scanner.nextLine());
            presenter.addHumanAndParents(name, genderStr, LocalDate.of(year, month, day), id_1, id_2);
        } else {
            presenter.addHuman(name, genderStr, LocalDate.of(year, month, day));
        }
    }

    public void finish() {
        System.out.println("До скорых встреч!");
    }

    public void getTreeInfo() {
        presenter.getTreeInfo();
    }

    public void saveTree() {
        presenter.saveTree();
    }

    public void loadTree() {
        presenter.loadTree();
    }
}
