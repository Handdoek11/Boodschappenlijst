package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0904c implements Parcelable {
    public static final Parcelable.Creator<C0904c> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    final List f10022o;

    /* renamed from: s, reason: collision with root package name */
    final List f10023s;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0904c createFromParcel(Parcel parcel) {
            return new C0904c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0904c[] newArray(int i8) {
            return new C0904c[i8];
        }
    }

    C0904c(Parcel parcel) {
        this.f10022o = parcel.createStringArrayList();
        this.f10023s = parcel.createTypedArrayList(C0903b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f10022o);
        parcel.writeTypedList(this.f10023s);
    }
}
