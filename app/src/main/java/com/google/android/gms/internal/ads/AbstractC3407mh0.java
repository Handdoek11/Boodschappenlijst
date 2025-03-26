package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3407mh0 extends AbstractC3516nh0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f24553a;

    /* renamed from: b, reason: collision with root package name */
    int f24554b;

    /* renamed from: c, reason: collision with root package name */
    boolean f24555c;

    AbstractC3407mh0(int i8) {
        AbstractC1659Pg0.a(i8, "initialCapacity");
        this.f24553a = new Object[i8];
        this.f24554b = 0;
    }

    private final void f(int i8) {
        int length = this.f24553a.length;
        int b8 = AbstractC3516nh0.b(length, this.f24554b + i8);
        if (b8 > length || this.f24555c) {
            this.f24553a = Arrays.copyOf(this.f24553a, b8);
            this.f24555c = false;
        }
    }

    public final AbstractC3407mh0 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f24553a;
        int i8 = this.f24554b;
        this.f24554b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    public final AbstractC3516nh0 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof AbstractC3625oh0) {
                this.f24554b = ((AbstractC3625oh0) collection).b(this.f24553a, this.f24554b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    final void e(Object[] objArr, int i8) {
        AbstractC2431di0.b(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f24553a, this.f24554b, 2);
        this.f24554b += 2;
    }
}
