package d;

import J6.AbstractC0650j;
import J6.r;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5694a implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    private final int f35157o;

    /* renamed from: s, reason: collision with root package name */
    private final Intent f35158s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f35156t = new b(null);
    public static final Parcelable.Creator<C5694a> CREATOR = new C0246a();

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0246a implements Parcelable.Creator {
        C0246a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5694a createFromParcel(Parcel parcel) {
            r.e(parcel, "parcel");
            return new C5694a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5694a[] newArray(int i8) {
            return new C5694a[i8];
        }
    }

    /* renamed from: d.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final String a(int i8) {
            return i8 != -1 ? i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public C5694a(int i8, Intent intent) {
        this.f35157o = i8;
        this.f35158s = intent;
    }

    public final Intent a() {
        return this.f35158s;
    }

    public final int b() {
        return this.f35157o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f35156t.a(this.f35157o) + ", data=" + this.f35158s + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        r.e(parcel, "dest");
        parcel.writeInt(this.f35157o);
        parcel.writeInt(this.f35158s == null ? 0 : 1);
        Intent intent = this.f35158s;
        if (intent != null) {
            intent.writeToParcel(parcel, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5694a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        r.e(parcel, "parcel");
    }
}
