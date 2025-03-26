package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class e0 extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(String str, DialogInterface dialogInterface, int i8) {
        C5587k6.v0(B(), str);
    }

    public static DialogInterfaceOnCancelListenerC0906e u2(String str, C5587k6.e eVar) {
        e0 e0Var = new e0();
        Bundle bundle = new Bundle();
        bundle.putString("sku", str);
        bundle.putSerializable("upgradeType", eVar);
        e0Var.R1(bundle);
        return e0Var;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        Bundle K12 = K1();
        final String string = K12.getString("sku");
        return new AlertDialog.Builder(L1()).setTitle(M2.f34166q5).setIcon(G2.f33459g).setMessage(((C5587k6.e) P1.s(K12, "upgradeType", C5587k6.e.class)) == C5587k6.e.NBO ? M2.f34158p5 : M2.f34150o5).setPositiveButton(M2.f34174r5, new DialogInterface.OnClickListener() { // from class: o5.d0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39941o.t2(string, dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
