package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    final Bundle f9803A;

    /* renamed from: B, reason: collision with root package name */
    final boolean f9804B;

    /* renamed from: C, reason: collision with root package name */
    final int f9805C;

    /* renamed from: D, reason: collision with root package name */
    Bundle f9806D;

    /* renamed from: o, reason: collision with root package name */
    final String f9807o;

    /* renamed from: s, reason: collision with root package name */
    final String f9808s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f9809t;

    /* renamed from: u, reason: collision with root package name */
    final int f9810u;

    /* renamed from: v, reason: collision with root package name */
    final int f9811v;

    /* renamed from: w, reason: collision with root package name */
    final String f9812w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f9813x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f9814y;

    /* renamed from: z, reason: collision with root package name */
    final boolean f9815z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public B createFromParcel(Parcel parcel) {
            return new B(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public B[] newArray(int i8) {
            return new B[i8];
        }
    }

    B(Fragment fragment) {
        this.f9807o = fragment.getClass().getName();
        this.f9808s = fragment.f9908w;
        this.f9809t = fragment.f9864F;
        this.f9810u = fragment.f9873O;
        this.f9811v = fragment.f9874P;
        this.f9812w = fragment.f9875Q;
        this.f9813x = fragment.f9878T;
        this.f9814y = fragment.f9862D;
        this.f9815z = fragment.f9877S;
        this.f9803A = fragment.f9909x;
        this.f9804B = fragment.f9876R;
        this.f9805C = fragment.f9893i0.ordinal();
    }

    Fragment a(n nVar, ClassLoader classLoader) {
        Fragment a8 = nVar.a(classLoader, this.f9807o);
        Bundle bundle = this.f9803A;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a8.R1(this.f9803A);
        a8.f9908w = this.f9808s;
        a8.f9864F = this.f9809t;
        a8.f9866H = true;
        a8.f9873O = this.f9810u;
        a8.f9874P = this.f9811v;
        a8.f9875Q = this.f9812w;
        a8.f9878T = this.f9813x;
        a8.f9862D = this.f9814y;
        a8.f9877S = this.f9815z;
        a8.f9876R = this.f9804B;
        a8.f9893i0 = AbstractC0922h.b.values()[this.f9805C];
        Bundle bundle2 = this.f9806D;
        if (bundle2 != null) {
            a8.f9904s = bundle2;
        } else {
            a8.f9904s = new Bundle();
        }
        return a8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9807o);
        sb.append(" (");
        sb.append(this.f9808s);
        sb.append(")}:");
        if (this.f9809t) {
            sb.append(" fromLayout");
        }
        if (this.f9811v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9811v));
        }
        String str = this.f9812w;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9812w);
        }
        if (this.f9813x) {
            sb.append(" retainInstance");
        }
        if (this.f9814y) {
            sb.append(" removing");
        }
        if (this.f9815z) {
            sb.append(" detached");
        }
        if (this.f9804B) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9807o);
        parcel.writeString(this.f9808s);
        parcel.writeInt(this.f9809t ? 1 : 0);
        parcel.writeInt(this.f9810u);
        parcel.writeInt(this.f9811v);
        parcel.writeString(this.f9812w);
        parcel.writeInt(this.f9813x ? 1 : 0);
        parcel.writeInt(this.f9814y ? 1 : 0);
        parcel.writeInt(this.f9815z ? 1 : 0);
        parcel.writeBundle(this.f9803A);
        parcel.writeInt(this.f9804B ? 1 : 0);
        parcel.writeBundle(this.f9806D);
        parcel.writeInt(this.f9805C);
    }

    B(Parcel parcel) {
        this.f9807o = parcel.readString();
        this.f9808s = parcel.readString();
        this.f9809t = parcel.readInt() != 0;
        this.f9810u = parcel.readInt();
        this.f9811v = parcel.readInt();
        this.f9812w = parcel.readString();
        this.f9813x = parcel.readInt() != 0;
        this.f9814y = parcel.readInt() != 0;
        this.f9815z = parcel.readInt() != 0;
        this.f9803A = parcel.readBundle();
        this.f9804B = parcel.readInt() != 0;
        this.f9806D = parcel.readBundle();
        this.f9805C = parcel.readInt();
    }
}
