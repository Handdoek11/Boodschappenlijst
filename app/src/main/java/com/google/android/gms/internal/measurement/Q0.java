package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class Q0 extends Y implements O0 {
    Q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeLong(j8);
        J0(23, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.d(w02, bundle);
        J0(9, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void endAdUnitExposure(String str, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeLong(j8);
        J0(24, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void generateEventId(T0 t02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, t02);
        J0(22, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getCachedAppInstanceId(T0 t02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, t02);
        J0(19, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getConditionalUserProperties(String str, String str2, T0 t02) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.c(w02, t02);
        J0(10, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getCurrentScreenClass(T0 t02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, t02);
        J0(17, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getCurrentScreenName(T0 t02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, t02);
        J0(16, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getGmpAppId(T0 t02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, t02);
        J0(21, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getMaxUserProperties(String str, T0 t02) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC4861a0.c(w02, t02);
        J0(6, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void getUserProperties(String str, String str2, boolean z7, T0 t02) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.e(w02, z7);
        AbstractC4861a0.c(w02, t02);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void initialize(InterfaceC5852a interfaceC5852a, C4871b1 c4871b1, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        AbstractC4861a0.d(w02, c4871b1);
        w02.writeLong(j8);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.d(w02, bundle);
        AbstractC4861a0.e(w02, z7);
        AbstractC4861a0.e(w02, z8);
        w02.writeLong(j8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void logHealthData(int i8, String str, InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        AbstractC4861a0.c(w02, interfaceC5852a);
        AbstractC4861a0.c(w02, interfaceC5852a2);
        AbstractC4861a0.c(w02, interfaceC5852a3);
        J0(33, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityCreated(InterfaceC5852a interfaceC5852a, Bundle bundle, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        AbstractC4861a0.d(w02, bundle);
        w02.writeLong(j8);
        J0(27, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityDestroyed(InterfaceC5852a interfaceC5852a, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeLong(j8);
        J0(28, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityPaused(InterfaceC5852a interfaceC5852a, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeLong(j8);
        J0(29, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityResumed(InterfaceC5852a interfaceC5852a, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeLong(j8);
        J0(30, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivitySaveInstanceState(InterfaceC5852a interfaceC5852a, T0 t02, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        AbstractC4861a0.c(w02, t02);
        w02.writeLong(j8);
        J0(31, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityStarted(InterfaceC5852a interfaceC5852a, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeLong(j8);
        J0(25, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void onActivityStopped(InterfaceC5852a interfaceC5852a, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeLong(j8);
        J0(26, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void performAction(Bundle bundle, T0 t02, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        AbstractC4861a0.c(w02, t02);
        w02.writeLong(j8);
        J0(32, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void registerOnMeasurementEventListener(U0 u02) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, u02);
        J0(35, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        w02.writeLong(j8);
        J0(8, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setConsent(Bundle bundle, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        w02.writeLong(j8);
        J0(44, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setCurrentScreen(InterfaceC5852a interfaceC5852a, String str, String str2, long j8) {
        Parcel w02 = w0();
        AbstractC4861a0.c(w02, interfaceC5852a);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeLong(j8);
        J0(15, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel w02 = w0();
        AbstractC4861a0.e(w02, z7);
        J0(39, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setUserId(String str, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeLong(j8);
        J0(7, w02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public final void setUserProperty(String str, String str2, InterfaceC5852a interfaceC5852a, boolean z7, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.c(w02, interfaceC5852a);
        AbstractC4861a0.e(w02, z7);
        w02.writeLong(j8);
        J0(4, w02);
    }
}
