package 实现一个单例模式;

/*
 * @author 爱敲代码的老王
 * @Date 2022/9/12 15:38
 */


/**
 * 直接使用双重校验模式来创建单例，这也是最完美的创建模式
 */
public class SingleTon {
    private volatile static SingleTon unique;

    private SingleTon() {
    }

    public static SingleTon getUnique() {
        if (unique == null) {
            synchronized (SingleTon.class) {
                if (unique == null) {
                    unique = new SingleTon();
                }
            }
        }
        return unique;
    }
}
