package ch5.step2;

import lombok.*;

/**
 * @author Dongmyeong Lee
 * @since 2020/03/11
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User_Ex1 {
    private String id;
    private String name;
    private String password;

    private Level level;
    int login;
    int recommend;

    public User_Ex1(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

   public void upgradeLevel(){
       Level nextLevel = this.level.nextLevel();
       if (nextLevel == null){
           throw new IllegalArgumentException(this.level + "은 업그레이드가 불가능합니다.");
       }
       else{
           this.level = nextLevel;
       }
   }
}