package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class II0 {

    /* renamed from: a, reason: collision with root package name */
    private HI0 f15920a;

    /* renamed from: b, reason: collision with root package name */
    private QI0 f15921b;

    public abstract BA0 b();

    public void c() {
        this.f15920a = null;
        this.f15921b = null;
    }

    public abstract void d(WR wr);

    public abstract boolean e();

    public abstract JI0 f(CA0[] ca0Arr, JH0 jh0, GG0 gg0, AbstractC1981Yl abstractC1981Yl);

    public abstract void g(Object obj);

    protected final QI0 h() {
        QI0 qi0 = this.f15921b;
        AbstractC3796qC.b(qi0);
        return qi0;
    }

    public final void i(HI0 hi0, QI0 qi0) {
        this.f15920a = hi0;
        this.f15921b = qi0;
    }

    protected final void j() {
        HI0 hi0 = this.f15920a;
        if (hi0 != null) {
            hi0.h();
        }
    }
}
