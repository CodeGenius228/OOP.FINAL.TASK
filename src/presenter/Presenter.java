package presenter;

import service.Service;


import java.time.LocalDate;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, String genderStr, LocalDate birthDate) {
        service.addHuman(name, genderStr, birthDate);
    }

    public void getTreeInfo() {
        String answer = service.getTreeInfo();
        view.printAnswer(answer);
    }

    public void addHumanAndParents(String name, String genderStr, LocalDate birthDate) {
        service.addHumanAndParents(name, genderStr, birthDate);
    }


    public void saveTree() {
        service.saveTree();
    }

    public void loadTree() {
        service.loadTree();
    }
}