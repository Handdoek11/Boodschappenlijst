package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class h0 extends DialogInterfaceOnCancelListenerC0906e {

    public interface a {
        void w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(String str, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a(str + "UpgradeDialogLater");
        LayoutInflater.Factory p8 = p();
        if (p8 instanceof a) {
            ((a) p8).w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(String str, String str2, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a(str + "UpgradeDialogUpgrade");
        P1.U(p(), str2);
    }

    private static DialogInterfaceOnCancelListenerC0906e w2(String str, String str2, String str3) {
        h0 h0Var = new h0();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putString("analyticsPrefix", str2);
        bundle.putString("campaign", str3);
        h0Var.R1(bundle);
        return h0Var;
    }

    public static DialogInterfaceOnCancelListenerC0906e x2(Context context) {
        String string = context.getString(M2.f33927M6);
        C5587k6.d Q7 = OurApplication.f34286H.o().Q();
        if (Q7 != null) {
            string = string + "\n\n" + context.getString(M2.f33919L6, Integer.valueOf(Q7.f34869a), Q7.f34870b);
        }
        return w2(string, "upgrade", "upgrade_nag");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        String string = K1().getString("message");
        final String string2 = K1().getString("analyticsPrefix");
        final String string3 = K1().getString("campaign");
        AbstractC5673x.a(string2 + "UpgradeDialog");
        AlertDialog create = new AlertDialog.Builder(L1()).setIcon(G2.f33459g).setMessage(string).setNegativeButton(M2.f33962R1, new DialogInterface.OnClickListener() { // from class: o5.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39943o.u2(string2, dialogInterface, i8);
            }
        }).setPositiveButton(M2.f33970S1, new DialogInterface.OnClickListener() { // from class: o5.g0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39946o.v2(string2, string3, dialogInterface, i8);
            }
        }).setCancelable(true).create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }
}
