package com.google.android.gms.internal.ads;

import Z2.AbstractC0777p;

/* renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1353Go extends AbstractBinderC1425Io {

    /* renamed from: o, reason: collision with root package name */
    private final String f15436o;

    /* renamed from: s, reason: collision with root package name */
    private final int f15437s;

    public BinderC1353Go(String str, int i8) {
        this.f15436o = str;
        this.f15437s = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1460Jo
    public final String a() {
        return this.f15436o;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC1353Go)) {
            BinderC1353Go binderC1353Go = (BinderC1353Go) obj;
            if (AbstractC0777p.a(this.f15436o, binderC1353Go.f15436o)) {
                if (AbstractC0777p.a(Integer.valueOf(this.f15437s), Integer.valueOf(binderC1353Go.f15437s))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1460Jo
    public final int zzb() {
        return this.f15437s;
    }
}
