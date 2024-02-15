public class Application {
    public static void main(String[] args) {

        /*1. 사람생성(이름 , 나이는 생성과 동시에 초기화 되어야함)
        * 2. 1에서 만든 사람의 국적 설정
        *   (한국, 일본, 중국, 홍콩 ,터키 중 하나만 가능 / 만약 다른 국가를 입력하면 '한국'자동 설정 )
        * 3. 강아지 입양 -> 사람이 할 수 있는 일 (=Person의 메소드를 호출해서 puppy를 추가)
        * 단, 강아지는 반드시 이름이 있어야 함(강아지 입력 스캐너로 받기)
        *
        * 4. 강아지에게 재주 가르치기 ->사람이 할 수 있는 일
        *    (=Person의 매개변수가 있는 메소드를 호출해서 puppy의 ability 추가)
        *     String[] teaching = new String[] {"앉아", "빵!!", "기다려"*/

        Person ps = new Person("박종준", 25);
        ps.setCountry("홍콩");
        ps.adoptpuppy();

        String[] teachingAbility = new String[]{"앉아", "빵!", "기다려"};
        ps.teachingpuppy(teachingAbility);


    }
}
