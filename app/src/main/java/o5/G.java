package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0835d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;

/* loaded from: classes2.dex */
public class G extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("emailNagYes");
        AbstractC5625q.u(p());
    }

    public static void w2(AbstractActivityC0835d abstractActivityC0835d) {
        new G().r2(abstractActivityC0835d.getSupportFragmentManager(), "unused");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(L1()).setIcon(G2.f33459g).setTitle(M2.f33858E1).setMessage(M2.f33850D1).setNegativeButton(M2.f33842C1, new DialogInterface.OnClickListener() { // from class: o5.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AbstractC5673x.a("emailNagNo");
            }
        }).setPositiveButton(M2.f33866F1, new DialogInterface.OnClickListener() { // from class: o5.F
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39884o.v2(dialogInterface, i8);
            }
        }).create();
    }
}
