public class Superme {
    int n;
    float f(){

        float sum = 0;
        for (int i = 0;i <= n;i++)
            sum = sum +i;
        return sum;
    }
}

class SuperSuperMe extends Superme{
    int n;

    @Override
    float f() {
        float c;
        super.n = n;
        c = super.f();
        return c/n;
    }

    float g(){
        float c;
        c = super.f();
        return c/2;
    }
}