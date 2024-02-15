import java.util.Arrays;
import java.util.Scanner;

public class Person {
    /*사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) ---캡슐화*/

    private String name;
    private int age;
    private String country;
    private Puppy puppy;



    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public Puppy getPuppy() {
        return puppy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPuppy(Puppy puppy) {
        this.puppy = puppy;
    }

    public void setCountry(String country) {
        /* String[] 로 국적배열 만든 후 반복문, 조건문 작성*/
        String[] arr = {"한국", "일본", "중국", "홍콩", "터키"};

        for(String i : arr) {
            if(i.equals(country)){
                this.country = country;
                System.out.println(name +" 국적은 " + country + " 입니다.");
                break;
            }else {
                this.country = "한국";
                System.out.println(name + "님이 다른 국가를 입력하여 한국으로 자동설정 합니다.");
                break;

            }
        }
    }
    /*강아지 이름을 입력받고 입력받은 이름을 속성으로 강아지 객체 생성하여
    * 이 사람의 강아지로 설정 */
    public void adoptpuppy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지 이름을 입력하세요 :");
        String puppyName = scanner.next();

        Puppy py = new Puppy("black");
        py.setName(puppyName);

        this.puppy = py;
        System.out.println("강아지의 이름은 " + puppyName + " 입니다.");
    }

    public void teachingpuppy(String[] active) {
        /*내 강아지의 재주 설정 */
            this.puppy.setJeju(active);



        }
    }

