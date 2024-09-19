package it.saimao.L94_FunctionalInterface;

@FunctionalInterface // Interface with one abstract method
public interface OnItemClickListener {
    void onItemClicked(String s, Integer i);

}
