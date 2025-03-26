package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class B7 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private final F7 f28828t;

    public B7(F7 f72) {
        super("internal.logger");
        this.f28828t = f72;
        this.f29461s.put("log", new E7(this, false, true));
        this.f29461s.put("silent", new t7(this, "silent"));
        ((AbstractC4974n) this.f29461s.get("silent")).o("log", new E7(this, true, true));
        this.f29461s.put("unmonitored", new D7(this, "unmonitored"));
        ((AbstractC4974n) this.f29461s.get("unmonitored")).o("log", new E7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        return InterfaceC5013s.f29548h;
    }
}
