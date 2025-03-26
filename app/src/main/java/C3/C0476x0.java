package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: C3.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0476x0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0476x0> CREATOR = new C0479y0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1058o;

    /* renamed from: s, reason: collision with root package name */
    public final ConnectionConfiguration[] f1059s;

    public C0476x0(int i8, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f1058o = i8;
        this.f1059s = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1058o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.v(parcel, 3, this.f1059s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
