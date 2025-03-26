package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5126i0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f29914a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f29915b = 0;

    /* renamed from: c, reason: collision with root package name */
    C5120h0 f29916c;

    public final C5126i0 a(Object obj, Object obj2) {
        int i8 = this.f29915b + 1;
        Object[] objArr = this.f29914a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f29914a = Arrays.copyOf(objArr, AbstractC5078a0.a(length, i9));
        }
        N.b(obj, obj2);
        Object[] objArr2 = this.f29914a;
        int i10 = this.f29915b;
        int i11 = i10 + i10;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f29915b = i10 + 1;
        return this;
    }

    public final AbstractC5132j0 b() {
        C5120h0 c5120h0 = this.f29916c;
        if (c5120h0 != null) {
            throw c5120h0.a();
        }
        I0 h8 = I0.h(this.f29915b, this.f29914a, this);
        C5120h0 c5120h02 = this.f29916c;
        if (c5120h02 == null) {
            return h8;
        }
        throw c5120h02.a();
    }
}
