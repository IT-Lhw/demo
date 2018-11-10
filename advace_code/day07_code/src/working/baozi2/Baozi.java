package working.baozi2;

import java.util.Objects;

public class Baozi {
    private String pi;
    private String xian;
    private boolean ymy = false;

    public Baozi() {
    }

    public Baozi(String pi, String xian, boolean ymy) {
        this.pi = pi;
        this.xian = xian;
        this.ymy = ymy;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isYmy() {
        return ymy;
    }

    public void setYmy(boolean yme) {
        this.ymy = yme;
    }

    @Override
    public String toString() {
        return "Baozi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                ", ymy=" + ymy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baozi baozi = (Baozi) o;
        return ymy == baozi.ymy &&
                Objects.equals(pi, baozi.pi) &&
                Objects.equals(xian, baozi.xian);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pi, xian, ymy);
    }
}
