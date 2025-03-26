package Z2;

import Z2.InterfaceC0772k;
import a3.AbstractC0813a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.Scope;

/* renamed from: Z2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0768g extends AbstractC0813a {
    public static final Parcelable.Creator<C0768g> CREATOR = new m0();

    /* renamed from: F, reason: collision with root package name */
    static final Scope[] f6338F = new Scope[0];

    /* renamed from: G, reason: collision with root package name */
    static final C1105d[] f6339G = new C1105d[0];

    /* renamed from: A, reason: collision with root package name */
    C1105d[] f6340A;

    /* renamed from: B, reason: collision with root package name */
    final boolean f6341B;

    /* renamed from: C, reason: collision with root package name */
    final int f6342C;

    /* renamed from: D, reason: collision with root package name */
    boolean f6343D;

    /* renamed from: E, reason: collision with root package name */
    private final String f6344E;

    /* renamed from: o, reason: collision with root package name */
    final int f6345o;

    /* renamed from: s, reason: collision with root package name */
    final int f6346s;

    /* renamed from: t, reason: collision with root package name */
    final int f6347t;

    /* renamed from: u, reason: collision with root package name */
    String f6348u;

    /* renamed from: v, reason: collision with root package name */
    IBinder f6349v;

    /* renamed from: w, reason: collision with root package name */
    Scope[] f6350w;

    /* renamed from: x, reason: collision with root package name */
    Bundle f6351x;

    /* renamed from: y, reason: collision with root package name */
    Account f6352y;

    /* renamed from: z, reason: collision with root package name */
    C1105d[] f6353z;

    C0768g(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1105d[] c1105dArr, C1105d[] c1105dArr2, boolean z7, int i11, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f6338F : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1105dArr = c1105dArr == null ? f6339G : c1105dArr;
        c1105dArr2 = c1105dArr2 == null ? f6339G : c1105dArr2;
        this.f6345o = i8;
        this.f6346s = i9;
        this.f6347t = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f6348u = "com.google.android.gms";
        } else {
            this.f6348u = str;
        }
        if (i8 < 2) {
            this.f6352y = iBinder != null ? AbstractBinderC0762a.J0(InterfaceC0772k.a.D0(iBinder)) : null;
        } else {
            this.f6349v = iBinder;
            this.f6352y = account;
        }
        this.f6350w = scopeArr;
        this.f6351x = bundle;
        this.f6353z = c1105dArr;
        this.f6340A = c1105dArr2;
        this.f6341B = z7;
        this.f6342C = i11;
        this.f6343D = z8;
        this.f6344E = str2;
    }

    public final String A0() {
        return this.f6344E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        m0.a(this, parcel, i8);
    }
}
