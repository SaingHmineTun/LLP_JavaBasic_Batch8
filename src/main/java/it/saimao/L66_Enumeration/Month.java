package it.saimao.L66_Enumeration;

public enum Month {
    JAN("January"), FEB("February"), MAR("March"),
    APR("April"), MAY("May"), JUN("June");

    public String fullName;

    Month(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
