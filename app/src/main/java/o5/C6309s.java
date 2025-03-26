package o5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;

/* renamed from: o5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6309s extends DialogInterfaceOnCancelListenerC0906e {
    public static DialogInterfaceOnCancelListenerC0906e u2() {
        return new C6309s();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        final AbstractActivityC0911j J12 = J1();
        return new AlertDialog.Builder(J12).setTitle(M2.f34026Z1).setIcon(G2.f33459g).setMessage(M2.f34018Y1).setNegativeButton(M2.f33906K1, (DialogInterface.OnClickListener) null).setPositiveButton(M2.f33914L1, new DialogInterface.OnClickListener() { // from class: o5.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AbstractC5625q.u(J12);
            }
        }).setCancelable(true).create();
    }
}
