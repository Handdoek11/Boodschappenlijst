package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q1 extends AbstractC0813a {
    public static final Parcelable.Creator<Q1> CREATOR = new R1();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1156o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1157s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1158t;

    public Q1(w2.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f1156o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 2, z7);
        AbstractC0814b.c(parcel, 3, this.f1157s);
        AbstractC0814b.c(parcel, 4, this.f1158t);
        AbstractC0814b.b(parcel, a8);
    }

    public Q1(boolean z7, boolean z8, boolean z9) {
        this.f1156o = z7;
        this.f1157s = z8;
        this.f1158t = z9;
    }
}
