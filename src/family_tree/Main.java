package family_tree;

import Human.Human;
import writer.FileHandler;

import java.io.Serializable;
import java.time.LocalDate;
import Human.Gender;
import view.ConsoleUI;
import view.MainMenu;
import view.View;



public class Main {
    public  static void main (String[] args) {
//        FamilyTree  tree = testTree();
//        System.out.println(tree);

        View view = new ConsoleUI();
        view.start();
    }
}
//        save(tree);


//    static FamilyTree testTree() {
//        FamilyTree tree = new FamilyTree();
//
//        Human ruslan = new Human("Никита", Gender.Male, LocalDate.of(1991, 3, 27));
//        Human ludmila = new Human("Светлана", Gender.Female, LocalDate.of(1989, 8, 13));
//        tree.add(ruslan);
//        tree.add(ludmila);
//        Human milana = new Human("Анна", Gender.Female, LocalDate.of(2018, 10, 29),
//                ludmila, ruslan);
//        tree.add(milana);
//        Human grandFather = new Human("Еремей", Gender.Male, LocalDate.of(1963, 1, 15));
//        grandFather.addChild(ruslan);
//        tree.add(grandFather);
//        return tree;
//
//    }
//    private  static void save(Serializable tree){
//        String filePath = "src/family_tree/writer/tree.txt";
//        FileHandler fileHandler = new FileHandler();
//        fileHandler.save(tree, filePath);
//    }
//    private static FamilyTree load(){
//        String filePath = "src/family_tree/writer/tree.txt";
//        FileHandler fileHandler = new FileHandler();
//        return (FamilyTree) fileHandler.read(filePath);
//    }
//}
