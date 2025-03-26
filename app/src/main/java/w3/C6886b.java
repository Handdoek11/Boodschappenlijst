package w3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6886b extends AbstractC0813a {
    public static final Parcelable.Creator<C6886b> CREATOR = new C6887c();

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f44333o;

    public C6886b(Bundle bundle) {
        this.f44333o = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.e(parcel, 1, this.f44333o, false);
        AbstractC0814b.b(parcel, a8);
    }
}
