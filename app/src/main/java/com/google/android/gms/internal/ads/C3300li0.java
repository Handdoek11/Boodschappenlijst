package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.li0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3300li0 extends AbstractC4714yh0 {

    /* renamed from: y, reason: collision with root package name */
    private static final Object[] f24372y;

    /* renamed from: z, reason: collision with root package name */
    static final C3300li0 f24373z;

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f24374t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f24375u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f24376v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f24377w;

    /* renamed from: x, reason: collision with root package name */
    private final transient int f24378x;

    static {
        Object[] objArr = new Object[0];
        f24372y = objArr;
        f24373z = new C3300li0(objArr, 0, objArr, 0, 0);
    }

    C3300li0(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f24374t = objArr;
        this.f24375u = i8;
        this.f24376v = objArr2;
        this.f24377w = i9;
        this.f24378x = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0
    final boolean J() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f24374t, 0, objArr, i8, this.f24378x);
        return i8 + this.f24378x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int c() {
        return this.f24378x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f24376v;
            if (objArr.length != 0) {
                int b8 = AbstractC3298lh0.b(obj);
                while (true) {
                    int i8 = b8 & this.f24377w;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b8 = i8 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f24375u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0, com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4825zi0 j() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    final Object[] o() {
        return this.f24374t;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4714yh0
    final AbstractC4169th0 q() {
        return AbstractC4169th0.r(this.f24374t, this.f24378x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24378x;
    }
}
