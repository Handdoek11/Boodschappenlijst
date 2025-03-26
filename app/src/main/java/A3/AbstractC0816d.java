package a3;

import Z2.r;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0816d {
    public static InterfaceC0815c a(byte[] bArr, Parcelable.Creator creator) {
        r.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        InterfaceC0815c interfaceC0815c = (InterfaceC0815c) creator.createFromParcel(obtain);
        obtain.recycle();
        return interfaceC0815c;
    }

    public static InterfaceC0815c b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }
}
