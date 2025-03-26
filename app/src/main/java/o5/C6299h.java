package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.P1;
import q5.AbstractC6635a;
import s5.EnumC6746l;

/* renamed from: o5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6299h extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u2(DialogInterface dialogInterface, int i8) {
        AbstractC5673x.c("catChgDialog", "keepPicking", null);
        A2.f33140n0.G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v2(EnumC6746l enumC6746l, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.c("catChgDialog", enumC6746l == EnumC6746l.AC_LEAVE ? "leave" : "ask", null);
        A2.f33140n0.i0(enumC6746l);
        A2.f33140n0.G0();
    }

    public static void w2(androidx.fragment.app.w wVar) {
        A2 a22 = A2.f33140n0;
        if (!a22.O() && a22.e() == EnumC6746l.AC_GUESS && a22.P() + a22.N() == 5) {
            EnumC6746l enumC6746l = a22.P() == 0 ? EnumC6746l.AC_LEAVE : EnumC6746l.AC_ASK;
            try {
                C6299h c6299h = new C6299h();
                Bundle bundle = new Bundle();
                bundle.putSerializable("askCategoryForAction", enumC6746l);
                c6299h.R1(bundle);
                c6299h.r2(wVar, "unused");
            } catch (IllegalStateException e8) {
                AbstractC6635a.f("OG-AutocatCnfDialog", "Got exception showing dialog box: " + e8);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        int i8;
        int i9;
        AbstractC5673x.a("autocatCnfDialog");
        final EnumC6746l enumC6746l = (EnumC6746l) P1.s(K1(), "askCategoryForAction", EnumC6746l.class);
        if (enumC6746l == EnumC6746l.AC_LEAVE) {
            i8 = M2.f33993V0;
            i9 = M2.f33969S0;
        } else {
            i8 = M2.f33985U0;
            i9 = M2.f33953Q0;
        }
        return new AlertDialog.Builder(J1()).setIcon(G2.f33459g).setTitle(M2.f33977T0).setMessage(i8).setNegativeButton(M2.f33961R0, new DialogInterface.OnClickListener() { // from class: o5.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C6299h.u2(dialogInterface, i10);
            }
        }).setPositiveButton(i9, new DialogInterface.OnClickListener() { // from class: o5.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C6299h.v2(enumC6746l, dialogInterface, i10);
            }
        }).setCancelable(true).create();
    }
}
