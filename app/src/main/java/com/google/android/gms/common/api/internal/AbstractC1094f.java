package com.google.android.gms.common.api.internal;

import A3.C0377k;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1092d;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1094f {

    /* renamed from: a, reason: collision with root package name */
    private final C1092d f13314a;

    /* renamed from: b, reason: collision with root package name */
    private final C1105d[] f13315b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13316c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13317d;

    protected AbstractC1094f(C1092d c1092d, C1105d[] c1105dArr, boolean z7, int i8) {
        this.f13314a = c1092d;
        this.f13315b = c1105dArr;
        this.f13316c = z7;
        this.f13317d = i8;
    }

    public void a() {
        this.f13314a.a();
    }

    public C1092d.a b() {
        return this.f13314a.b();
    }

    public C1105d[] c() {
        return this.f13315b;
    }

    protected abstract void d(a.b bVar, C0377k c0377k);

    public final int e() {
        return this.f13317d;
    }

    public final boolean f() {
        return this.f13316c;
    }
}
