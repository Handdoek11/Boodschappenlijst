package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: C3.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0470v0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0470v0> CREATOR = new C0473w0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1052o;

    /* renamed from: s, reason: collision with root package name */
    public final ConnectionConfiguration f1053s;

    public C0470v0(int i8, ConnectionConfiguration connectionConfiguration) {
        this.f1052o = i8;
        this.f1053s = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1052o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f1053s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
