package family_tree;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<Human> implements Iterator<Human> {
    private int index = 0;
    private List<Human> humanlist;

    public HumanIterator(List<Human> humanList) {
                this.humanlist = humanlist;
            }
            @Override
            public boolean hasNext() {
                return index < humanlist.size();
            }
            @Override
            public Human next() {
                return humanlist.get(index++);
            }
}
