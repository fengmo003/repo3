package cn;

/**
 * 克隆远程仓库的代码
 * 上传修改后的远程代码
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("你好，git");
    }

    int man =0;
    int gril = 0;
    int child = 0;

    public void test( int money){
        if (money == 0){
            System.out.println(man);
        }
        if( money % 5 == 0){
            money = money - 5;
            man++;
            test(money);
        }
        if( money % 3 == 0){
            money = money - 3;
            gril++;
            test(money);
        }
        if( money % 1 == 0){
            money = money - 1;
            child = child + 3;
            test(money);
        }
    }
}
