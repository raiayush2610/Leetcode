public class NestedIterator {
    private List<Integer> fla;
    private int index;

    public NestedIterator(List<NestedInteger> nL) {
        fla = new ArrayList<>();
        index = 0;
        fla = flatten(nL);
    }

    private List<Integer> flatten(List<NestedInteger> nested) {
        List<Integer> result = new ArrayList<>();
        for (NestedInteger ni : nested) {
            if (ni.isInteger()) {
                result.add(ni.getInteger());
            } else {
                result.addAll(flatten(ni.getList()));
            }
        }
        return result;
    }

    public int next() {
        return fla.get(index++);
    }

    public boolean hasNext() {
        return index < fla.size();
    }
}