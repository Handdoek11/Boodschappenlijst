package C3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ads.C1445Je;
import com.google.android.gms.internal.wearable.AbstractC5232b0;

/* loaded from: classes2.dex */
public abstract class X0 extends com.google.android.gms.internal.wearable.B implements Y0 {
    public X0() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.B
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                C0470v0 c0470v0 = (C0470v0) AbstractC5232b0.a(parcel, C0470v0.CREATOR);
                AbstractC5232b0.b(parcel);
                h2(c0470v0);
                break;
            case 3:
                C0477x1 c0477x1 = (C0477x1) AbstractC5232b0.a(parcel, C0477x1.CREATOR);
                AbstractC5232b0.b(parcel);
                T2(c0477x1);
                break;
            case 4:
                B0 b02 = (B0) AbstractC5232b0.a(parcel, B0.CREATOR);
                AbstractC5232b0.b(parcel);
                C2(b02);
                break;
            case 5:
                DataHolder dataHolder = (DataHolder) AbstractC5232b0.a(parcel, DataHolder.CREATOR);
                AbstractC5232b0.b(parcel);
                Z1(dataHolder);
                break;
            case 6:
                X x7 = (X) AbstractC5232b0.a(parcel, X.CREATOR);
                AbstractC5232b0.b(parcel);
                q4(x7);
                break;
            case 7:
                H1 h12 = (H1) AbstractC5232b0.a(parcel, H1.CREATOR);
                AbstractC5232b0.b(parcel);
                C5(h12);
                break;
            case 8:
                J0 j02 = (J0) AbstractC5232b0.a(parcel, J0.CREATOR);
                AbstractC5232b0.b(parcel);
                s6(j02);
                break;
            case 9:
                M0 m02 = (M0) AbstractC5232b0.a(parcel, M0.CREATOR);
                AbstractC5232b0.b(parcel);
                f6(m02);
                break;
            case 10:
                C0482z0 c0482z0 = (C0482z0) AbstractC5232b0.a(parcel, C0482z0.CREATOR);
                AbstractC5232b0.b(parcel);
                I6(c0482z0);
                break;
            case 11:
                Status status = (Status) AbstractC5232b0.a(parcel, Status.CREATOR);
                AbstractC5232b0.b(parcel);
                j4(status);
                break;
            case 12:
                L1 l12 = (L1) AbstractC5232b0.a(parcel, L1.CREATOR);
                AbstractC5232b0.b(parcel);
                k1(l12);
                break;
            case 13:
                C0476x0 c0476x0 = (C0476x0) AbstractC5232b0.a(parcel, C0476x0.CREATOR);
                AbstractC5232b0.b(parcel);
                L4(c0476x0);
                break;
            case 14:
                C0459r1 c0459r1 = (C0459r1) AbstractC5232b0.a(parcel, C0459r1.CREATOR);
                AbstractC5232b0.b(parcel);
                w3(c0459r1);
                break;
            case 15:
                C0478y c0478y = (C0478y) AbstractC5232b0.a(parcel, C0478y.CREATOR);
                AbstractC5232b0.b(parcel);
                p3(c0478y);
                break;
            case 16:
                C0478y c0478y2 = (C0478y) AbstractC5232b0.a(parcel, C0478y.CREATOR);
                AbstractC5232b0.b(parcel);
                c4(c0478y2);
                break;
            case 17:
                C0435j0 c0435j0 = (C0435j0) AbstractC5232b0.a(parcel, C0435j0.CREATOR);
                AbstractC5232b0.b(parcel);
                t4(c0435j0);
                break;
            case 18:
                C0441l0 c0441l0 = (C0441l0) AbstractC5232b0.a(parcel, C0441l0.CREATOR);
                AbstractC5232b0.b(parcel);
                X3(c0441l0);
                break;
            case 19:
                C0463t c0463t = (C0463t) AbstractC5232b0.a(parcel, C0463t.CREATOR);
                AbstractC5232b0.b(parcel);
                m6(c0463t);
                break;
            case 20:
                C0469v c0469v = (C0469v) AbstractC5232b0.a(parcel, C0469v.CREATOR);
                AbstractC5232b0.b(parcel);
                R1(c0469v);
                break;
            case C1445Je.zzm /* 21 */:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case 22:
                C0429h0 c0429h0 = (C0429h0) AbstractC5232b0.a(parcel, C0429h0.CREATOR);
                AbstractC5232b0.b(parcel);
                K1(c0429h0);
                break;
            case 23:
                C0411b0 c0411b0 = (C0411b0) AbstractC5232b0.a(parcel, C0411b0.CREATOR);
                AbstractC5232b0.b(parcel);
                r1(c0411b0);
                break;
            case 26:
                C0445m1 c0445m1 = (C0445m1) AbstractC5232b0.a(parcel, C0445m1.CREATOR);
                AbstractC5232b0.b(parcel);
                O4(c0445m1);
                break;
            case 27:
                B1 b12 = (B1) AbstractC5232b0.a(parcel, B1.CREATOR);
                AbstractC5232b0.b(parcel);
                E6(b12);
                break;
            case 28:
                C0450o0 c0450o0 = (C0450o0) AbstractC5232b0.a(parcel, C0450o0.CREATOR);
                AbstractC5232b0.b(parcel);
                S6(c0450o0);
                break;
            case 29:
                C0461s0 c0461s0 = (C0461s0) AbstractC5232b0.a(parcel, C0461s0.CREATOR);
                AbstractC5232b0.b(parcel);
                e5(c0461s0);
                break;
            case 30:
                C0456q0 c0456q0 = (C0456q0) AbstractC5232b0.a(parcel, C0456q0.CREATOR);
                AbstractC5232b0.b(parcel);
                B2(c0456q0);
                break;
            case 34:
                F1 f12 = (F1) AbstractC5232b0.a(parcel, F1.CREATOR);
                AbstractC5232b0.b(parcel);
                Q4(f12);
                break;
            case 35:
                D0 d02 = (D0) AbstractC5232b0.a(parcel, D0.CREATOR);
                AbstractC5232b0.b(parcel);
                S4(d02);
                break;
            case 36:
                C0471v1 c0471v1 = (C0471v1) AbstractC5232b0.a(parcel, C0471v1.CREATOR);
                AbstractC5232b0.b(parcel);
                g7(c0471v1);
                break;
            case 37:
                C0464t0 c0464t0 = (C0464t0) AbstractC5232b0.a(parcel, C0464t0.CREATOR);
                AbstractC5232b0.b(parcel);
                x6(c0464t0);
                break;
            case 38:
                C c8 = (C) AbstractC5232b0.a(parcel, C.CREATOR);
                AbstractC5232b0.b(parcel);
                w1(c8);
                break;
            case 39:
                O0 o02 = (O0) AbstractC5232b0.a(parcel, O0.CREATOR);
                AbstractC5232b0.b(parcel);
                J1(o02);
                break;
            case 40:
                o2 o2Var = (o2) AbstractC5232b0.a(parcel, o2.CREATOR);
                AbstractC5232b0.b(parcel);
                n4(o2Var);
                break;
            case 41:
                C0417d0 c0417d0 = (C0417d0) AbstractC5232b0.a(parcel, C0417d0.CREATOR);
                AbstractC5232b0.b(parcel);
                U3(c0417d0);
                break;
            case 42:
                C0423f0 c0423f0 = (C0423f0) AbstractC5232b0.a(parcel, C0423f0.CREATOR);
                AbstractC5232b0.b(parcel);
                g6(c0423f0);
                break;
            case 43:
                S0 s02 = (S0) AbstractC5232b0.a(parcel, S0.CREATOR);
                AbstractC5232b0.b(parcel);
                w6(s02);
                break;
            case 46:
                t2 t2Var = (t2) AbstractC5232b0.a(parcel, t2.CREATOR);
                AbstractC5232b0.b(parcel);
                f3(t2Var);
                break;
            case 47:
                Q0 q02 = (Q0) AbstractC5232b0.a(parcel, Q0.CREATOR);
                AbstractC5232b0.b(parcel);
                s4(q02);
                break;
            case 48:
                H0 h02 = (H0) AbstractC5232b0.a(parcel, H0.CREATOR);
                AbstractC5232b0.b(parcel);
                p4(h02);
                break;
            case 49:
                U0 u02 = (U0) AbstractC5232b0.a(parcel, U0.CREATOR);
                AbstractC5232b0.b(parcel);
                a3(u02);
                break;
            case 50:
                F0 f02 = (F0) AbstractC5232b0.a(parcel, F0.CREATOR);
                AbstractC5232b0.b(parcel);
                r7(f02);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
