package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3384mS extends AbstractC3493nS {

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray f24511h;

    /* renamed from: c, reason: collision with root package name */
    private final Context f24512c;

    /* renamed from: d, reason: collision with root package name */
    private final LB f24513d;

    /* renamed from: e, reason: collision with root package name */
    private final TelephonyManager f24514e;

    /* renamed from: f, reason: collision with root package name */
    private final C2514eS f24515f;

    /* renamed from: g, reason: collision with root package name */
    private EnumC1337Ge f24516g;

    static {
        SparseArray sparseArray = new SparseArray();
        f24511h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC4378vd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC4378vd enumC4378vd = EnumC4378vd.CONNECTING;
        sparseArray.put(ordinal, enumC4378vd);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC4378vd);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC4378vd);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC4378vd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC4378vd enumC4378vd2 = EnumC4378vd.DISCONNECTED;
        sparseArray.put(ordinal2, enumC4378vd2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC4378vd2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC4378vd2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC4378vd2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC4378vd2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC4378vd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC4378vd);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC4378vd);
    }

    C3384mS(Context context, LB lb, C2514eS c2514eS, C2080aS c2080aS, InterfaceC0611r0 interfaceC0611r0) {
        super(c2080aS, interfaceC0611r0);
        this.f24512c = context;
        this.f24513d = lb;
        this.f24515f = c2514eS;
        this.f24514e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ C3725pd b(C3384mS c3384mS, Bundle bundle) {
        EnumC3289ld enumC3289ld;
        C3180kd d02 = C3725pd.d0();
        int i8 = bundle.getInt("cnt", -2);
        int i9 = bundle.getInt("gnt", 0);
        if (i8 == -1) {
            c3384mS.f24516g = EnumC1337Ge.ENUM_TRUE;
        } else {
            c3384mS.f24516g = EnumC1337Ge.ENUM_FALSE;
            if (i8 == 0) {
                d02.D(EnumC3507nd.CELL);
            } else if (i8 != 1) {
                d02.D(EnumC3507nd.NETWORKTYPE_UNSPECIFIED);
            } else {
                d02.D(EnumC3507nd.WIFI);
            }
            switch (i9) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC3289ld = EnumC3289ld.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    enumC3289ld = EnumC3289ld.THREE_G;
                    break;
                case 13:
                    enumC3289ld = EnumC3289ld.LTE;
                    break;
                default:
                    enumC3289ld = EnumC3289ld.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            d02.C(enumC3289ld);
        }
        return (C3725pd) d02.x();
    }

    static /* bridge */ /* synthetic */ EnumC4378vd c(C3384mS c3384mS, Bundle bundle) {
        return (EnumC4378vd) f24511h.get(Y60.a(Y60.a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC4378vd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] f(C3384mS c3384mS, boolean z7, ArrayList arrayList, C3725pd c3725pd, EnumC4378vd enumC4378vd) {
        C4160td E02 = C4051sd.E0();
        E02.O(arrayList);
        E02.C(g(Settings.Global.getInt(c3384mS.f24512c.getContentResolver(), "airplane_mode_on", 0) != 0));
        E02.D(C2.v.u().f(c3384mS.f24512c, c3384mS.f24514e));
        E02.J(c3384mS.f24515f.e());
        E02.I(c3384mS.f24515f.b());
        E02.E(c3384mS.f24515f.a());
        E02.F(enumC4378vd);
        E02.G(c3725pd);
        E02.H(c3384mS.f24516g);
        E02.K(g(z7));
        E02.M(c3384mS.f24515f.d());
        E02.L(C2.v.c().a());
        E02.N(g(Settings.Global.getInt(c3384mS.f24512c.getContentResolver(), "wifi_on", 0) != 0));
        return ((C4051sd) E02.x()).m();
    }

    private static final EnumC1337Ge g(boolean z7) {
        return z7 ? EnumC1337Ge.ENUM_TRUE : EnumC1337Ge.ENUM_FALSE;
    }

    public final void e(boolean z7) {
        AbstractC2326ck0.r(this.f24513d.b(new Bundle()), new C3275lS(this, z7), AbstractC1497Kq.f16650g);
    }
}
