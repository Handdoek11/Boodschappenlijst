package y4;

import a3.AbstractC0813a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6955j extends AbstractC0813a {
    public static final Parcelable.Creator<C6955j> CREATOR = new C6956k();

    /* renamed from: o, reason: collision with root package name */
    private final Uri f44594o;

    /* renamed from: s, reason: collision with root package name */
    private final Uri f44595s;

    /* renamed from: t, reason: collision with root package name */
    private final List f44596t;

    /* renamed from: y4.j$a */
    public static class a extends AbstractC0813a {
        public static final Parcelable.Creator<a> CREATOR = new C6957l();

        /* renamed from: o, reason: collision with root package name */
        private final String f44597o;

        public a(String str) {
            this.f44597o = str;
        }

        public String A0() {
            return this.f44597o;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            C6957l.c(this, parcel, i8);
        }
    }

    public C6955j(Uri uri, Uri uri2, List list) {
        this.f44594o = uri;
        this.f44595s = uri2;
        this.f44596t = list == null ? new ArrayList() : list;
    }

    public Uri A0() {
        return this.f44595s;
    }

    public Uri B0() {
        return this.f44594o;
    }

    public List C0() {
        return this.f44596t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        C6956k.c(this, parcel, i8);
    }
}
