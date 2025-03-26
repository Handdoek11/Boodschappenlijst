package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.M2;

/* loaded from: classes2.dex */
public class D extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(DialogInterface dialogInterface, int i8) {
        AbstractC5625q.t(p());
    }

    public static DialogInterfaceOnCancelListenerC0906e u2() {
        return new D();
    }

    public static void v2(androidx.fragment.app.w wVar) {
        u2().r2(wVar, "unused");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(J1()).setTitle(M2.f33834B1).setMessage(M2.f34234z1).setPositiveButton(M2.f34226y1, (DialogInterface.OnClickListener) null).setNeutralButton(M2.f33826A1, new DialogInterface.OnClickListener() { // from class: o5.C
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39883o.t2(dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
