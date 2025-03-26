package y4;

import a3.AbstractC0813a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6946a extends AbstractC0813a {
    public static final Parcelable.Creator<C6946a> CREATOR = new C6947b();

    /* renamed from: o, reason: collision with root package name */
    private String f44575o;

    /* renamed from: s, reason: collision with root package name */
    private String f44576s;

    /* renamed from: t, reason: collision with root package name */
    private int f44577t;

    /* renamed from: u, reason: collision with root package name */
    private long f44578u;

    /* renamed from: v, reason: collision with root package name */
    private Bundle f44579v;

    /* renamed from: w, reason: collision with root package name */
    private Uri f44580w;

    public C6946a(String str, String str2, int i8, long j8, Bundle bundle, Uri uri) {
        this.f44575o = str;
        this.f44576s = str2;
        this.f44577t = i8;
        this.f44578u = j8;
        this.f44579v = bundle;
        this.f44580w = uri;
    }

    public long A0() {
        return this.f44578u;
    }

    public String B0() {
        return this.f44576s;
    }

    public String C0() {
        return this.f44575o;
    }

    public Bundle D0() {
        Bundle bundle = this.f44579v;
        return bundle == null ? new Bundle() : bundle;
    }

    public int E0() {
        return this.f44577t;
    }

    public Uri F0() {
        return this.f44580w;
    }

    public void G0(long j8) {
        this.f44578u = j8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        C6947b.c(this, parcel, i8);
    }
}
