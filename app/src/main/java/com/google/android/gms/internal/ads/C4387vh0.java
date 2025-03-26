package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4387vh0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f27322a;

    /* renamed from: b, reason: collision with root package name */
    int f27323b;

    /* renamed from: c, reason: collision with root package name */
    C4278uh0 f27324c;

    public C4387vh0() {
        this(4);
    }

    private final void d(int i8) {
        Object[] objArr = this.f27322a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f27322a = Arrays.copyOf(objArr, AbstractC3516nh0.b(length, i9));
        }
    }

    public final C4387vh0 a(Object obj, Object obj2) {
        d(this.f27323b + 1);
        AbstractC1659Pg0.b(obj, obj2);
        Object[] objArr = this.f27322a;
        int i8 = this.f27323b;
        int i9 = i8 + i8;
        objArr[i9] = obj;
        objArr[i9 + 1] = obj2;
        this.f27323b = i8 + 1;
        return this;
    }

    public final C4387vh0 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f27323b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final AbstractC4496wh0 c() {
        C4278uh0 c4278uh0 = this.f27324c;
        if (c4278uh0 != null) {
            throw c4278uh0.a();
        }
        C3191ki0 k8 = C3191ki0.k(this.f27323b, this.f27322a, this);
        C4278uh0 c4278uh02 = this.f27324c;
        if (c4278uh02 == null) {
            return k8;
        }
        throw c4278uh02.a();
    }

    C4387vh0(int i8) {
        this.f27322a = new Object[i8 + i8];
        this.f27323b = 0;
    }
}
