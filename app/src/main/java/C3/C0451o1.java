package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: C3.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0451o1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0451o1> CREATOR = new C0448n1();

    /* renamed from: o, reason: collision with root package name */
    public final String f1018o;

    /* renamed from: s, reason: collision with root package name */
    public final DataHolder f1019s;

    public C0451o1(String str, DataHolder dataHolder) {
        this.f1018o = str;
        this.f1019s = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1018o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.r(parcel, 2, this.f1019s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
