package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Z2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0782v extends AbstractC0813a {
    public static final Parcelable.Creator<C0782v> CREATOR = new C0786z();

    /* renamed from: o, reason: collision with root package name */
    private final int f6423o;

    /* renamed from: s, reason: collision with root package name */
    private List f6424s;

    public C0782v(int i8, List list) {
        this.f6423o = i8;
        this.f6424s = list;
    }

    public final int A0() {
        return this.f6423o;
    }

    public final List B0() {
        return this.f6424s;
    }

    public final void C0(C0776o c0776o) {
        if (this.f6424s == null) {
            this.f6424s = new ArrayList();
        }
        this.f6424s.add(c0776o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f6423o);
        AbstractC0814b.w(parcel, 2, this.f6424s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
