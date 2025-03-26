package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K6 extends AbstractC0813a {
    public static final Parcelable.Creator<K6> CREATOR = new Y6();

    /* renamed from: o, reason: collision with root package name */
    private final int f41221o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41222s;

    public K6(int i8, String str) {
        this.f41221o = i8;
        this.f41222s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f41221o);
        AbstractC0814b.s(parcel, 2, this.f41222s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
