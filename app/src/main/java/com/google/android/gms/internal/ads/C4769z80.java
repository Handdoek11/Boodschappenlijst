package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.z80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4769z80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28306a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f28308c;

    /* synthetic */ C4769z80(K80 k80, Object obj, List list, J80 j80) {
        this.f28308c = k80;
        this.f28306a = obj;
        this.f28307b = list;
    }

    public final I80 a(Callable callable) {
        C2109ak0 b8 = AbstractC2326ck0.b(this.f28307b);
        com.google.common.util.concurrent.d a8 = b8.a(new Callable() { // from class: com.google.android.gms.internal.ads.y80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, AbstractC1497Kq.f16650g);
        com.google.common.util.concurrent.d a9 = b8.a(callable, this.f28308c.f16525a);
        return new I80(this.f28308c, this.f28306a, a8, this.f28307b, a9);
    }
}
