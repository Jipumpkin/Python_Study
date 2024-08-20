package 동물;

public class Penguin extends Bird{

   // 성별, 밥먹기, 잠자기, 움직이기, 알을 낳는다
   // - Bird (Animal)
   
   // + 배치기(slide)
   public void slide() {
      System.out.println("배치기");
   }
   
   // Bird가 물려주는 move가 "난다."--->"헤엄치다"로 동작할 수 있도록
   // 오버라이딩을 진행
   @Override
   public void move() {
      System.out.println("헤엄치다.");
   }
   // Animal에 있는 move를 사용하지 않는 이유는
   // 컴파일러가 Animal보다 Bird를 먼저 탐색하기때문!
   
}