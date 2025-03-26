package Q;

import B.e;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final p f4442a;

    /* renamed from: b, reason: collision with root package name */
    private final C0688j f4443b;

    /* renamed from: c, reason: collision with root package name */
    private B f4444c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c f4445d;

    /* renamed from: e, reason: collision with root package name */
    private e.c f4446e;

    public A(p pVar) {
        this.f4442a = pVar;
        C0688j c0688j = new C0688j(pVar);
        this.f4443b = c0688j;
        this.f4444c = c0688j;
        N w02 = c0688j.w0();
        this.f4445d = w02;
        this.f4446e = w02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b() {
        return this.f4446e.j();
    }

    public final e.c c() {
        return this.f4446e;
    }

    public final C0688j d() {
        return this.f4443b;
    }

    public final B e() {
        return this.f4444c;
    }

    public final e.c f() {
        return this.f4445d;
    }

    public final boolean g(int i8) {
        return (i8 & b()) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f4446e == this.f4445d) {
            sb.append("]");
        } else {
            e.c c8 = c();
            while (true) {
                if (c8 == null || c8 == f()) {
                    break;
                }
                sb.append(String.valueOf(c8));
                if (c8.k() == this.f4445d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                c8 = c8.k();
            }
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
