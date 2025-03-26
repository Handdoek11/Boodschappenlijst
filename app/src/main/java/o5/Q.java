package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.M2;

/* loaded from: classes2.dex */
public class Q extends DialogInterfaceOnCancelListenerC0906e {
    public static Q u2(androidx.fragment.app.w wVar) {
        Q q8 = new Q();
        try {
            q8.r2(wVar, "unused");
            return q8;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(L1()).setIcon(G2.f33459g).setTitle(M2.f33916L3).setMessage(M2.f33908K3).setView(J2.f33671A).setNegativeButton(M2.f33906K1, new DialogInterface.OnClickListener() { // from class: o5.P
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                dialogInterface.cancel();
            }
        }).setCancelable(false).create();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        com.headcode.ourgroceries.android.O.l();
    }
}
