package w3;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C1445Je;
import com.google.android.gms.internal.measurement.AbstractBinderC4870b0;
import com.google.android.gms.internal.measurement.AbstractC4861a0;
import com.google.android.gms.measurement.internal.C5312e;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.Y5;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h extends AbstractBinderC4870b0 implements InterfaceC6890f {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4870b0
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                com.google.android.gms.measurement.internal.E e8 = (com.google.android.gms.measurement.internal.E) AbstractC4861a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                M5 m52 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                d7(e8, m52);
                parcel2.writeNoException();
                return true;
            case 2:
                Y5 y52 = (Y5) AbstractC4861a0.a(parcel, Y5.CREATOR);
                M5 m53 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                V1(y52, m53);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                M5 m54 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                X0(m54);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.E e9 = (com.google.android.gms.measurement.internal.E) AbstractC4861a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC4861a0.f(parcel);
                z4(e9, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                M5 m55 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                U6(m55);
                parcel2.writeNoException();
                return true;
            case 7:
                M5 m56 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                boolean h8 = AbstractC4861a0.h(parcel);
                AbstractC4861a0.f(parcel);
                List u62 = u6(m56, h8);
                parcel2.writeNoException();
                parcel2.writeTypedList(u62);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.E e10 = (com.google.android.gms.measurement.internal.E) AbstractC4861a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String readString3 = parcel.readString();
                AbstractC4861a0.f(parcel);
                byte[] a62 = a6(e10, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(a62);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC4861a0.f(parcel);
                v3(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                M5 m57 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                String A22 = A2(m57);
                parcel2.writeNoException();
                parcel2.writeString(A22);
                return true;
            case 12:
                C5312e c5312e = (C5312e) AbstractC4861a0.a(parcel, C5312e.CREATOR);
                M5 m58 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                U2(c5312e, m58);
                parcel2.writeNoException();
                return true;
            case 13:
                C5312e c5312e2 = (C5312e) AbstractC4861a0.a(parcel, C5312e.CREATOR);
                AbstractC4861a0.f(parcel);
                P3(c5312e2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h9 = AbstractC4861a0.h(parcel);
                M5 m59 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                List y53 = y5(readString7, readString8, h9, m59);
                parcel2.writeNoException();
                parcel2.writeTypedList(y53);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean h10 = AbstractC4861a0.h(parcel);
                AbstractC4861a0.f(parcel);
                List D12 = D1(readString9, readString10, readString11, h10);
                parcel2.writeNoException();
                parcel2.writeTypedList(D12);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                M5 m510 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                List L02 = L0(readString12, readString13, m510);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC4861a0.f(parcel);
                List C32 = C3(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(C32);
                return true;
            case 18:
                M5 m511 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                L1(m511);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                M5 m512 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                O1(bundle, m512);
                parcel2.writeNoException();
                return true;
            case 20:
                M5 m513 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                Q1(m513);
                parcel2.writeNoException();
                return true;
            case C1445Je.zzm /* 21 */:
                M5 m514 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                C6886b Z42 = Z4(m514);
                parcel2.writeNoException();
                AbstractC4861a0.g(parcel2, Z42);
                return true;
            case 24:
                M5 m515 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                AbstractC4861a0.f(parcel);
                List Z52 = Z5(m515, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(Z52);
                return true;
            case 25:
                M5 m516 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                K4(m516);
                parcel2.writeNoException();
                return true;
            case 26:
                M5 m517 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                X5(m517);
                parcel2.writeNoException();
                return true;
            case 27:
                M5 m518 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                B3(m518);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
                M5 m519 = (M5) AbstractC4861a0.a(parcel, M5.CREATOR);
                AbstractC4861a0.f(parcel);
                T0(bundle3, m519);
                parcel2.writeNoException();
                return true;
        }
    }
}
