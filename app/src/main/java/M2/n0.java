package M2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final O2.a f3910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3911b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3912c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3913d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3914e = new AtomicBoolean(false);

    public n0(O2.a aVar, String str, long j8, int i8) {
        this.f3910a = aVar;
        this.f3911b = str;
        this.f3912c = j8;
        this.f3913d = i8;
    }

    public final int a() {
        return this.f3913d;
    }

    public final O2.a b() {
        return this.f3910a;
    }

    public final String c() {
        return this.f3911b;
    }

    public final void d() {
        this.f3914e.set(true);
    }

    public final boolean e() {
        return this.f3912c <= C2.v.c().a();
    }

    public final boolean f() {
        return this.f3914e.get();
    }
}
