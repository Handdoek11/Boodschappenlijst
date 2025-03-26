package C3;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0443m extends AbstractC0813a {
    public static final Parcelable.Creator<C0443m> CREATOR = new C0472w();

    /* renamed from: o, reason: collision with root package name */
    private final String f1005o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f1006s;

    public C0443m(String str, boolean z7) {
        this.f1005o = str;
        this.f1006s = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0443m)) {
            return false;
        }
        C0443m c0443m = (C0443m) obj;
        return this.f1005o.equals(c0443m.f1005o) && this.f1006s == c0443m.f1006s;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f1005o, Boolean.valueOf(this.f1006s));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1005o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.c(parcel, 2, this.f1006s);
        AbstractC0814b.b(parcel, a8);
    }
}
