package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class V1 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<V1> CREATOR = new U1();

    /* renamed from: o, reason: collision with root package name */
    public final String f19511o;

    /* renamed from: s, reason: collision with root package name */
    public final String f19512s;

    protected V1(Parcel parcel) {
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f19511o = readString;
        this.f19512s = parcel.readString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(com.google.android.gms.internal.ads.G8 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f19511o
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r5
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r2) goto L58
            if (r0 == r4) goto L52
            if (r0 == r3) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.f19512s
            r7.A(r0)
            return
        L52:
            java.lang.String r0 = r6.f19512s
            r7.v(r0)
            return
        L58:
            java.lang.String r0 = r6.f19512s
            r7.w(r0)
            return
        L5e:
            java.lang.String r0 = r6.f19512s
            r7.x(r0)
            return
        L64:
            java.lang.String r0 = r6.f19512s
            r7.J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V1.I(com.google.android.gms.internal.ads.G8):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            V1 v12 = (V1) obj;
            if (this.f19511o.equals(v12.f19511o) && this.f19512s.equals(v12.f19512s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19511o.hashCode() + 527) * 31) + this.f19512s.hashCode();
    }

    public final String toString() {
        return "VC: " + this.f19511o + "=" + this.f19512s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f19511o);
        parcel.writeString(this.f19512s);
    }

    public V1(String str, String str2) {
        this.f19511o = AbstractC4710yf0.b(str);
        this.f19512s = str2;
    }
}
