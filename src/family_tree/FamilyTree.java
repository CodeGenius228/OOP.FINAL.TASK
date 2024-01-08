package family_tree;

import Human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Human.HumanComparatorByBirthDate;
import Human.HumanComparatorByName;

public class FamilyTree<Human extends TreeNode<Human>> implements Serializable, Iterable<Human> {
    private List<Human> humanlist;

    public FamilyTree(List<Human> humalist) {
        this.humanlist = humalist;
    }
    public FamilyTree() {
        this(new ArrayList<>());
    }
    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanlist.contains(human)) {
            humanlist.add(human);
            addToParents(human);
            addToChildren(human);

            return true;
        }
        return false;
    }
    private void addToParents(Human human){
        for (Human parent: human.getParents()) {
            parent.addChild(human);
        }
    }
    private void addToChildren(Human human) {
        for (Human child : human.getChildren()) {
            child.addParents(human);
        }
    }
    public List<Human> getByName(String name) {
        List<Human> res = new ArrayList<>();
        for (Human human : humanlist) {
            if (human.getName().equals(name)) {
                res.add(human);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В древе: ");
        sb.append(humanlist.size());
        sb.append(" человек \n");
        for (Human human: humanlist){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanlist);
    }

    public void sortByName(){
        humanlist.sort(new HumanComparatorByName()); }

    public void sortByBirthDate(){
        humanlist.sort(new HumanComparatorByBirthDate());
    }

}
