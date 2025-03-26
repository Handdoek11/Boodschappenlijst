package H2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends AbstractC0813a {
    public static final Parcelable.Creator<a> CREATOR = new y();

    /* renamed from: o, reason: collision with root package name */
    public String f2914o;

    /* renamed from: s, reason: collision with root package name */
    public int f2915s;

    /* renamed from: t, reason: collision with root package name */
    public int f2916t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2917u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2918v;

    public a(int i8, int i9, boolean z7) {
        this(i8, i9, z7, false, false);
    }

    public static a A0() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, this.f2914o, false);
        AbstractC0814b.m(parcel, 3, this.f2915s);
        AbstractC0814b.m(parcel, 4, this.f2916t);
        AbstractC0814b.c(parcel, 5, this.f2917u);
        AbstractC0814b.c(parcel, 6, this.f2918v);
        AbstractC0814b.b(parcel, a8);
    }

    public a(int i8, int i9, boolean z7, boolean z8) {
        this(i8, i9, z7, false, z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i8, int i9, boolean z7, boolean z8, boolean z9) {
        String str;
        if (z7) {
            str = "0";
        } else {
            str = z8 ? "2" : "1";
        }
        this("afma-sdk-a-v" + i8 + "." + i9 + "." + str, i8, i9, z7, z9);
    }

    a(String str, int i8, int i9, boolean z7, boolean z8) {
        this.f2914o = str;
        this.f2915s = i8;
        this.f2916t = i9;
        this.f2917u = z7;
        this.f2918v = z8;
    }
}
