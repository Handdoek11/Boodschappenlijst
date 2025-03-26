package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class V extends DialogInterfaceOnCancelListenerC0906e {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(DialogInterface dialogInterface, int i8) {
        P1.S(p());
    }

    public static DialogInterfaceOnCancelListenerC0906e u2() {
        return new V();
    }

    public static boolean v2(Context context, androidx.fragment.app.w wVar) {
        A2 a22 = A2.f33140n0;
        boolean W7 = a22.W();
        if (W7) {
            a22.N0();
            w2(wVar);
        }
        return W7;
    }

    private static void w2(androidx.fragment.app.w wVar) {
        u2().r2(wVar, "unused");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(L1()).setTitle(M2.f33972S3).setMessage(M2.f33964R3).setPositiveButton(M2.f33956Q3, (DialogInterface.OnClickListener) null).setNeutralButton(M2.f33980T3, new DialogInterface.OnClickListener() { // from class: o5.U
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39914o.t2(dialogInterface, i8);
            }
        }).setCancelable(true).create();
    }
}
