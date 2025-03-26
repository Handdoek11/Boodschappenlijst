package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ce0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2314ce0 implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21256a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f21257b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f21258c;

    /* renamed from: d, reason: collision with root package name */
    private C4393vk0 f21259d;

    protected AbstractC2314ce0(boolean z7) {
        this.f21256a = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public /* synthetic */ Map b() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
        wu0.getClass();
        if (this.f21257b.contains(wu0)) {
            return;
        }
        this.f21257b.add(wu0);
        this.f21258c++;
    }

    protected final void g() {
        C4393vk0 c4393vk0 = this.f21259d;
        int i8 = AbstractC2301cW.f21206a;
        for (int i9 = 0; i9 < this.f21258c; i9++) {
            ((Wu0) this.f21257b.get(i9)).f(this, c4393vk0, this.f21256a);
        }
        this.f21259d = null;
    }

    protected final void i(C4393vk0 c4393vk0) {
        for (int i8 = 0; i8 < this.f21258c; i8++) {
            ((Wu0) this.f21257b.get(i8)).o(this, c4393vk0, this.f21256a);
        }
    }

    protected final void j(C4393vk0 c4393vk0) {
        this.f21259d = c4393vk0;
        for (int i8 = 0; i8 < this.f21258c; i8++) {
            ((Wu0) this.f21257b.get(i8)).q(this, c4393vk0, this.f21256a);
        }
    }

    protected final void z(int i8) {
        C4393vk0 c4393vk0 = this.f21259d;
        int i9 = AbstractC2301cW.f21206a;
        for (int i10 = 0; i10 < this.f21258c; i10++) {
            ((Wu0) this.f21257b.get(i10)).i(this, c4393vk0, this.f21256a, i8);
        }
    }
}
