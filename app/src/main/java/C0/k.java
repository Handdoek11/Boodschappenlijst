package c0;

import J6.AbstractC0650j;
import J6.C0652l;
import c0.i;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12084a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f12085b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f12086c;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return k.f12086c;
        }

        public final long b() {
            return k.f12085b;
        }

        private a() {
        }
    }

    static {
        float f8 = 0;
        f12085b = j.a(i.c(f8), i.c(f8));
        i.a aVar = i.f12080o;
        f12086c = j.a(aVar.a(), aVar.a());
    }

    public static final float d(long j8) {
        if (j8 == f12086c) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return i.c(Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public static final float e(long j8) {
        if (j8 == f12086c) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return i.c(Float.intBitsToFloat((int) (j8 >> 32)));
    }

    public static long c(long j8) {
        return j8;
    }
}
