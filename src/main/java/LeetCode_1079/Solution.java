package LeetCode_1079;

import java.util.*;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-04 10:53
 * Last Modify: 2019-07-04
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    private Node root = new Node();

    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : chars) {
            list.add(c);
        }

        dfs(list, root);

        return bfs() - 1; // -1 的原因是 root 本身不算节点
    }

    // 深度优先遍历构建字典树
    private void dfs(List<Character> list, Node node) {
        for (int i = 0; i < list.size(); i++) {
            Node tmp = new Node(list.get(i));
            if (node.contains(tmp))
                continue;

            node.add(tmp);
            dfs(getWithout(list, i), tmp);
        }
    }

    // 广度优先遍历计算节点数
    private int bfs() {
        return bfs(root);
    }

    // 广度优先遍历计算节点数
    private int bfs(Node node) {
        if (null == node)
            return 0;

        if (null == node.children)
            return 1;

        int count = 1;
        for (Node child : node.children) {
            count += bfs(child);
        }

        return count;
    }

    // 获取一个List移除一个元素后的列表（原列表不修改）
    private List<Character> getWithout(List<Character> list, int i) {
        List<Character> result = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if (j != i)
                result.add(list.get(j));
        }

        return result;
    }

    class Node {
        private Character val;

        Set<Node> children = null;

        Node() {}

        Node(Character val) {
            this.val = val;
        }

        char getVal() {
            return val;
        }

        void setVal(Character val) {
            this.val = val;
        }

        void add(Node node) {
            if (null == children)
                children = new HashSet<>();
            children.add(node);
        }

        boolean contains(Node node) {
            return null != children && children.contains(node);
        }

        @Override
        public int hashCode() {
            return val;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node))
                return false;

            return obj.hashCode() == hashCode();
        }
    }
}
