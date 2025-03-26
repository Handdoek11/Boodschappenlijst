package C3;

import B3.InterfaceC0386e;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: C3.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0452p extends AbstractC0813a {
    public static final Parcelable.Creator<C0452p> CREATOR = new C0455q();

    /* renamed from: o, reason: collision with root package name */
    final r f1023o;

    /* renamed from: s, reason: collision with root package name */
    final int f1024s;

    /* renamed from: t, reason: collision with root package name */
    final int f1025t;

    /* renamed from: u, reason: collision with root package name */
    final int f1026u;

    public C0452p(r rVar, int i8, int i9, int i10) {
        this.f1023o = rVar;
        this.f1024s = i8;
        this.f1025t = i9;
        this.f1026u = i10;
    }

    public final void A0(InterfaceC0386e.a aVar) {
        int i8 = this.f1024s;
        if (i8 == 1) {
            aVar.b(this.f1023o);
            return;
        }
        if (i8 == 2) {
            aVar.d(this.f1023o, this.f1025t, this.f1026u);
            return;
        }
        if (i8 == 3) {
            aVar.h(this.f1023o, this.f1025t, this.f1026u);
            return;
        }
        if (i8 == 4) {
            aVar.g(this.f1023o, this.f1025t, this.f1026u);
            return;
        }
        Log.w("ChannelEventParcelable", "Unknown type: " + i8);
    }

    public final String toString() {
        int i8 = this.f1024s;
        String valueOf = String.valueOf(this.f1023o);
        String num = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? Integer.toString(i8) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i9 = this.f1025t;
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + num + ", closeReason=" + (i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? Integer.toString(i9) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.f1026u + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        r rVar = this.f1023o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, rVar, i8, false);
        AbstractC0814b.m(parcel, 3, this.f1024s);
        AbstractC0814b.m(parcel, 4, this.f1025t);
        AbstractC0814b.m(parcel, 5, this.f1026u);
        AbstractC0814b.b(parcel, a8);
    }
}
