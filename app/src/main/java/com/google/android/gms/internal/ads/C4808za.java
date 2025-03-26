package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4808za extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final Activity f28657y;

    /* renamed from: z, reason: collision with root package name */
    private final View f28658z;

    public C4808za(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, View view, Activity activity) {
        super(c3610oa, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c2918i8, i8, 62);
        this.f28658z = view;
        this.f28657y = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (this.f28658z == null) {
            return;
        }
        Boolean bool = (Boolean) D2.A.c().a(AbstractC3184kf.f23705J2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f21841v.invoke(null, this.f28658z, this.f28657y, bool);
        synchronized (this.f21840u) {
            try {
                this.f21840u.l0(((Long) objArr[0]).longValue());
                this.f21840u.n0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f21840u.m0((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
