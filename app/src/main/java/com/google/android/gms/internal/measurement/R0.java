package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C1445Je;
import i3.InterfaceC5852a;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class R0 extends AbstractBinderC4870b0 implements O0 {
    public R0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static O0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof O0 ? (O0) queryLocalInterface : new Q0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4870b0
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        T0 v02;
        T0 t02 = null;
        T0 t03 = null;
        T0 t04 = null;
        T0 t05 = null;
        U0 u02 = null;
        U0 u03 = null;
        U0 u04 = null;
        T0 t06 = null;
        T0 t07 = null;
        T0 t08 = null;
        T0 t09 = null;
        T0 t010 = null;
        T0 t011 = null;
        Z0 z02 = null;
        T0 t012 = null;
        T0 t013 = null;
        T0 t014 = null;
        T0 t015 = null;
        switch (i8) {
            case 1:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                C4871b1 c4871b1 = (C4871b1) AbstractC4861a0.a(parcel, C4871b1.CREATOR);
                long readLong = parcel.readLong();
                AbstractC4861a0.f(parcel);
                initialize(D02, c4871b1, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                boolean h8 = AbstractC4861a0.h(parcel);
                boolean h9 = AbstractC4861a0.h(parcel);
                long readLong2 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                logEvent(readString, readString2, bundle, h8, h9, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    v02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v02 = queryLocalInterface instanceof T0 ? (T0) queryLocalInterface : new V0(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, v02, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                boolean h10 = AbstractC4861a0.h(parcel);
                long readLong4 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setUserProperty(readString5, readString6, D03, h10, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h11 = AbstractC4861a0.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t02 = queryLocalInterface2 instanceof T0 ? (T0) queryLocalInterface2 : new V0(readStrongBinder2);
                }
                AbstractC4861a0.f(parcel);
                getUserProperties(readString7, readString8, h11, t02);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t015 = queryLocalInterface3 instanceof T0 ? (T0) queryLocalInterface3 : new V0(readStrongBinder3);
                }
                AbstractC4861a0.f(parcel);
                getMaxUserProperties(readString9, t015);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                AbstractC4861a0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t014 = queryLocalInterface4 instanceof T0 ? (T0) queryLocalInterface4 : new V0(readStrongBinder4);
                }
                AbstractC4861a0.f(parcel);
                getConditionalUserProperties(readString13, readString14, t014);
                break;
            case 11:
                boolean h12 = AbstractC4861a0.h(parcel);
                long readLong7 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setMeasurementEnabled(h12, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setCurrentScreen(D04, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t013 = queryLocalInterface5 instanceof T0 ? (T0) queryLocalInterface5 : new V0(readStrongBinder5);
                }
                AbstractC4861a0.f(parcel);
                getCurrentScreenName(t013);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t012 = queryLocalInterface6 instanceof T0 ? (T0) queryLocalInterface6 : new V0(readStrongBinder6);
                }
                AbstractC4861a0.f(parcel);
                getCurrentScreenClass(t012);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    z02 = queryLocalInterface7 instanceof Z0 ? (Z0) queryLocalInterface7 : new Y0(readStrongBinder7);
                }
                AbstractC4861a0.f(parcel);
                setInstanceIdProvider(z02);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t011 = queryLocalInterface8 instanceof T0 ? (T0) queryLocalInterface8 : new V0(readStrongBinder8);
                }
                AbstractC4861a0.f(parcel);
                getCachedAppInstanceId(t011);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t010 = queryLocalInterface9 instanceof T0 ? (T0) queryLocalInterface9 : new V0(readStrongBinder9);
                }
                AbstractC4861a0.f(parcel);
                getAppInstanceId(t010);
                break;
            case C1445Je.zzm /* 21 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t09 = queryLocalInterface10 instanceof T0 ? (T0) queryLocalInterface10 : new V0(readStrongBinder10);
                }
                AbstractC4861a0.f(parcel);
                getGmpAppId(t09);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t08 = queryLocalInterface11 instanceof T0 ? (T0) queryLocalInterface11 : new V0(readStrongBinder11);
                }
                AbstractC4861a0.f(parcel);
                generateEventId(t08);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityStarted(D05, readLong14);
                break;
            case 26:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityStopped(D06, readLong15);
                break;
            case 27:
                InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityCreated(D07, bundle5, readLong16);
                break;
            case 28:
                InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityDestroyed(D08, readLong17);
                break;
            case 29:
                InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityPaused(D09, readLong18);
                break;
            case 30:
                InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivityResumed(D010, readLong19);
                break;
            case 31:
                InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t07 = queryLocalInterface12 instanceof T0 ? (T0) queryLocalInterface12 : new V0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                onActivitySaveInstanceState(D011, t07, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t06 = queryLocalInterface13 instanceof T0 ? (T0) queryLocalInterface13 : new V0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                performAction(bundle6, t06, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC5852a D012 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D013 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D014 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC4861a0.f(parcel);
                logHealthData(readInt, readString19, D012, D013, D014);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u04 = queryLocalInterface14 instanceof U0 ? (U0) queryLocalInterface14 : new W0(readStrongBinder14);
                }
                AbstractC4861a0.f(parcel);
                setEventInterceptor(u04);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u03 = queryLocalInterface15 instanceof U0 ? (U0) queryLocalInterface15 : new W0(readStrongBinder15);
                }
                AbstractC4861a0.f(parcel);
                registerOnMeasurementEventListener(u03);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    u02 = queryLocalInterface16 instanceof U0 ? (U0) queryLocalInterface16 : new W0(readStrongBinder16);
                }
                AbstractC4861a0.f(parcel);
                unregisterOnMeasurementEventListener(u02);
                break;
            case 37:
                HashMap b8 = AbstractC4861a0.b(parcel);
                AbstractC4861a0.f(parcel);
                initForTests(b8);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t05 = queryLocalInterface17 instanceof T0 ? (T0) queryLocalInterface17 : new V0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC4861a0.f(parcel);
                getTestFlag(t05, readInt2);
                break;
            case 39:
                boolean h13 = AbstractC4861a0.h(parcel);
                AbstractC4861a0.f(parcel);
                setDataCollectionEnabled(h13);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t04 = queryLocalInterface18 instanceof T0 ? (T0) queryLocalInterface18 : new V0(readStrongBinder18);
                }
                AbstractC4861a0.f(parcel);
                isDataCollectionEnabled(t04);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                AbstractC4861a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC4861a0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    t03 = queryLocalInterface19 instanceof T0 ? (T0) queryLocalInterface19 : new V0(readStrongBinder19);
                }
                AbstractC4861a0.f(parcel);
                getSessionId(t03);
                break;
            case 48:
                Intent intent = (Intent) AbstractC4861a0.a(parcel, Intent.CREATOR);
                AbstractC4861a0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
