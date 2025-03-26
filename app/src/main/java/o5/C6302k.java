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
import q5.AbstractC6635a;
import s5.EnumC6746l;

/* renamed from: o5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6302k extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u2(DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("autocatDialogNo");
        A2.f33140n0.G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v2(DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("autocatDialogYes");
        A2.f33140n0.i0(EnumC6746l.AC_GUESS);
        A2.f33140n0.G0();
    }

    public static void w2(androidx.fragment.app.w wVar) {
        A2 a22 = A2.f33140n0;
        if (!a22.O() && a22.e() == EnumC6746l.AC_LEAVE && a22.P() == 5) {
            try {
                new C6302k().r2(wVar, "unused");
            } catch (IllegalStateException e8) {
                AbstractC6635a.f("OG-AutocatDialog", "Got exception showing dialog box: " + e8);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        AbstractC5673x.a("autocatDialog");
        return new AlertDialog.Builder(J1()).setIcon(G2.f33459g).setTitle(M2.f34017Y0).setMessage(M2.f34001W0).setNegativeButton(M2.f34009X0, new DialogInterface.OnClickListener() { // from class: o5.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C6302k.u2(dialogInterface, i8);
            }
        }).setPositiveButton(M2.f34025Z0, new DialogInterface.OnClickListener() { // from class: o5.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C6302k.v2(dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
