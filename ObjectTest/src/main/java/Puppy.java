import java.util.Arrays;

public class Puppy {
    /*강아지 속성 : 이름(String), 재주(String[])*/

    private String name;
    private String[] jeju;

    public Puppy(String name) {
        this.name = name;
        this.jeju = new String[0];
    }


    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", jeju=" + Arrays.toString(jeju) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String[] getJeju() {
        return jeju;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJeju(String[] jeju) {
        this.jeju = jeju;
    }
}
