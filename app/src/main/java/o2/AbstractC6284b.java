package o2;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6284b {
    public static Object a(int i8, Object obj, InterfaceC6283a interfaceC6283a, InterfaceC6285c interfaceC6285c) {
        Object apply;
        if (i8 < 1) {
            return interfaceC6283a.apply(obj);
        }
        do {
            apply = interfaceC6283a.apply(obj);
            obj = interfaceC6285c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return apply;
    }
}
