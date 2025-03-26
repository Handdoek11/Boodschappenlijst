package d0;

import q.C6408l;
import x6.C6916E;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5696b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5696b f35191a;

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f35192b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C6408l f35193c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f35194d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f35195e;

    static {
        C5696b c5696b = new C5696b();
        f35191a = c5696b;
        f35192b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f35193c = new C6408l(0, 1, null);
        Object[] objArr = new Object[0];
        f35194d = objArr;
        synchronized (objArr) {
            c5696b.h(f35193c, 1.15f, new C5697c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c5696b.h(f35193c, 1.3f, new C5697c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c5696b.h(f35193c, 1.5f, new C5697c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c5696b.h(f35193c, 1.8f, new C5697c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c5696b.h(f35193c, 2.0f, new C5697c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            C6916E c6916e = C6916E.f44463a;
        }
        if (c5696b.e(f35193c.m(0)) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        f35195e = 8;
    }

    private C5696b() {
    }

    private final InterfaceC5695a a(InterfaceC5695a interfaceC5695a, InterfaceC5695a interfaceC5695a2, float f8) {
        float[] fArr = f35192b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f9 = f35192b[i8];
            fArr2[i8] = d.f35200a.b(interfaceC5695a.a(f9), interfaceC5695a2.a(f9), f8);
        }
        return new C5697c(f35192b, fArr2);
    }

    private final InterfaceC5695a c(float f8) {
        return (InterfaceC5695a) f35193c.h(d(f8));
    }

    private final int d(float f8) {
        return (int) (f8 * 100.0f);
    }

    private final float e(int i8) {
        return i8 / 100.0f;
    }

    private final void g(float f8, InterfaceC5695a interfaceC5695a) {
        synchronized (f35194d) {
            C6408l clone = f35193c.clone();
            f35191a.h(clone, f8, interfaceC5695a);
            f35193c = clone;
            C6916E c6916e = C6916E.f44463a;
        }
    }

    private final void h(C6408l c6408l, float f8, InterfaceC5695a interfaceC5695a) {
        c6408l.p(d(f8), interfaceC5695a);
    }

    public final InterfaceC5695a b(float f8) {
        InterfaceC5695a interfaceC5695a;
        if (!f(f8)) {
            return null;
        }
        InterfaceC5695a c8 = f35191a.c(f8);
        if (c8 != null) {
            return c8;
        }
        int k8 = f35193c.k(d(f8));
        if (k8 >= 0) {
            return (InterfaceC5695a) f35193c.r(k8);
        }
        int i8 = -(k8 + 1);
        int i9 = i8 - 1;
        float f9 = 1.0f;
        if (i8 >= f35193c.q()) {
            C5697c c5697c = new C5697c(new float[]{1.0f}, new float[]{f8});
            g(f8, c5697c);
            return c5697c;
        }
        if (i9 < 0) {
            float[] fArr = f35192b;
            interfaceC5695a = new C5697c(fArr, fArr);
        } else {
            f9 = e(f35193c.m(i9));
            interfaceC5695a = (InterfaceC5695a) f35193c.r(i9);
        }
        InterfaceC5695a a8 = a(interfaceC5695a, (InterfaceC5695a) f35193c.r(i8), d.f35200a.a(0.0f, 1.0f, f9, e(f35193c.m(i8)), f8));
        g(f8, a8);
        return a8;
    }

    public final boolean f(float f8) {
        return f8 >= 1.03f;
    }
}
