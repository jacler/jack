interface ShowMe{
    void ShowBrand(String s);
}

class TV implements ShowMe{
    @Override
    public void ShowBrand(String s) {
        System.out.println("TV显示商标"+s);
    }
}

class PC implements ShowMe{
    @Override
    public void ShowBrand(String s) {
        System.out.println("PC显示商标"+s);
    }
}
public class ShowMessage {
    public static void main(String[] args) {
        ShowMe me;
        me = new TV();
        me.ShowBrand("鸭绿江");

        me = new PC();
        me.ShowBrand("microsoft");
    }
}
