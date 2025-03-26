package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5254k0 extends A {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5258m0 f30199o;

    /* renamed from: s, reason: collision with root package name */
    protected AbstractC5258m0 f30200s;

    protected AbstractC5254k0(AbstractC5258m0 abstractC5258m0) {
        this.f30199o = abstractC5258m0;
        if (abstractC5258m0.y()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f30200s = abstractC5258m0.i();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final AbstractC5254k0 clone() {
        AbstractC5254k0 abstractC5254k0 = (AbstractC5254k0) this.f30199o.e(5, null, null);
        abstractC5254k0.f30200s = t();
        return abstractC5254k0;
    }

    public final AbstractC5258m0 i() {
        AbstractC5258m0 t7 = t();
        if (AbstractC5258m0.x(t7, true)) {
            return t7;
        }
        throw new zzeo(t7);
    }

    @Override // com.google.android.gms.internal.wearable.H0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC5258m0 t() {
        if (!this.f30200s.y()) {
            return this.f30200s;
        }
        this.f30200s.r();
        return this.f30200s;
    }

    protected final void l() {
        if (this.f30200s.y()) {
            return;
        }
        p();
    }

    protected void p() {
        AbstractC5258m0 i8 = this.f30199o.i();
        R0.a().b(i8.getClass()).e(i8, this.f30200s);
        this.f30200s = i8;
    }
}
