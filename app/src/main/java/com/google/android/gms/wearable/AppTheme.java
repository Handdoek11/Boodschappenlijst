package com.google.android.gms.wearable;

import B3.H;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public class AppTheme extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new H();

    /* renamed from: o, reason: collision with root package name */
    private final int f31316o;

    /* renamed from: s, reason: collision with root package name */
    private final int f31317s;

    /* renamed from: t, reason: collision with root package name */
    private final int f31318t;

    /* renamed from: u, reason: collision with root package name */
    private final int f31319u;

    public AppTheme(int i8, int i9, int i10, int i11) {
        this.f31316o = i8;
        this.f31317s = i9;
        this.f31318t = i10;
        this.f31319u = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.f31317s == appTheme.f31317s && this.f31316o == appTheme.f31316o && this.f31318t == appTheme.f31318t && this.f31319u == appTheme.f31319u;
    }

    public final int hashCode() {
        return (((((this.f31317s * 31) + this.f31316o) * 31) + this.f31318t) * 31) + this.f31319u;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.f31317s + ", colorTheme =" + this.f31316o + ", screenAlignment =" + this.f31318t + ", screenItemsSize =" + this.f31319u + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f31316o;
        if (i9 == 0) {
            i9 = 1;
        }
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        int i10 = this.f31317s;
        if (i10 == 0) {
            i10 = 1;
        }
        AbstractC0814b.m(parcel, 2, i10);
        int i11 = this.f31318t;
        AbstractC0814b.m(parcel, 3, i11 != 0 ? i11 : 1);
        int i12 = this.f31319u;
        AbstractC0814b.m(parcel, 4, i12 != 0 ? i12 : 3);
        AbstractC0814b.b(parcel, a8);
    }
}
