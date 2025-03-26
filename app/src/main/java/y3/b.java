package y3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class b extends AbstractC0813a implements W2.f {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: o, reason: collision with root package name */
    final int f44565o;

    /* renamed from: s, reason: collision with root package name */
    private int f44566s;

    /* renamed from: t, reason: collision with root package name */
    private Intent f44567t;

    b(int i8, int i9, Intent intent) {
        this.f44565o = i8;
        this.f44566s = i9;
        this.f44567t = intent;
    }

    @Override // W2.f
    public final Status m0() {
        return this.f44566s == 0 ? Status.f13219w : Status.f13215A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f44565o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f44566s);
        AbstractC0814b.r(parcel, 3, this.f44567t, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
