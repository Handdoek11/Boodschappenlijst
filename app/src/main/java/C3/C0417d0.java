package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;

/* renamed from: C3.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0417d0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0417d0> CREATOR = new C0420e0();

    /* renamed from: o, reason: collision with root package name */
    public final int f945o;

    /* renamed from: s, reason: collision with root package name */
    public final AppTheme f946s;

    public C0417d0(int i8, AppTheme appTheme) {
        this.f945o = i8;
        this.f946s = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f945o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f946s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
