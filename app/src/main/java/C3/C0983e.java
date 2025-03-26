package c3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0983e extends AbstractC0813a {
    public static final Parcelable.Creator<C0983e> CREATOR = new C0988j();

    /* renamed from: o, reason: collision with root package name */
    private final PendingIntent f12113o;

    public C0983e(PendingIntent pendingIntent) {
        this.f12113o = pendingIntent;
    }

    public PendingIntent A0() {
        return this.f12113o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, A0(), i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
