package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class EH0 {

    /* renamed from: c, reason: collision with root package name */
    private final WE f14705c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f14704b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f14703a = -1;

    public EH0(WE we) {
        this.f14705c = we;
    }

    public final Object a(int i8) {
        if (this.f14703a == -1) {
            this.f14703a = 0;
        }
        while (true) {
            int i9 = this.f14703a;
            if (i9 <= 0 || i8 >= this.f14704b.keyAt(i9)) {
                break;
            }
            this.f14703a--;
        }
        while (this.f14703a < this.f14704b.size() - 1 && i8 >= this.f14704b.keyAt(this.f14703a + 1)) {
            this.f14703a++;
        }
        return this.f14704b.valueAt(this.f14703a);
    }

    public final Object b() {
        return this.f14704b.valueAt(this.f14704b.size() - 1);
    }

    public final void c(int i8, Object obj) {
        if (this.f14703a == -1) {
            AbstractC3796qC.f(this.f14704b.size() == 0);
            this.f14703a = 0;
        }
        if (this.f14704b.size() > 0) {
            int keyAt = this.f14704b.keyAt(r0.size() - 1);
            AbstractC3796qC.d(i8 >= keyAt);
            if (keyAt == i8) {
                this.f14705c.a(this.f14704b.valueAt(r1.size() - 1));
            }
        }
        this.f14704b.append(i8, obj);
    }

    public final void d() {
        for (int i8 = 0; i8 < this.f14704b.size(); i8++) {
            this.f14705c.a(this.f14704b.valueAt(i8));
        }
        this.f14703a = -1;
        this.f14704b.clear();
    }

    public final void e(int i8) {
        int i9 = 0;
        while (i9 < this.f14704b.size() - 1) {
            int i10 = i9 + 1;
            if (i8 < this.f14704b.keyAt(i10)) {
                return;
            }
            this.f14705c.a(this.f14704b.valueAt(i9));
            this.f14704b.removeAt(i9);
            int i11 = this.f14703a;
            if (i11 > 0) {
                this.f14703a = i11 - 1;
            }
            i9 = i10;
        }
    }

    public final boolean f() {
        return this.f14704b.size() == 0;
    }
}
