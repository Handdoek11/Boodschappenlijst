package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC4861a0;
import java.util.ArrayList;
import java.util.List;
import w3.C6886b;
import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5315e2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC6890f {
    C5315e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // w3.InterfaceC6890f
    public final String A2(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        Parcel D02 = D0(11, w02);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // w3.InterfaceC6890f
    public final void B3(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(27, w02);
    }

    @Override // w3.InterfaceC6890f
    public final List C3(String str, String str2, String str3) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        Parcel D02 = D0(17, w02);
        ArrayList createTypedArrayList = D02.createTypedArrayList(C5312e.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // w3.InterfaceC6890f
    public final List D1(String str, String str2, String str3, boolean z7) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        AbstractC4861a0.e(w02, z7);
        Parcel D02 = D0(15, w02);
        ArrayList createTypedArrayList = D02.createTypedArrayList(Y5.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // w3.InterfaceC6890f
    public final void K4(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(25, w02);
    }

    @Override // w3.InterfaceC6890f
    public final List L0(String str, String str2, M5 m52) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.d(w02, m52);
        Parcel D02 = D0(16, w02);
        ArrayList createTypedArrayList = D02.createTypedArrayList(C5312e.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // w3.InterfaceC6890f
    public final void L1(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(18, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void O1(Bundle bundle, M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        AbstractC4861a0.d(w02, m52);
        J0(19, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void P3(C5312e c5312e) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, c5312e);
        J0(13, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void Q1(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(20, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void U2(C5312e c5312e, M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, c5312e);
        AbstractC4861a0.d(w02, m52);
        J0(12, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void U6(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(6, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void V1(Y5 y52, M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, y52);
        AbstractC4861a0.d(w02, m52);
        J0(2, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void X0(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(4, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void X5(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        J0(26, w02);
    }

    @Override // w3.InterfaceC6890f
    public final C6886b Z4(M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        Parcel D02 = D0(21, w02);
        C6886b c6886b = (C6886b) AbstractC4861a0.a(D02, C6886b.CREATOR);
        D02.recycle();
        return c6886b;
    }

    @Override // w3.InterfaceC6890f
    public final List Z5(M5 m52, Bundle bundle) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, m52);
        AbstractC4861a0.d(w02, bundle);
        Parcel D02 = D0(24, w02);
        ArrayList createTypedArrayList = D02.createTypedArrayList(B5.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // w3.InterfaceC6890f
    public final byte[] a6(E e8, String str) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, e8);
        w02.writeString(str);
        Parcel D02 = D0(9, w02);
        byte[] createByteArray = D02.createByteArray();
        D02.recycle();
        return createByteArray;
    }

    @Override // w3.InterfaceC6890f
    public final void d7(E e8, M5 m52) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, e8);
        AbstractC4861a0.d(w02, m52);
        J0(1, w02);
    }

    @Override // w3.InterfaceC6890f
    public final void v3(long j8, String str, String str2, String str3) {
        Parcel w02 = w0();
        w02.writeLong(j8);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        J0(10, w02);
    }

    @Override // w3.InterfaceC6890f
    public final List y5(String str, String str2, boolean z7, M5 m52) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.e(w02, z7);
        AbstractC4861a0.d(w02, m52);
        Parcel D02 = D0(14, w02);
        ArrayList createTypedArrayList = D02.createTypedArrayList(Y5.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // w3.InterfaceC6890f
    public final void z4(E e8, String str, String str2) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, e8);
        w02.writeString(str);
        w02.writeString(str2);
        J0(5, w02);
    }
}
