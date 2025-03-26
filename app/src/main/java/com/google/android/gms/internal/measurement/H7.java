package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class H7 extends AbstractC4974n {

    /* renamed from: t, reason: collision with root package name */
    private final Callable f28887t;

    public H7(String str, Callable callable) {
        super(str);
        this.f28887t = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        try {
            return AbstractC4865a4.b(this.f28887t.call());
        } catch (Exception unused) {
            return InterfaceC5013s.f29548h;
        }
    }
}
