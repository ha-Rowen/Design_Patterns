package Behavioral_Patterns.Strategy;

public class park {

    Strategy_Pattern_I tree;
    public park( Strategy_Pattern_I tree)
    {

        this.tree= tree;
    }

    public void park_tree_print()
    {
        tree.tree_print();
    }

}
