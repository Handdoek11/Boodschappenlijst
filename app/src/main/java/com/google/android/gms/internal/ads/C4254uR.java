package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4254uR {

    /* renamed from: c, reason: collision with root package name */
    public static final C4254uR f27056c = new C4254uR(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f27057a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27058b;

    static {
        new C4254uR(0, 0);
    }

    public C4254uR(int i8, int i9) {
        boolean z7 = false;
        if ((i8 == -1 || i8 >= 0) && (i9 == -1 || i9 >= 0)) {
            z7 = true;
        }
        AbstractC3796qC.d(z7);
        this.f27057a = i8;
        this.f27058b = i9;
    }

    public final int a() {
        return this.f27058b;
    }

    public final int b() {
        return this.f27057a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4254uR) {
            C4254uR c4254uR = (C4254uR) obj;
            if (this.f27057a == c4254uR.f27057a && this.f27058b == c4254uR.f27058b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f27057a;
        return ((i8 >>> 16) | (i8 << 16)) ^ this.f27058b;
    }

    public final String toString() {
        return this.f27057a + "x" + this.f27058b;
    }
}
