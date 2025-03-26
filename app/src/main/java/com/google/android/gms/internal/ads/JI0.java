package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class JI0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16224a;

    /* renamed from: b, reason: collision with root package name */
    public final DA0[] f16225b;

    /* renamed from: c, reason: collision with root package name */
    public final BI0[] f16226c;

    /* renamed from: d, reason: collision with root package name */
    public final C1635Op f16227d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16228e;

    public JI0(DA0[] da0Arr, BI0[] bi0Arr, C1635Op c1635Op, Object obj) {
        int length = da0Arr.length;
        AbstractC3796qC.d(length == bi0Arr.length);
        this.f16225b = da0Arr;
        this.f16226c = (BI0[]) bi0Arr.clone();
        this.f16227d = c1635Op;
        this.f16228e = obj;
        this.f16224a = length;
    }

    public final boolean a(JI0 ji0, int i8) {
        return ji0 != null && Objects.equals(this.f16225b[i8], ji0.f16225b[i8]) && Objects.equals(this.f16226c[i8], ji0.f16226c[i8]);
    }

    public final boolean b(int i8) {
        return this.f16225b[i8] != null;
    }
}
