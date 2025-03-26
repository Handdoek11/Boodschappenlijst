package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2847hY implements InterfaceC1541Ma {
    public static final Parcelable.Creator<C2847hY> CREATOR = new C2519eX();

    /* renamed from: o, reason: collision with root package name */
    public final String f22560o;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f22561s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22562t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22563u;

    /* synthetic */ C2847hY(Parcel parcel, FX fx) {
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f22560o = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.f22561s = createByteArray;
        this.f22562t = parcel.readInt();
        int readInt = parcel.readInt();
        this.f22563u = readInt;
        a(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r6, byte[] r7, int r8) {
        /*
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L35;
                case -1555642602: goto L2b;
                case 101820674: goto L21;
                case 188404399: goto L17;
                case 1805012160: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "editable.tracks.map"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r2
            goto L40
        L17:
            java.lang.String r0 = "editable.tracks.offset"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r4
            goto L40
        L21:
            java.lang.String r0 = "editable.tracks.length"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r1
            goto L40
        L2b:
            java.lang.String r0 = "editable.tracks.samples.location"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r3
            goto L40
        L35:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r5
            goto L40
        L3f:
            r6 = -1
        L40:
            if (r6 == 0) goto L75
            if (r6 == r4) goto L66
            if (r6 == r1) goto L66
            if (r6 == r2) goto L5e
            if (r6 == r3) goto L4b
            return
        L4b:
            r6 = 75
            if (r8 != r6) goto L59
            int r6 = r7.length
            if (r6 != r4) goto L59
            r6 = r7[r5]
            if (r6 == 0) goto L5a
            if (r6 != r4) goto L59
            goto L5a
        L59:
            r4 = r5
        L5a:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r4)
            return
        L5e:
            if (r8 != 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r4)
            return
        L66:
            r6 = 78
            if (r8 != r6) goto L70
            int r6 = r7.length
            r7 = 8
            if (r6 != r7) goto L70
            goto L71
        L70:
            r4 = r5
        L71:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r4)
            return
        L75:
            r6 = 23
            if (r8 != r6) goto L7d
            int r6 = r7.length
            if (r6 != r3) goto L7d
            goto L7e
        L7d:
            r4 = r5
        L7e:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2847hY.a(java.lang.String, byte[], int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final /* synthetic */ void I(G8 g8) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2847hY.class == obj.getClass()) {
            C2847hY c2847hY = (C2847hY) obj;
            if (this.f22560o.equals(c2847hY.f22560o) && Arrays.equals(this.f22561s, c2847hY.f22561s) && this.f22562t == c2847hY.f22562t && this.f22563u == c2847hY.f22563u) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22560o.hashCode() + 527) * 31) + Arrays.hashCode(this.f22561s)) * 31) + this.f22562t) * 31) + this.f22563u;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.f22563u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L53
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto L9e
        L1a:
            byte[] r0 = r5.f22561s
            com.google.android.gms.internal.ads.UQ r1 = new com.google.android.gms.internal.ads.UQ
            r1.<init>(r0)
            long r0 = r1.M()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L2b:
            byte[] r0 = r5.f22561s
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L37:
            byte[] r0 = r5.f22561s
            int r0 = com.google.android.gms.internal.ads.AbstractC1943Xi0.d(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L43:
            byte[] r0 = r5.f22561s
            int r0 = com.google.android.gms.internal.ads.AbstractC1943Xi0.d(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L53:
            byte[] r0 = r5.f22561s
            java.lang.String r0 = com.google.android.gms.internal.ads.AbstractC2301cW.b(r0)
            goto Lcb
        L5a:
            java.lang.String r0 = r5.f22560o
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r5.f22560o
            boolean r0 = r0.equals(r3)
            java.lang.String r3 = "Metadata is not an editable tracks map"
            com.google.android.gms.internal.ads.AbstractC3796qC.g(r0, r3)
            byte[] r0 = r5.f22561s
            r0 = r0[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L78:
            if (r1 >= r0) goto L8a
            byte[] r3 = r5.f22561s
            int r4 = r1 + 2
            r3 = r3[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L78
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "track types = "
            r0.append(r1)
            java.lang.String r1 = ","
            com.google.android.gms.internal.ads.AbstractC1483Kf0.b(r0, r2, r1)
            java.lang.String r0 = r0.toString()
            goto Lcb
        L9e:
            byte[] r0 = r5.f22561s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        La7:
            int r3 = r0.length
            if (r1 >= r3) goto Lc7
            r3 = r0[r1]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            r3 = r0[r1]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            int r1 = r1 + 1
            goto La7
        Lc7:
            java.lang.String r0 = r2.toString()
        Lcb:
            java.lang.String r1 = r5.f22560o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mdta: key="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2847hY.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f22560o);
        parcel.writeByteArray(this.f22561s);
        parcel.writeInt(this.f22562t);
        parcel.writeInt(this.f22563u);
    }

    public C2847hY(String str, byte[] bArr, int i8, int i9) {
        a(str, bArr, i9);
        this.f22560o = str;
        this.f22561s = bArr;
        this.f22562t = i8;
        this.f22563u = i9;
    }
}
