package B3;

import C3.C0416d;
import C3.C0431i;
import C3.C0433i1;
import C3.C0440l;
import C3.C0442l1;
import Z2.AbstractC0777p;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

/* renamed from: B3.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0402v {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0388g f472a = new C3.K();

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0382a f473b = new C0416d();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC0396o f474c = new C0433i1();

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC0399s f475d = new C0442l1();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC0386e f476e = new C0440l();

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f477f;

    /* renamed from: g, reason: collision with root package name */
    private static final a.g f478g;

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0225a f479h;

    /* renamed from: B3.v$a */
    public static final class a implements a.d {

        /* renamed from: c, reason: collision with root package name */
        public static final a f480c = new a(new C0008a());

        /* renamed from: b, reason: collision with root package name */
        private final Looper f481b;

        /* renamed from: B3.v$a$a, reason: collision with other inner class name */
        public static class C0008a {

            /* renamed from: a, reason: collision with root package name */
            private Looper f482a;
        }

        private a(C0008a c0008a) {
            this.f481b = c0008a.f482a;
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return AbstractC0777p.b(a.class);
        }
    }

    static {
        a.g gVar = new a.g();
        f478g = gVar;
        S s8 = new S();
        f479h = s8;
        f477f = new com.google.android.gms.common.api.a("Wearable.API", s8, gVar);
    }

    public static AbstractC0383b a(Context context) {
        return new C0431i(context, b.a.f13242c);
    }

    public static AbstractC0389h b(Context context) {
        return new C3.O(context, b.a.f13242c);
    }
}
