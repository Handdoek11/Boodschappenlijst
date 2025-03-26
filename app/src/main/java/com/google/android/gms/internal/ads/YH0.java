package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class YH0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f20240a;

    public final int a(int i8) {
        AbstractC3796qC.a(i8, 0, this.f20240a.size());
        return this.f20240a.keyAt(i8);
    }

    public final int b() {
        return this.f20240a.size();
    }

    public final boolean c(int i8) {
        return this.f20240a.get(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YH0)) {
            return false;
        }
        YH0 yh0 = (YH0) obj;
        if (AbstractC2301cW.f21206a >= 24) {
            return this.f20240a.equals(yh0.f20240a);
        }
        if (this.f20240a.size() != yh0.f20240a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f20240a.size(); i8++) {
            if (a(i8) != yh0.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (AbstractC2301cW.f21206a >= 24) {
            return this.f20240a.hashCode();
        }
        int size = this.f20240a.size();
        for (int i8 = 0; i8 < this.f20240a.size(); i8++) {
            size = (size * 31) + a(i8);
        }
        return size;
    }
}
