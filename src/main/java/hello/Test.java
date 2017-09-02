package hello;

import java.io.Serializable;

/**
 * Created by wq on 2017/9/2.
 */
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String t;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", t='" + t + '\'' +
                '}';
    }
}
