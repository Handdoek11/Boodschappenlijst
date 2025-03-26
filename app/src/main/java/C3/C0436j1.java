package C3;

import B3.InterfaceC0398q;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0436j1 extends AbstractC0813a implements InterfaceC0398q {
    public static final Parcelable.Creator<C0436j1> CREATOR = new C0439k1();

    /* renamed from: o, reason: collision with root package name */
    private final int f987o;

    /* renamed from: s, reason: collision with root package name */
    private final String f988s;

    /* renamed from: t, reason: collision with root package name */
    private final byte[] f989t;

    /* renamed from: u, reason: collision with root package name */
    private final String f990u;

    public C0436j1(int i8, String str, byte[] bArr, String str2) {
        this.f987o = i8;
        this.f988s = str;
        this.f989t = bArr;
        this.f990u = str2;
    }

    public final String A0() {
        return this.f990u;
    }

    public final byte[] getData() {
        return this.f989t;
    }

    public final String i0() {
        return this.f988s;
    }

    public final String toString() {
        byte[] bArr = this.f989t;
        Object valueOf = bArr == null ? "null" : Integer.valueOf(bArr.length);
        String str = this.f988s;
        return "MessageEventParcelable[" + this.f987o + "," + str + ", size=" + valueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, this.f987o);
        AbstractC0814b.s(parcel, 3, this.f988s, false);
        AbstractC0814b.g(parcel, 4, this.f989t, false);
        AbstractC0814b.s(parcel, 5, this.f990u, false);
        AbstractC0814b.b(parcel, a8);
    }
}
