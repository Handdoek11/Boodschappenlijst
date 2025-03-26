package t;

import J6.AbstractC0650j;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y extends G implements Parcelable {

    /* renamed from: u, reason: collision with root package name */
    public static final b f43788u = new b(null);
    public static final Parcelable.Creator<y> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
            H c8;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                c8 = I.c();
            } else if (readInt == 1) {
                c8 = I.e();
            } else {
                if (readInt != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
                }
                c8 = I.d();
            }
            return new y(readValue, c8);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i8) {
            return new y[i8];
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    public y(Object obj, H h8) {
        super(obj, h8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9;
        parcel.writeValue(getValue());
        H d8 = d();
        if (J6.r.a(d8, I.c())) {
            i9 = 0;
        } else if (J6.r.a(d8, I.e())) {
            i9 = 1;
        } else {
            if (!J6.r.a(d8, I.d())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i9 = 2;
        }
        parcel.writeInt(i9);
    }
}
