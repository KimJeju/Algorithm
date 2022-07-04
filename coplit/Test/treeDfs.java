import java.util.ArrayList;
import java.util.Arrays;

public class treeDfs {
    public static void main(String[] args) {

    }

    public static ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> values = new ArrayList<>();
        values.add(node.getValue());

        if(node.getChildrenNode() != null){
            for(int i = 0; i < node.getChildrenNode().size(); ++i){
                ArrayList<String> result = dfs(node.getChildrenNode().get(i));
                values.addAll(result);
            }
        }

        return values;
    }
    }

     class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
}
