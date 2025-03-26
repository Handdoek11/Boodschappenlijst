package t;

import android.os.Looper;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;
import z.InterfaceC6995d;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6763a {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6928j f43759a = AbstractC6929k.a(C0330a.f43761o);

    /* renamed from: b, reason: collision with root package name */
    private static final long f43760b;

    /* renamed from: t.a$a, reason: collision with other inner class name */
    static final class C0330a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final C0330a f43761o = new C0330a();

        C0330a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return Looper.getMainLooper() != null ? C6774l.f43776o : F.f43751o;
        }
    }

    static {
        long j8;
        try {
            j8 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j8 = -1;
        }
        f43760b = j8;
    }

    public static final InterfaceC6995d a(Object obj, H h8) {
        return new y(obj, h8);
    }

    public static final long b() {
        return f43760b;
    }
}
