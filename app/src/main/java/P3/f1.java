package p3;

import android.app.Application;

/* loaded from: classes.dex */
public final class f1 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f40273a;

    /* renamed from: b, reason: collision with root package name */
    private final T0 f40274b;

    public f1(T0 t02, T0 t03) {
        this.f40273a = t02;
        this.f40274b = t03;
    }

    @Override // p3.T0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a1 zza() {
        return new a1((Application) this.f40273a.zza(), (C6354n) this.f40274b.zza());
    }
}
