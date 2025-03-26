package h2;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5830d {
    public static AbstractC5830d f(Object obj) {
        return new C5827a(null, obj, EnumC5832f.DEFAULT, null, null);
    }

    public static AbstractC5830d g(Object obj, AbstractC5833g abstractC5833g) {
        return new C5827a(null, obj, EnumC5832f.DEFAULT, abstractC5833g, null);
    }

    public static AbstractC5830d h(Object obj) {
        return new C5827a(null, obj, EnumC5832f.VERY_LOW, null, null);
    }

    public static AbstractC5830d i(Object obj) {
        return new C5827a(null, obj, EnumC5832f.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract AbstractC5831e b();

    public abstract Object c();

    public abstract EnumC5832f d();

    public abstract AbstractC5833g e();
}
