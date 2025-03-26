package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.xh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4605xh0 extends AbstractC3407mh0 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f27899d;

    /* renamed from: e, reason: collision with root package name */
    private int f27900e;

    public C4605xh0() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3516nh0
    public final /* bridge */ /* synthetic */ AbstractC3516nh0 a(Object obj) {
        g(obj);
        return this;
    }

    public final C4605xh0 g(Object obj) {
        obj.getClass();
        if (this.f27899d != null) {
            int p8 = AbstractC4714yh0.p(this.f24554b);
            Object[] objArr = this.f27899d;
            if (p8 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a8 = AbstractC3298lh0.a(hashCode);
                while (true) {
                    int i8 = a8 & length;
                    Object[] objArr2 = this.f27899d;
                    Object obj2 = objArr2[i8];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a8 = i8 + 1;
                    } else {
                        objArr2[i8] = obj;
                        this.f27900e += hashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f27899d = null;
        super.c(obj);
        return this;
    }

    public final C4605xh0 h(Object... objArr) {
        if (this.f27899d != null) {
            for (int i8 = 0; i8 < 2; i8++) {
                g(objArr[i8]);
            }
        } else {
            e(objArr, 2);
        }
        return this;
    }

    public final C4605xh0 i(Iterable iterable) {
        iterable.getClass();
        if (this.f27899d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final AbstractC4714yh0 j() {
        AbstractC4714yh0 L7;
        int i8 = this.f24554b;
        if (i8 == 0) {
            return C3300li0.f24373z;
        }
        if (i8 == 1) {
            Object obj = this.f24553a[0];
            Objects.requireNonNull(obj);
            return new C4498wi0(obj);
        }
        if (this.f27899d == null || AbstractC4714yh0.p(i8) != this.f27899d.length) {
            L7 = AbstractC4714yh0.L(this.f24554b, this.f24553a);
            this.f24554b = L7.size();
        } else {
            int i9 = this.f24554b;
            Object[] objArr = this.f24553a;
            if (AbstractC4714yh0.N(i9, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i9);
            }
            L7 = new C3300li0(objArr, this.f27900e, this.f27899d, r6.length - 1, this.f24554b);
        }
        this.f24555c = true;
        this.f27899d = null;
        return L7;
    }

    C4605xh0(int i8, boolean z7) {
        super(i8);
        this.f27899d = new Object[AbstractC4714yh0.p(i8)];
    }
}
