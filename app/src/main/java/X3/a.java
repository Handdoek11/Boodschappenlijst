package X3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q.C6407k;

/* loaded from: classes2.dex */
public class a extends F0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0117a();

    /* renamed from: t, reason: collision with root package name */
    public final C6407k f5940t;

    /* renamed from: X3.a$a, reason: collision with other inner class name */
    class C0117a implements Parcelable.ClassLoaderCreator {
        C0117a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0117a c0117a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f5940t + "}";
    }

    @Override // F0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        int size = this.f5940t.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i9 = 0; i9 < size; i9++) {
            strArr[i9] = (String) this.f5940t.g(i9);
            bundleArr[i9] = (Bundle) this.f5940t.k(i9);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f5940t = new C6407k();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f5940t = new C6407k(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f5940t.put(strArr[i8], bundleArr[i8]);
        }
    }
}
