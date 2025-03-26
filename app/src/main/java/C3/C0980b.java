package c3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0980b extends AbstractC0813a {
    public static final Parcelable.Creator<C0980b> CREATOR = new C0987i();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f12111o;

    /* renamed from: s, reason: collision with root package name */
    private final int f12112s;

    public C0980b(boolean z7, int i8) {
        this.f12111o = z7;
        this.f12112s = i8;
    }

    public boolean A0() {
        return this.f12111o;
    }

    public int B0() {
        return this.f12112s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, A0());
        AbstractC0814b.m(parcel, 2, B0());
        AbstractC0814b.b(parcel, a8);
    }
}
