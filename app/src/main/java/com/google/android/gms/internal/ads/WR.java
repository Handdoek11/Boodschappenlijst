package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class WR {

    /* renamed from: b, reason: collision with root package name */
    public static final WR f19788b = new WR(0, 0, 1, 1, 0, null);

    /* renamed from: a, reason: collision with root package name */
    private C1706Qq f19789a;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    /* synthetic */ WR(int i8, int i9, int i10, int i11, int i12, AbstractC4235uE abstractC4235uE) {
    }

    public final C1706Qq a() {
        if (this.f19789a == null) {
            this.f19789a = new C1706Qq(this, null);
        }
        return this.f19789a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WR.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
