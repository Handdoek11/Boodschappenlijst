package y3;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e extends m3.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // m3.b
    protected final boolean p2(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                m3.c.b(parcel);
                break;
            case 4:
                m3.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                m3.c.b(parcel);
                break;
            case 7:
                m3.c.b(parcel);
                break;
            case 8:
                l lVar = (l) m3.c.a(parcel, l.CREATOR);
                m3.c.b(parcel);
                I4(lVar);
                break;
            case 9:
                m3.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
