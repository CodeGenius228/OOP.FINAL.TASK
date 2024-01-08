package service;

import Human.Gender;
import family_tree.FamilyTree;
import writer.FileHandler;
import Human.Human;
import java.time.LocalDate;

public class Service {
    private FamilyTree familyTree;
    private boolean choice = true;

    public Service() {
        this.familyTree = new FamilyTree<>();
    }

    public void loadTree() {
        String filePath = "src/family_tree/writer/tree.txt";
        FileHandler fileHandler = new FileHandler();
        familyTree = (FamilyTree) fileHandler.read(filePath);
    }

    public void saveTree() {
        String filePath = "src/family_tree/writer/tree.txt";
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(familyTree, filePath);
    }

    public void addHuman(String name, String genderStr, LocalDate birthDate) {
        Human human;
        switch (genderStr) {
            case "Male":
                human = new Human(name, Gender.Male, birthDate);
                familyTree.add(human);
                break;
            case "Female":
                human = new Human(name, Gender.Female, birthDate);
                familyTree.add(human);
                break;
            default:
                System.out.println("неправильный пол");
                choice = false;
                break;
        }


    }

    public String getTreeInfo() {
        return familyTree.toString();
    }

    public void addHumanAndParents(String name, String genderStr, LocalDate birthDate) {
        Human human;
        switch (genderStr) {
            case "Male":
                human = new Human(name, Gender.Male, birthDate);
                familyTree.add(human);
                break;
            case "Female":
                human = new Human(name, Gender.Female, birthDate);
                familyTree.add(human);
                break;
            default:
                System.out.println("неправильный пол");
                choice = false;
                break;
        }
    }


}