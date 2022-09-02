package hello.core.singleton;

public class SingletonService {
    //자기자신을 내부에 private, static으로 선언
    //static 영역에 객체가 딱 하나만 존재하게 됨..
    private static final SingletonService instance = new SingletonService();

    //서버가 실행될때,
    // 바로 클래스에 SingletonService가 실행->instance 변수에 객체 인스터스 대입
    //이 객체 인스턴스가 필요하면 오직 'getInstance()' 메소드를 통해서만 조회 가능
    //이 메소드를 호출하면 항상 같은 인스턴스를 반환
    //딱 1개의 객체 인스턴스만 존재해야 하므로, 생성자를 private로 막아서
    //외부에서 new 키워드로 객체 인스턴스가 생성되는것을 막는다
    public static SingletonService getInstance(){
        return instance;
    }
    
    //생성자를 private로 선언, 외부에서 new 키워드를 사용한 객체 생성을 막음
    private SingletonService(){
        
    }
    
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }



}
