
//実行クラス 
public class Test{
    public static void main(String args[]){
        Child c1 = new Child();
        c1.print(); 
        c1.print2();
        Parent parent = new Child();
        c1.print(); 
        c1.print2();
    } 
} 

//スーパークラス 
class Parent{
    private String JIBUN1 = "親1"; 
    protected String JIBUN2 = "親2"; 
    protected String JIBUN3 = "親3"; 
    public void print(){ 
        System.out.println("print"); 
        System.out.println("私は" + JIBUN1 + "です。"); 
        System.out.println("私は" + JIBUN2 + "です。"); 
        System.out.println("私は" + JIBUN3 + "です。"); 
    }
//    final public void print2(){ オーバーライドしたくない場合は finalを付けておけばコンパイルエラーになる。
    public void print2(){
        System.out.println("print2"); 
        System.out.println("親は" + JIBUN1 + "です。"); 
        System.out.println("親は" + JIBUN2 + "です。"); 
        System.out.println("親は" + JIBUN3 + "です。"); 
    } 
} 

//子クラス 
class Child extends Parent{
    // @Override // オーバーライドできないためコンパイルエラー
    private String JIBUN1 = "子供1";
    // @Override // オーバーライドできないためコンパイルエラー
    protected String JIBUN2 = "子供2";
    Child() {
        this.JIBUN3 = "子供3";
    }
    @Override // オーバーライドアノテーションで、オーバーライドということを明記
    public void print2(){
        System.out.println("print2"); 
        System.out.println("子供は" + JIBUN1 + "です。"); 
        System.out.println("子供は" + JIBUN2 + "です。"); 
        System.out.println("子供は" + JIBUN3 + "です。"); 
    } 
}
