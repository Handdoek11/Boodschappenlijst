package F0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    private final Parcelable f2228o;

    /* renamed from: s, reason: collision with root package name */
    public static final a f2227s = new C0034a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: F0.a$a, reason: collision with other inner class name */
    class C0034a extends a {
        C0034a() {
            super((C0034a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2227s;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* synthetic */ a(C0034a c0034a) {
        this();
    }

    public final Parcelable a() {
        return this.f2228o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f2228o, i8);
    }

    private a() {
        this.f2228o = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2228o = parcelable == f2227s ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2228o = readParcelable == null ? f2227s : readParcelable;
    }
}
