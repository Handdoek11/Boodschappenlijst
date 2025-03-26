package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f10188o;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f10189s;

    /* renamed from: t, reason: collision with root package name */
    C0903b[] f10190t;

    /* renamed from: u, reason: collision with root package name */
    int f10191u;

    /* renamed from: v, reason: collision with root package name */
    String f10192v;

    /* renamed from: w, reason: collision with root package name */
    ArrayList f10193w;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f10194x;

    /* renamed from: y, reason: collision with root package name */
    ArrayList f10195y;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i8) {
            return new y[i8];
        }
    }

    public y() {
        this.f10192v = null;
        this.f10193w = new ArrayList();
        this.f10194x = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f10188o);
        parcel.writeStringList(this.f10189s);
        parcel.writeTypedArray(this.f10190t, i8);
        parcel.writeInt(this.f10191u);
        parcel.writeString(this.f10192v);
        parcel.writeStringList(this.f10193w);
        parcel.writeTypedList(this.f10194x);
        parcel.writeTypedList(this.f10195y);
    }

    public y(Parcel parcel) {
        this.f10192v = null;
        this.f10193w = new ArrayList();
        this.f10194x = new ArrayList();
        this.f10188o = parcel.createStringArrayList();
        this.f10189s = parcel.createStringArrayList();
        this.f10190t = (C0903b[]) parcel.createTypedArray(C0903b.CREATOR);
        this.f10191u = parcel.readInt();
        this.f10192v = parcel.readString();
        this.f10193w = parcel.createStringArrayList();
        this.f10194x = parcel.createTypedArrayList(C0904c.CREATOR);
        this.f10195y = parcel.createTypedArrayList(w.k.CREATOR);
    }
}
