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


    public void dosomeThingvoid(String something) {
        /*switch문 사용 작성 */
        switch (something) {
            case "앉아":
                System.out.println(name + "앉아");
                break;
            case "빵!!":
                System.out.println(name + "빵!!");
                break;
            case "기다려":
                System.out.println(name + "기다려");
                break;
            default:
                System.out.println(name + "이 아직 못배운재주에요");
                break;

        }
    }

    public String dosomeThing(String something) {
        /*switch문 사용 작성 */
        switch (something) {
            case "앉아":
                System.out.println(name + "앉아");
                return name + "앉아";

            case "빵!!":
                System.out.println(name + "빵!!");
                return name + "빵!!";

            case "기다려":
                System.out.println(name + "기다려");
                return name + "기다려";

            default:
                System.out.println(name + "이 아직 못배운재주에요");
                return name + "이 아직 못배운 재주예요";


        }
    }
    public boolean BooleanDoSomeThing(String something) {
        switch (something) {
            case "앉아":
                System.out.println(name + "앉아");
                return true;

            case "빵!!":
                System.out.println(name + "빵!!");
                return true;

            case "기다려":
                System.out.println(name + "기다려");
                return true;

            default:
                System.out.println(name + "이 아직 못배운재주에요");
                return false;
        }
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
