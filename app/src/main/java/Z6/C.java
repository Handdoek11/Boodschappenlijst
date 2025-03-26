package Z6;

/* loaded from: classes2.dex */
public abstract class C {
    public static final B b(Object obj) {
        if (obj == AbstractC0790d.f6470a) {
            throw new IllegalStateException("Does not contain segment");
        }
        J6.r.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (B) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0790d.f6470a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
