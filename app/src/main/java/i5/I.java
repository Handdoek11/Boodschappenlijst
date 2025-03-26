package I5;

/* loaded from: classes2.dex */
public abstract class I {
    public static final boolean a(H h8) {
        J6.r.e(h8, "<this>");
        return J6.r.a(h8.d(), "https") || J6.r.a(h8.d(), "wss");
    }

    public static final boolean b(H h8) {
        J6.r.e(h8, "<this>");
        return J6.r.a(h8.d(), "ws") || J6.r.a(h8.d(), "wss");
    }
}
