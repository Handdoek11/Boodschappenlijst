package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class IY extends AbstractC3228l00 {

    /* renamed from: b, reason: collision with root package name */
    public final long f15960b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15961c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15962d;

    public IY(int i8, long j8) {
        super(i8, null);
        this.f15960b = j8;
        this.f15961c = new ArrayList();
        this.f15962d = new ArrayList();
    }

    public final IY b(int i8) {
        int size = this.f15962d.size();
        for (int i9 = 0; i9 < size; i9++) {
            IY iy = (IY) this.f15962d.get(i9);
            if (iy.f24245a == i8) {
                return iy;
            }
        }
        return null;
    }

    public final C3064jZ c(int i8) {
        int size = this.f15961c.size();
        for (int i9 = 0; i9 < size; i9++) {
            C3064jZ c3064jZ = (C3064jZ) this.f15961c.get(i9);
            if (c3064jZ.f24245a == i8) {
                return c3064jZ;
            }
        }
        return null;
    }

    public final void d(IY iy) {
        this.f15962d.add(iy);
    }

    public final void e(C3064jZ c3064jZ) {
        this.f15961c.add(c3064jZ);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3228l00
    public final String toString() {
        List list = this.f15961c;
        return AbstractC3228l00.a(this.f24245a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f15962d.toArray());
    }
}
