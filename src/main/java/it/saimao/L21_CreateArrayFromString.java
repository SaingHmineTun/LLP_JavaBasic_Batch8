package it.saimao;

public class L21_CreateArrayFromString {
    public static void main(String[] args) {
        String csv = "Mg Mg, Aye Aye, Kyaw Kyaw, Tun Tun, Ko Ko";
        String[] names = csv.split(",");
        System.out.println(names[names.length - 1]);
    }
}
